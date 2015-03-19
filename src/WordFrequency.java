import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeMap;


public class WordFrequency {
	
	public static void main(String[] args) throws IOException {
		
		
		final File textFile = new File("c:\\Documents and Settings\\Administrator\\workspace\\Text\\input.txt");
		final BufferedReader in = new BufferedReader(new FileReader(textFile));

		// Mapping of String->Integer (word -> frequency)
		final TreeMap<String, Integer> frequencyMap = new TreeMap<String, Integer>();

		// Iterate through each line of the file
		String currentLine;
		while ((currentLine = in.readLine()) != null) {

		// Remove this line if you want words to be case sensitive
		currentLine = currentLine.toLowerCase();

		// Iterate through each word of the current line
		// Delimit words based on whitespace, punctuation, and quotes
		final StringTokenizer parser = new StringTokenizer(currentLine, " \t\n\r\f.,;:!?'");
		while (parser.hasMoreTokens()) {
		final String currentWord = parser.nextToken();

		Integer frequency = frequencyMap.get(currentWord);

		// Add the word if it doesn't already exist, otherwise increment the
		// frequency counter.
		if (frequency == null) {
		frequency = 0;
		}
		frequencyMap.put(currentWord, frequency + 1);

		}


		}

		// Display our nice little Map
		System.out.println(frequencyMap);
		
		
		
	}

}
