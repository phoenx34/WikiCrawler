# WikiCrawler
Wikipedia Crawler for CS 311 Programming Assignment 01 at Iowa State University. This program will take as input a wikipedia page and crawl through each of the pages that are relevant to the original page. It uses an implementation of a Priority Queue in conjunction with BFS/DFS Graph exploration to rank and output the most relevant pages in a text file. Theoretically, the project will run in O(V+E) where the nodes consist of the pages which are relevant to the source. 

## Getting Started
Download and compile the project using a standard installation of Java. The project will work with only the standard libraries. No further dependencies will be required. 

## Usage
Run main.java to execute the crawl(focused) method. If focused = true, the program will explore related pages in BFS fashion. If focused = false, the program will use a Priority Queue to rank each page based on the number of times that page's topic is discussed in the source page. 

## Contributers
Jose Lopez and Marc Isaac


