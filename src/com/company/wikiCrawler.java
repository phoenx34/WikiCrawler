package com.company;

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class wikiCrawler {

    private String output, seed;
    private int max;
    private String[] topics;

    /*
    * Constructs a default WikiCrawler
    *
    * @param seed, max, topics, output
    */
    public wikiCrawler(String seed, int max, String[] topics, String output) {
        this.seed = seed;
        this.output = output;
        this.max = max;
        this.topics = topics;
    }

    /*
    * Takes entire HTML page and returns list
    * of strings consisting of links from the
    * document.
    *
    * - Only extract links with '/wiki/XXXX' and that appear after first <p> or <P>
    * - Do not extract links containing characters like '#' or ':'
    * - Order of links must be same order as appearing in html document
    */
    public ArrayList<String> extractLinks(String document) {

        ArrayList<String> list = new ArrayList<>();
        // (\/wiki\/).+?(?=") is correct regex.
        // Changed to below due to Java's stupid escape rule

        // We need to split the string so we can
        // search only the part after the first <p> or <P>
        // Do this without strings, too slow.

        /*String b[] = document.split("(?i)<p>", 2);
        String toScan = b[1];
        */
        String toScan;
        StringTokenizer tokenScan = new StringTokenizer(document);
        toScan = tokenScan.nextToken("(?i)<p>");
        toScan = tokenScan.nextToken("");

        Pattern p = Pattern.compile("\\(\\/wiki\\/\\).+?\\(?=\"\\)");
        Matcher m = p.matcher(toScan);

        while (m.find())
            list.add(m.group(0));
        return list;
    }

    /*
    * Crawls pages from seed over first max # of pages
    * containing every keyword in Topics list
    *
    * - if !focused, explore via BFS
    *
    * - if focused = true, add pages and respective relevancy to PriorityQ
    *   where priority = relevancy. ExtractMax from queue until complete
    *
    * - After crawl, edges that were explored are written to output file
    */
    public void crawl(boolean focused) {

    }


}
