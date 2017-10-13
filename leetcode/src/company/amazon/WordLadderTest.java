package company.amazon;

import java.util.ArrayList;
import java.util.List;

public class WordLadderTest {
	
	public static void main (String[] args){
		WordLadder wl = new WordLadder();
		String begin = "hit";
		String end = "cog";
		List<String> wordList = new ArrayList<String>();
		wordList.add("hot");
		wordList.add("dot");
		wordList.add("dog");
		wordList.add("lot");
		wordList.add("log");
		//wordList.add("cog");
		
		System.out.println(wl.ladderLength(begin, end, wordList));
	}

}
