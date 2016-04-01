import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapCount {
	public static void main (String[] args)
	{
	String str = "I am a Boy I am a";
	String[] splitStr = str.split(" ");

	Map<String, Integer> wordCount = new HashMap<String, Integer>();
	for (String word: splitStr) {
	    if (wordCount.containsKey(word)) {
	        // Map already contains the word key. Just increment it's count by 1
	        wordCount.put(word, wordCount.get(word) + 1);
	    } else {
	        // Map doesn't have mapping for word. Add one with count = 1
	        wordCount.put(word, 1);
	    }
	    /*for (Entry<String, Integer> entry: wordCount.entrySet()) {
	        System.out.println("Count of : " + entry.getKey() + 
	                           " in sentence = " + entry.getValue());*/
	    }  
	Iterator a = wordCount.entrySet().iterator();
	while(a.hasNext())
	{
	Map.Entry<String,Integer> b = (Map.Entry<String,Integer>) a.next();
	 System.out.println("Count of : " + b.getKey() + 
             " in sentence = " + b.getValue());
	}
	}
}
