package com.company;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {

//		PriorityQ q = new PriorityQ();
//		q.add("Hello", 50);
//		q.add("Friend", 100);
//		q.add("Max", 5000);
//		q.add("min", 2);
//		q.add("r", 14);
//		q.add("q", 432);
//		q.add("f", 342);
//		q.add("t", 222);
//		q.add("v", 111);
//		q.add("b", 333);
//		q.add("n", 444);
//
//		q.priorityArray();
//
//		q.remove(2);
//		q.priorityArray();
//
//		System.out.println(q.returnMax());
//		q.extractMax();
//		q.priorityArray();


		wikiCrawler wc = new wikiCrawler("/wiki/A.html", 0, new String[0], "");
		
		try {
			wc.extractLinks(wc.getDoc());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//				"<h3><span id=\"AI_in_myth.2C_fiction_and_speculation\"></span><span class=\"mw-headline\" id=\"AI_in_myth,_fiction_and_speculation\">AI in myth, fiction and speculation</span><span class=\"mw-editsection\"><span class=\"mw-editsection-bracket\">[</span><a href=\"/w/index.php?title=History_of_artificial_intelligence&amp;action=edit&amp;section=2\" title=\"Edit section: AI in myth, fiction and speculation\">edit</a><span class=\"mw-editsection-bracket\">]</span></span></h3>\n"
//						+ "<div role=\"note\" class=\"hatnote navigation-not-searchable\">Main article: <a href=\"/wiki/Artificial_intelligence_in_fiction\" title=\"Artificial intelligence in fiction\">Artificial intelligence in fiction</a></div>\n"
//						+ "<p>Mechanical men and artificial beings appear in <a href=\"/wiki/Greek_myth\" class=\"mw-redirect\" title=\"Greek myth\">Greek myths</a>, such as the golden robots of <a href=\"/wiki/Hephaestus\" title=\"Hephaestus\">Hephaestus</a> and <a href=\"/wiki/Pygmalion_(mythology)\" title=\"Pygmalion (mythology)\">Pygmalion's</a> <a href=\"/wiki/Galatea_(mythology)\" class=\"mw-redirect\" title=\"Galatea (mythology)\">Galatea</a>.<sup id=\"cite_ref-4\" class=\"reference\"><a href=\"#cite_note-4\">&#91;4&#93;</a></sup>\n"
//						+ "In the Middle Ages, there were rumors of secret mystical or <a href=\"/wiki/Alchemy\" title=\"Alchemy\">alchemical</a> means of placing mind into matter, such as <a href=\"/wiki/J%C4%81bir_ibn_Hayy%C4%81n\" class=\"mw-redirect\" title=\"Jābir ibn Hayyān\">Jābir ibn Hayyān</a>'s <i><a href=\"/wiki/Takwin\" title=\"Takwin\">Takwin</a></i>, <a href=\"/wiki/Paracelsus\" title=\"Paracelsus\">Paracelsus</a>' <a href=\"/wiki/Homunculus\" title=\"Homunculus\">homunculus</a> and <a href=\"/wiki/Judah_Loew\" class=\"mw-redirect\" title=\"Judah Loew\">Rabbi Judah Loew</a>'s <a href=\"/wiki/Golem\" title=\"Golem\">Golem</a>.<sup id=\"cite_ref-5\" class=\"reference\"><a href=\"#cite_note-5\">&#91;5&#93;</a></sup>\n"
//						+ "By the 19th century, ideas about artificial men and thinking machines were developed in fiction, as in <a href=\"/wiki/Mary_Shelley\" title=\"Mary Shelley\">Mary Shelley</a>'s <i><a href=\"/wiki/Frankenstein\" title=\"Frankenstein\">Frankenstein</a></i>  or  <a href=\"/wiki/Karel_%C4%8Capek\" title=\"Karel Čapek\">Karel Čapek</a>'s <i><a href=\"/wiki/R.U.R._(Rossum%27s_Universal_Robots)\" class=\"mw-redirect\" title=\"R.U.R. (Rossum&#39;s Universal Robots)\">R.U.R. (Rossum's Universal Robots)</a></i>,<sup id=\"cite_ref-FOOTNOTEMcCorduck200417–25_6-0\" class=\"reference\"><a href=\"#cite_note-FOOTNOTEMcCorduck200417–25-6\">&#91;6&#93;</a></sup>\n"
//						+ "and speculation, such as <a href=\"/wiki/Samuel_Butler_(novelist)\" title=\"Samuel Butler (novelist)\">Samuel Butler</a>'s \"<a href=\"/wiki/Darwin_among_the_Machines\" title=\"Darwin among the Machines\">Darwin among the Machines</a>.\"<sup id=\"cite_ref-FOOTNOTEButler1863_7-0\" class=\"reference\"><a href=\"#cite_note-FOOTNOTEButler1863-7\">&#91;7&#93;</a></sup>\n"
//						+ "AI has continued to be an important element of science fiction into the present.\n"
//						+ "</p>\n"
//						+ "<h3><span class=\"mw-headline\" id=\"Automatons\">Automatons</span><span class=\"mw-editsection\"><span class=\"mw-editsection-bracket\">[</span><a href=\"/w/index.php?title=History_of_artificial_intelligence&amp;action=edit&amp;section=3\" title=\"Edit section: Automatons\">edit</a><span class=\"mw-editsection-bracket\">]</span></span></h3>\n"
//						+ "<div role=\"note\" class=\"hatnote navigation-not-searchable\">Main article: <a href=\"/wiki/Automaton\" title=\"Automaton\">Automaton</a></div>\n"
//						+ "<div class=\"thumb tright\"><div class=\"thumbinner\" style=\"width:252px;\"><a href=\"/wiki/File:Al-jazari_robots.jpg\" class=\"image\"><img alt=\"\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/2/2f/Al-jazari_robots.jpg/250px-Al-jazari_robots.jpg\" width=\"250\" height=\"139\" class=\"thumbimage\" srcset=\"//upload.wikimedia.org/wikipedia/commons/2/2f/Al-jazari_robots.jpg 1.5x\" data-file-width=\"350\" data-file-height=\"195\" /></a>  <div class=\"thumbcaption\"><div class=\"magnify\"><a href=\"/wiki/File:Al-jazari_robots.jpg\" class=\"internal\" title=\"Enlarge\"></a></div><a href=\"/wiki/Al-Jazari\" class=\"mw-redirect\" title=\"Al-Jazari\">Al-Jazari</a>'s programmable automata (1206 CE)</div></div></div>\n"
//						+ "<p>Realistic humanoid <a href=\"/wiki/Automaton\" title=\"Automaton\">automatons</a> were built by craftsman from every civilization, including <a href=\"/wiki/King_Mu_of_Zhou#Automaton\" title=\"King Mu of Zhou\">Yan Shi</a>,<sup id=\"cite_ref-8\" class=\"reference\"><a href=\"#cite_note-8\">&#91;8&#93;</a></sup>\n"
//						+ "<a href=\"/wiki/Hero_of_Alexandria\" title=\"Hero of Alexandria\">Hero of Alexandria</a>,<sup id=\"cite_ref-9\" class=\"reference\"><a href=\"#cite_note-9\">&#91;9&#93;</a></sup>\n"
//						+ "<a href=\"/wiki/Al-Jazari\" class=\"mw-redirect\" title=\"Al-Jazari\">Al-Jazari</a><sup id=\"cite_ref-FOOTNOTENick2005_10-0\" class=\"reference\"><a href=\"#cite_note-FOOTNOTENick2005-10\">&#91;10&#93;</a></sup>\n"
//						+ ", <a href=\"/wiki/Pierre_Jaquet-Droz\" title=\"Pierre Jaquet-Droz\">Pierre Jaquet-Droz</a>,\n"
//						+ "and <a href=\"/wiki/Wolfgang_von_Kempelen\" title=\"Wolfgang von Kempelen\">Wolfgang von Kempelen</a>.<sup id=\"cite_ref-11\" class=\"reference\"><a href=\"#cite_note-11\">&#91;11&#93;</a></sup>\n"
//						+ "The oldest known automatons were the <a href=\"/wiki/Cult_image\" title=\"Cult image\">sacred statues</a> of <a href=\"/wiki/Ancient_Egypt\" title=\"Ancient Egypt\">ancient Egypt</a> and <a href=\"/wiki/Ancient_Greece\" title=\"Ancient Greece\">Greece</a>. The faithful believed that craftsman had imbued these figures with very real minds, capable of wisdom and emotion—<a href=\"/wiki/Hermes_Trismegistus\" title=\"Hermes Trismegistus\">Hermes Trismegistus</a> wrote that \"by discovering the true nature of the gods, man has been able to reproduce it.\"<sup id=\"cite_ref-12\" class=\"reference\"><a href=\"#cite_note-12\">&#91;12&#93;</a></sup><sup id=\"cite_ref-13\" class=\"reference\"><a href=\"#cite_note-13\">&#91;13&#93;</a></sup>\n"
//						+ "</p>\n"
//						+ "<h3><span class=\"mw-headline\" id=\"Formal_reasoning\">Formal reasoning</span><span class=\"mw-editsection\"><span class=\"mw-editsection-bracket\">[</span><a href=\"/w/index.php?title=History_of_artificial_intelligence&amp;action=edit&amp;section=4\" title=\"Edit section: Formal reasoning\">edit</a><span class=\"mw-editsection-bracket\">]</span></span></h3>\n"
//						+ "<p>Artificial intelligence is based on the assumption that the process of human thought can be mechanized. The study of mechanical—or \"formal\"—reasoning has a long history. <a href=\"/wiki/Chinese_Philosophy\" class=\"mw-redirect\" title=\"Chinese Philosophy\">Chinese</a>, <a href=\"/wiki/Indian_Philosophy\" class=\"mw-redirect\" title=\"Indian Philosophy\">Indian</a> and <a href=\"/wiki/Greek_Philosophy\" class=\"mw-redirect\" title=\"Greek Philosophy\">Greek</a> philosophers all developed structured methods of formal deduction in the first millennium BCE. Their ideas were developed over the centuries by philosophers such as  <a href=\"/wiki/Aristotle\" title=\"Aristotle\">Aristotle</a> (who gave a formal analysis of the <a href=\"/wiki/Syllogism\" title=\"Syllogism\">syllogism</a>),  <a href=\"/wiki/Euclid\" title=\"Euclid\">Euclid</a> (whose <i><a href=\"/wiki/Euclid%27s_Elements\" title=\"Euclid&#39;s Elements\">Elements</a></i> was a model of formal reasoning), <a href=\"/wiki/Muhammad_ibn_Musa_al-Khwarizmi\" title=\"Muhammad ibn Musa al-Khwarizmi\">al-Khwārizmī</a> (who developed <a href=\"/wiki/Algebra\" title=\"Algebra\">algebra</a> and gave his name to \"<a href=\"/wiki/Algorithm\" title=\"Algorithm\">algorithm</a>\") and European <a href=\"/wiki/Scholasticism\" title=\"Scholasticism\">scholastic</a> philosophers such as <a href=\"/wiki/William_of_Ockham\" title=\"William of Ockham\">William of Ockham</a> and <a href=\"/wiki/Duns_Scotus\" title=\"Duns Scotus\">Duns Scotus</a>.<sup id=\"cite_ref-Berlinski_2000_14-0\" class=\"reference\"><a href=\"#cite_note-Berlinski_2000-14\">&#91;14&#93;</a></sup>\n"
//						+ "</p><p>Majorcan philosopher <a href=\"/wiki/Ramon_Llull\" title=\"Ramon Llull\">Ramon Llull</a> (1232–1315) developed  several <i>logical machines</i> devoted to the production of knowledge by logical means;<sup id=\"cite_ref-15\" class=\"reference\"><a href=\"#cite_note-15\">&#91;15&#93;</a></sup> Llull described his machines as mechanical entities that could combine basic and undeniable truths by simple logical operations, produced by the machine by mechanical meanings, in such ways as to produce all the possible knowledge.<sup id=\"cite_ref-16\" class=\"reference\"><a href=\"#cite_note-16\">&#91;16&#93;</a></sup> Llull's work had a great influence on <a href=\"/wiki/Gottfried_Leibniz\" class=\"mw-redirect\" title=\"Gottfried Leibniz\">Gottfried Leibniz</a>, who redeveloped his ideas.<sup id=\"cite_ref-17\" class=\"reference\"><a href=\"#cite_note-17\">&#91;17&#93;</a></sup>\n"
//						+ "</p>\n"
//						+ "<div class=\"thumb tleft\"><div class=\"thumbinner\" style=\"width:172px;\"><a href=\"/wiki/File:Gottfried_Wilhelm_Leibniz,_Bernhard_Christoph_Francke.jpg\" class=\"image\"><img alt=\"\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/c/ce/Gottfried_Wilhelm_Leibniz%2C_Bernhard_Christoph_Francke.jpg/170px-Gottfried_Wilhelm_Leibniz%2C_Bernhard_Christoph_Francke.jpg\" width=\"170\" height=\"210\" class=\"thumbimage\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/c/ce/Gottfried_Wilhelm_Leibniz%2C_Bernhard_Christoph_Francke.jpg/255px-Gottfried_Wilhelm_Leibniz%2C_Bernhard_Christoph_Francke.jpg 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/c/ce/Gottfried_Wilhelm_Leibniz%2C_Bernhard_Christoph_Francke.jpg/340px-Gottfried_Wilhelm_Leibniz%2C_Bernhard_Christoph_Francke.jpg 2x\" data-file-width=\"4486\" data-file-height=\"5538\" /></a>  <div class=\"thumbcaption\"><div class=\"magnify\"><a href=\"/wiki/File:Gottfried_Wilhelm_Leibniz,_Bernhard_Christoph_Francke.jpg\" class=\"internal\" title=\"Enlarge\"></a></div><a href=\"/wiki/Gottfried_Leibniz\" class=\"mw-redirect\" title=\"Gottfried Leibniz\">Gottfried Leibniz</a>, who speculated that human reason could be reduced to mechanical calculation</div></div></div>\n"
//						+ "<p>In the 17th century, <a href=\"/wiki/Gottfried_Leibniz\" class=\"mw-redirect\" title=\"Gottfried Leibniz\">Leibniz</a>, <a href=\"/wiki/Thomas_Hobbes\" title=\"Thomas Hobbes\">Thomas Hobbes</a> and <a href=\"/wiki/Ren%C3%A9_Descartes\" title=\"René Descartes\">René Descartes</a> explored the possibility that all rational thought could be made as systematic as algebra or geometry.<sup id=\"cite_ref-18\" class=\"reference\"><a href=\"#cite_note-18\">&#91;18&#93;</a></sup>\n"
//						+ "<a href=\"/wiki/Hobbes\" class=\"mw-redirect\" title=\"Hobbes\">Hobbes</a> famously wrote in <a href=\"/wiki/Leviathan_(Hobbes_book)\" title=\"Leviathan (Hobbes book)\"><i>Leviathan</i></a>: \"reason is nothing but reckoning\".<sup id=\"cite_ref-19\" class=\"reference\"><a href=\"#cite_note-19\">&#91;19&#93;</a></sup>\n"
//						+ "<a href=\"/wiki/Gottfried_Leibniz\" class=\"mw-redirect\" title=\"Gottfried Leibniz\">Leibniz</a> envisioned a universal language of reasoning (his <i><a href=\"/wiki/Characteristica_universalis\" title=\"Characteristica universalis\">characteristica universalis</a></i>) which would reduce argumentation to calculation, so that \"there would be no more need of disputation between two philosophers than between two accountants. For it would suffice to take their pencils in hand, down to their slates, and to say each other (with a friend as witness, if they liked): <i>Let us calculate</i>.\"<sup id=\"cite_ref-20\" class=\"reference\"><a href=\"#cite_note-20\">&#91;20&#93;</a></sup>\n"
//						+ "These philosophers had begun to articulate the <a href=\"/wiki/Physical_symbol_system\" title=\"Physical symbol system\">physical symbol system</a> hypothesis that would become the guiding faith of AI research.\n"
//						+ "</p><p>In the 20th century, the study of <a href=\"/wiki/Mathematical_logic\" title=\"Mathematical logic\">mathematical logic</a> provided the essential breakthrough that made artificial intelligence seem plausible. The foundations had been set by such works as <a href=\"/wiki/George_Boole\" title=\"George Boole\">Boole</a>'s <i><a href=\"/wiki/The_Laws_of_Thought\" title=\"The Laws of Thought\">The Laws of Thought</a></i> and <a href=\"/wiki/Frege\" class=\"mw-redirect\" title=\"Frege\">Frege</a>'s <i><a href=\"/wiki/Begriffsschrift\" title=\"Begriffsschrift\">Begriffsschrift</a></i>. Building on <a href=\"/wiki/Frege\" class=\"mw-redirect\" title=\"Frege\">Frege</a>'s system, <a href=\"/wiki/Bertrand_Russell\" title=\"Bertrand Russell\">Russell</a> and <a href=\"/wiki/Alfred_North_Whitehead\" title=\"Alfred North Whitehead\">Whitehead</a> presented a formal treatment of the foundations of mathematics in their masterpiece, the <i><a href=\"/wiki/Principia_Mathematica\" title=\"Principia Mathematica\">Principia Mathematica</a></i> in 1913. Inspired by <a href=\"/wiki/Bertrand_Russell\" title=\"Bertrand Russell\">Russell</a>'s success, <a href=\"/wiki/Hilbert%27s_program\" title=\"Hilbert&#39;s program\">David Hilbert</a> challenged mathematicians of the 1920s and 30s to answer this fundamental question: \"can all of mathematical reasoning be formalized?\"<sup id=\"cite_ref-Berlinski_2000_14-1\" class=\"reference\"><a href=\"#cite_note-Berlinski_2000-14\">&#91;14&#93;</a></sup>\n"
//						+ "His question was answered by <a href=\"/wiki/Kurt_G%C3%B6del\" title=\"Kurt Gödel\">Gödel</a>'s <a href=\"/wiki/G%C3%B6del%27s_incompleteness_theorems\" title=\"Gödel&#39;s incompleteness theorems\">incompleteness proof</a>, <a href=\"/wiki/Alan_Turing\" title=\"Alan Turing\">Turing</a>'s <a href=\"/wiki/Turing_machine\" title=\"Turing machine\">machine</a> and <a href=\"/wiki/Alonzo_Church\" title=\"Alonzo Church\">Church</a>'s <a href=\"/wiki/Lambda_calculus\" title=\"Lambda calculus\">Lambda calculus</a>.<sup id=\"cite_ref-Berlinski_2000_14-2\" class=\"reference\"><a href=\"#cite_note-Berlinski_2000-14\">&#91;14&#93;</a></sup><sup id=\"cite_ref-21\" class=\"reference\"><a href=\"#cite_note-21\">&#91;21&#93;</a></sup>\n"
//						+ "</p>");

	}

}
