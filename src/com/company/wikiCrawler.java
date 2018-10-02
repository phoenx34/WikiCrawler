package com.company;

import java.util.ArrayList;

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
        return null;
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
