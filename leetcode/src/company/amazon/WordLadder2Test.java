package company.amazon;

import java.util.ArrayList;
import java.util.List;

public class WordLadder2Test {
	
	public static void main (String[] args){
		WordLadder2 wl = new WordLadder2();
		String begin = "hit";
		String end = "cog";
		List<String> wordList = new ArrayList<String>();
		wordList.add("hot");
		wordList.add("dot");
		wordList.add("dog");
		wordList.add("lot");
		wordList.add("log");
		wordList.add("cog");
		
		System.out.println(wl.findLadders(begin, end, wordList));
	}

}
