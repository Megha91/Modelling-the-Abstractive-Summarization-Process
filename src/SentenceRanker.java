import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


public class SentenceRanker {
 

 
	
	 
	
	public static void main(String[] args) throws IOException {
		/*ArrayList<String> sentences=SentenceRanker.sentenceSepartor("c:\\test.txt");
		HashMap<Integer, Integer>  rank = rankSenteneBased(sentences);
		displaySummary(sentences, rank);*/
	}
	
	
	
	
	static  ArrayList<String> sentenceSepartor(String fileName){
		  BufferedReader br = null;
		  String sCurrentLine = null;
		  ArrayList<String> sentences = new ArrayList<String>();
		  String result=null;
		  
			try {
                
			 
				StringBuilder contents = new StringBuilder();
				br = new BufferedReader(new FileReader(fileName));

				while ((sCurrentLine = br.readLine()) != null) {
					if(!sCurrentLine.contains("."))
			        contents.append(sCurrentLine);
					
					else{
						System.out.println(sCurrentLine);
						String[] sentenceSeparated = sCurrentLine.split("\\.");
						System.out.println(sentenceSeparated.length);
						contents.append(sentenceSeparated[0]);
						sentences.add(contents.toString());
						contents.setLength(0);
						if(contents.length() > 0 )
							
						contents.append(sentenceSeparated[1]);
						
					}
					
					System.out.println(contents);
				}
				System.out.println(sentences);
				 /*System.out.println("Number of characters: " + contents.length());
				  System.out.println("Number of words: " + wordcount(contents.toString()));
				  System.out.println("Number of lines: " + numLine);
	*/
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (br != null)br.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
          return sentences;
	}
	
	HashMap<Integer, Integer> rankSenteneBased(ArrayList<String> sentences){
		
		
		
		HashMap<Integer, Integer> sentenceToRankMap = new HashMap<Integer, Integer>();
		int sentenceNumber=0;
		for (String sentence : sentences) {
			String[] wordArray=sentence.split("\\s");
			
			 ArrayList<String> stopWords=new ArrayList<String>();
			 ArrayList<String> cueWords=new ArrayList<String>();
			stopWords.add("The");
			
			cueWords.add("advance");
			cueWords.add("add");
			cueWords.add("and");
			cueWords.add("beyond");
			cueWords.add("company");
			cueWords.add("could");
			cueWords.add("dead");
			cueWords.add("deep");
			cueWords.add("escape");
			cueWords.add("found");
			cueWords.add("God");
			cueWords.add("happy");
			cueWords.add("feed");
			cueWords.add("help");
			cueWords.add("important");
			cueWords.add("instead");
			cueWords.add("ladder");
			cueWords.add("led");
			cueWords.add("appear");
			cueWords.add("bad");
			cueWords.add("bird");
			cueWords.add("broad");
			cueWords.add("accustomed");
			cueWords.add("scandals");
			cueWords.add("attention");
			cueWords.add("reason");
			cueWords.add("normal");
			cueWords.add("attempt");
			cueWords.add("child");
			cueWords.add("dare");
			cueWords.add("destroy");
			cueWords.add("different");
			cueWords.add("discover");
			cueWords.add("do");
			cueWords.add("done");
			cueWords.add("found");
			cueWords.add("childhood");
			cueWords.add("complete");
			cueWords.add("crowd");
			cueWords.add("dark");
			cueWords.add("deal");
			cueWords.add("degree");
			cueWords.add("device");
			cueWords.add("dish");
			cueWords.add("doctor");
			cueWords.add("don't");
			cueWords.add("except");
			cueWords.add("field");
			cueWords.add("Friday");
			cueWords.add("gold");
			cueWords.add("hard");
			cueWords.add("hope");
			cueWords.add("include");
			cueWords.add("jump");
			cueWords.add("lady");
			cueWords.add("lord");
			cueWords.add("measure");
			cueWords.add("Monday");
			cueWords.add("open");
			cueWords.add("page");
			cueWords.add("part");
			cueWords.add("pay");
			cueWords.add("period");
			cueWords.add("place");
			cueWords.add("pleasant");
			cueWords.add("position");
			cueWords.add("present");
			cueWords.add("probably");
			cueWords.add("prove");
			cueWords.add("put");
			cueWords.add("reply");
			cueWords.add("round");
			cueWords.add("seed");
			cueWords.add("shop");
			cueWords.add("slept");
			cueWords.add("special");
			cueWords.add("spread");
			cueWords.add("stop");
			cueWords.add("Sunday");
			cueWords.add("thousand");
			cueWords.add("trip");
			cueWords.add("up");
			cueWords.add("wild");
			cueWords.add("word");
			cueWords.add("method");
			cueWords.add("mud");
			cueWords.add("opinion");
			cueWords.add("paid");
			cueWords.add("partial");
			cueWords.add("peace");
			cueWords.add("person");
			cueWords.add("plain");
			cueWords.add("pleasure");
			cueWords.add("possible");
			cueWords.add("president");
			cueWords.add("problem");
			cueWords.add("public");
			cueWords.add("read");
			cueWords.add("report");
			cueWords.add("sad");
			cueWords.add("separate");
			cueWords.add("should");
			cueWords.add("sold");
			cueWords.add("spend");
			cueWords.add("spring");
			cueWords.add("student");
			cueWords.add("supply");
			cueWords.add("today");
			cueWords.add("Tuesday");
			cueWords.add("upon");
			cueWords.add("wind");
			cueWords.add("world");
			cueWords.add("afraid");
			cueWords.add("apple");
			cueWords.add("bed");
			cueWords.add("blood");
			cueWords.add("build");
			cueWords.add("children");
			cueWords.add("condition");
			cueWords.add("cup");
			cueWords.add("date");
			cueWords.add("dear");
			cueWords.add("delight");
			cueWords.add("did");
			cueWords.add("dig");
			cueWords.add("distance");
			cueWords.add("does");
			cueWords.add("door");
			cueWords.add("expect");
			cueWords.add("fine");
			cueWords.add("friend");
			cueWords.add("good");
			cueWords.add("head");
			cueWords.add("hold");
			cueWords.add("indeed");
			cueWords.add("keep");
			cueWords.add("land");
			cueWords.add("loud");
			cueWords.add("middle");
			cueWords.add("need");
			cueWords.add("order");
			cueWords.add("pain");
			cueWords.add("party");
			cueWords.add("people");
			cueWords.add("picture");
			cueWords.add("plan");
			cueWords.add("please");
			cueWords.add("pot");
			cueWords.add("press");
			cueWords.add("produce");
			cueWords.add("pull");
			cueWords.add("ready");
			cueWords.add("ridden");
			cueWords.add("said");
			cueWords.add("September");
			cueWords.add("shoulder");
			cueWords.add("sound");
			cueWords.add("spend");
			cueWords.add("stand");
			cueWords.add("study");
			cueWords.add("suppose");
			cueWords.add("told");
			cueWords.add("under");
			cueWords.add("usual");
			cueWords.add("window");
			cueWords.add("would");
			cueWords.add("airplane");
			cueWords.add("April");
			cueWords.add("behind");
			cueWords.add("board");
			cueWords.add("building");
			cueWords.add("cloud");
			cueWords.add("consider");
			cueWords.add("daily");
			cueWords.add("daughter");
			cueWords.add("December");
			cueWords.add("demand");
			cueWords.add("die");
			cueWords.add("dinner");
			cueWords.add("distant");
			cueWords.add("dog");
			cueWords.add("double");
			cueWords.add("experience");
			cueWords.add("food");
			cueWords.add("garden");
			cueWords.add("goodbye");
			cueWords.add("heard");
			cueWords.add("husband");
			cueWords.add("industry");
			cueWords.add("kept");
			cueWords.add("lead");
			cueWords.add("mad");
			cueWords.add("mind");
			cueWords.add("needle");
			cueWords.add("orderly");
			cueWords.add("paint");
			cueWords.add("pass");
			cueWords.add("perfect");
			cueWords.add("pick");
			cueWords.add("plant");
			cueWords.add("point");
			cueWords.add("power");
			cueWords.add("pretty");
			cueWords.add("promise");
			cueWords.add("pure");
			cueWords.add("record");
			cueWords.add("ride");
			cueWords.add("Saturday");
			cueWords.add("shade");
			cueWords.add("side");
			cueWords.add("space");
			cueWords.add("spoke");
			cueWords.add("step");
			cueWords.add("succeed");
			cueWords.add("surprise");
			cueWords.add("toward");
			cueWords.add("understand");
			cueWords.add("Wednesday");
			cueWords.add("wonder");
			cueWords.add("yard");
			cueWords.add("already");
			cueWords.add("around");
			cueWords.add("beside");
			cueWords.add("body");
			cueWords.add("captain");
			cueWords.add("cold");
			cueWords.add("considerable");
			cueWords.add("dance");
			cueWords.add("day");
			cueWords.add("decide");
			cueWords.add("desire");
			cueWords.add("difference");
			cueWords.add("direct");
			cueWords.add("divide");
			cueWords.add("dollar");
			cueWords.add("end");
			cueWords.add("explain");
			cueWords.add("forward");
			cueWords.add("glad");
			cueWords.add("group");
			cueWords.add("held");
			cueWords.add("");
			cueWords.add("idea");
			cueWords.add("inside");
			cueWords.add("kind");
			cueWords.add("leader");
			cueWords.add("made");
			cueWords.add("modern");
			cueWords.add("old");
			cueWords.add("outside");
			cueWords.add("pair");
			cueWords.add("past");
			cueWords.add("perhaps");
			cueWords.add("piece");
			cueWords.add("play");
			cueWords.add("poor");
			cueWords.add("prepare");
			cueWords.add("price");
			cueWords.add("proud");
			cueWords.add("push");
			cueWords.add("red");
			cueWords.add("road");
			cueWords.add("second");
			cueWords.add("ship");
			cueWords.add("sleep");
			cueWords.add("speak");
			cueWords.add("spot");
			cueWords.add("stood");
			cueWords.add("sudden");
			cueWords.add("third");
			cueWords.add("trade");
			cueWords.add("understood");
			cueWords.add("wide");
			cueWords.add("wood");
			cueWords.add("yesterday");
			
		
			
            int rank=0;
			List<String> wordList = Arrays.asList(wordArray);
			for (String word : wordList) {
				// write logic of comaring if word is not stop word or if it is cue word
				
				if( !(stopWords.contains(word)) && (cueWords.contains(word)) )
					rank++;
				
				
			}
			sentenceNumber++;
			if(rank!=0){
				sentenceToRankMap.put(sentenceNumber, rank);
			}
		 }
		
		return sentenceToRankMap;
	}
	
	void displaySummary(ArrayList<String> al, HashMap<Integer, Integer> h) throws IOException{
		
		System.out.println("inside displaySummary method");
		File file = new File("summary.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		
		
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		Iterator<Integer> hashmap=h.keySet().iterator();
		
		while(hashmap.hasNext()){
			
		//	System.out.println(al.get(hashmap.next()-1));
			
			System.out.println("writing to the summary.txt");
			
			bw.write(al.get(hashmap.next()-1));
			
 
			System.out.println("Done");
		}
		
		
		bw.close();
		
		
	}
}
