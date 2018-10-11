package com.company;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Crawls Wiki pages and constructs a web graph of 200 pages
 *
 * @author Marc Isaac
 * @author Jose Lopez
 */
public class wikiCrawler {
    static final String BASE_URL = "http://web.cs.iastate.edu/~pavan";// "https://en.wikipedia.org";

    /**
     * related address of seed URL (within wiki domain)
     */
    private String seed;

    /**
     * string representing the filename where the web graph over discovered pages
     * are written
     */
    private String output;

    /**
     * maximum number of pages to consider
     */
    private int max;

    /**
     * array of strings representing keywords in a topic-list
     */
    private String[] topics;

    /**
     * Constructs a default WikiCrawler
     *
     * @param seed   related address of seed URL (within wiki domain)
     * @param max    maximum number of pages to consider
     * @param topics array of strings representing keywords in a topic-list
     * @param output string representing the filename where the web graph over
     *               discovered pages are written
     * @throws IOException
     */
    public wikiCrawler(String seed, int max, String[] topics, String output) {
        this.seed = seed;
        this.output = output;
        this.max = max;
        this.topics = topics;
    }

    /**
     * This uses the seed to go to the page source and turns it into a string
     *
     * @return source file as a string
     * @throws IOException
     */
    public String getDoc(String u) throws IOException {

        if (u == null)
            u = seed;

        URL url = new URL(BASE_URL + u);
        InputStream is = url.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        StringBuffer html = new StringBuffer();

        String temp;
        while ((temp = br.readLine()) != null) {
            html.append(temp);
        }

        return html.toString();
    }


    /**
     * Takes entire HTML page and returns list of strings consisting of links from
     * the document.
     *
     * - Only extract links with '/wiki/XXXX' and that appear after first
     * <p>
     * or
     * <P>
     * - Do not extract links containing characters like '#' or ':' - Order of links
     * must be same order as appearing in html document
     *
     * @param document an entire HTML document
     * @return a list of strings consisting of links from the document
     */
    public ArrayList<String> extractLinks(String document) {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new StringReader(document));

        try {
            String line = br.readLine();

            while (!line.toLowerCase().contains("<p>"))
                line = br.readLine();

            do {
                if (!line.contains("/wiki/")) {
                    line = br.readLine();
                    continue;
                }

                line = line.substring(line.indexOf("/wiki/"));
                int end = line.indexOf("\" ");

                String link = line.substring(0, end);

                if (!(link.contains("#") || link.contains(":"))) {
                    list.add(link);
                }

                line = line.substring(line.indexOf("</a>"));
            } while (line != null);

            System.out.println(list);

        } catch (IOException e) {
            System.out.println("Extracting links failed.");
        }

        /*
         * int q = document.indexOf(delimiter); int end =
         * document.indexOf("(\\/wiki\\/).+?(?=\\\")", q + 10);
         *
         * while (j >= 0) { list[count] = document.substring(end + 6, ); }
         */
        return list;
    }

    /**
     * Crawls pages from seed over first max # of pages containing every keyword in
     * Topics list
     *
     * - if !focused, explore via BFS
     *
     * - if focused = true, add pages and respective relevancy to PriorityQ where
     * priority = relevancy. ExtractMax from queue until complete
     *
     * - After crawl, edges that were explored are written to output file
     *
     * @param focused if false then explore in a BFS fashion. If true then for every
     *                page a, compute the Relevance(T,a)
     */
    public void crawl(boolean focused) {
        if (!focused) {
            ArrayList<String> queue = new ArrayList<>();
            List<String> discovered = new ArrayList<>();

            queue.add(seed);
            discovered.add(seed);
            int i = 0;
            String x;
            int count = max - 1;
            while (!queue.isEmpty() && count > 0) {
                try {
                    String linkTemp = queue.remove(i);

                    x = getDoc(linkTemp);

                    ArrayList<String> temp = extractLinks(x);

//					String[] extractedLinks = temp.toArray(new String[temp.size()]);

                    Iterator<String> index = temp.iterator();
                    while (index.hasNext()) {

                        String word = index.next();

                        if (!discovered.contains(word)) {
                            queue.add(temp.get(i));
                            discovered.add(temp.get(i));
							count--;
                        }
                        i++;
//						index.remove();
                    }
                    i = 0;
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
            System.out.println(discovered);
        } else {
            // Gets starting group of links
            ArrayList<String> links = new ArrayList<>();
            links.add(seed);
            // New priority queue to push relevancy and links
            PriorityQ queue = new PriorityQ();


            // Adds relevance for starting link.
            // Not sure if this is necessary.

            int j = 0;
            int relevance;
            int count = max - 1;
            relevance = getRelevance(seed);
            queue.add(seed, relevance);

            // Calculates relevancy of each respective page in links array list
            // Then populates a queue with each relevancy and url
            // and removes said link from the arraylist.
            // Stops when arraylist is empty.
            while (!links.isEmpty() && count > 0) {
                try {
                    String doc = links.remove(j);
                    doc = getDoc(doc);
                    ArrayList<String> temp = extractLinks(doc);
                    while (!temp.isEmpty()) {
                        relevance = getRelevance(temp.toString());
                        // Check if discovered here
                        queue.add(temp.get(j), relevance);
                        links.add(temp.get(j));
                        j++;
                    }
                    count--;
                } catch (IOException e) {

                }

                /*String doc = links.remove(j);
                String html = getDoc(doc);
                relevance = getRelevance(links.get(j));
                queue.add(links.get(j), relevance);
                links.remove(j);
                j++;
                count--;*/
            }
        }
    }

    /**
     * Takes a PriorityQ which is given from wikicrawler
     * when focused = queue and writes the data into an
     * output txt file located in the project directory.
     *
     * @param queue PriorityQ to be written
     */
    public void writeOutput(PriorityQ queue) {
        try (PrintWriter out = new PrintWriter("filename.txt")) {
            // I think this will print out the total number of pages traversed.
            // I might be wrong, this could be the max pages traversed
            // but not the actual number of pages traversed.
            out.println(max);
            while (!queue.isEmpty()) {
                out.println(queue.extractMax());
            }
        } catch (IOException e) {
            System.out.println("Writing output failed.");
        }
    }


    /**
     * Calculates the number of times a particular topic
     * appears in the document
     *
     * @param topic topic to be counted
     * @param links links to be searched against topic
     * @return count of times topic appears in links
     */
    private static int countTopic(String topic, String links) {
        int count = 0;
        for (int i = links.indexOf(topic); i >= 0;
             i = links.indexOf(topic, i + topic.length())) {
            count++;
        }

        return count;
    }

    /**
     * Calculates relevancy of a specific webpage based upon keywords in String Topics[]
     *
     * @param webpage a string containing the webpage's html.
     */
    private int getRelevance(String webpage) {
        ArrayList<String> q = extractLinks(webpage);

        String temp = q.toString();
        int count = 0;
        for (int i = 0; i < topics.length; i++) {
            if (!temp.contains(topics[i])) {
                return 0;
            }
            count += countTopic(topics[i], temp);
        }

        return count;
    }

    private String[] queue() {
        ArrayList<String> q = extractLinks(seed);
        String[] queue = new String[200];
        int i = 0;
        while (!q.isEmpty()) {
            queue[i++] = q.remove(0);
        }

        return queue;
    }
}
