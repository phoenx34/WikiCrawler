package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

/**
 * Crawls Wiki pages and constructs a web graph of 200 pages
 * 
 * @author Marc Isaac
 * @author Jose Lopez
 */
public class wikiCrawler {

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
	 */
	public wikiCrawler(String seed, int max, String[] topics, String output) {
		this.seed = seed;
		this.output = output;
		this.max = max;
		this.topics = topics;
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
			} while (line != null && !line.toLowerCase().contains("</p>"));

			System.out.println(list);

		} catch (IOException e) {
			System.out.println("Shits broke Yo");
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
			String[] queue = queue();
			boolean discovered[] = new boolean[200];

			queue[0] = seed;
			discovered[0] = true;
			String x;
			int i = 0;
			while (queue[i] != null) {
				x = queue[i];

			}
		}
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
