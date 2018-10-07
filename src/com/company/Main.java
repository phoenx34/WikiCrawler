package com.company;

public class Main {

    public static void main(String[] args) {
    	/*
	    PriorityQ q = new PriorityQ();
	    q.add("Hello", 50);
        q.add("Friend", 100);
        q.add("Max", 5000);
        q.add("min", 2);
        q.add("r", 14);
        q.add("q", 432);
        q.add("f", 342);
        q.add("t", 222);
        q.add("v", 111);
        q.add("b", 333);
        q.add("n", 444);

        q.priorityArray();

        q.remove(2);
        q.priorityArray();

        System.out.println(q.returnMax());
        q.extractMax();
        q.priorityArray();
		*/
    	
    	wikiCrawler wc = new wikiCrawler("", 0, new String[0], "");
    	wc.extractLinks("<p>The dream of artificial intelligence was first thought of in Indian philosophies like those of <a href=\"/wiki/Charvaka\" title=\"Charvaka\">Charvaka</a>, a famous philosophy tradition dating back to 1500 BCE and surviving documents around 600 BCE. <a href=\"#CITEREFMcCorduck2004\">McCorduck (2004)</a> writes \"<a href=\"/wiki/Artificial_intelligence\" title=\"Artificial intelligence\">artificial intelligence</a> in one form or another is an idea that has pervaded intellectual history, a dream in urgent need of being realized,\" expressed in humanity's myths, legends, stories, speculation and clockwork <a href=\"/wiki/Automaton\" title=\"Automaton\">automatons</a>.<sup id=\"cite_ref-FOOTNOTEMcCorduck20045–35_3-0\" class=\"reference\"><a href=\"#cite_note-FOOTNOTEMcCorduck20045–35-3\">&#91;3&#93;</a></sup>\n" + 
    			"</p>");
    	
    }
}
