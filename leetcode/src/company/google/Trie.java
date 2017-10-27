package company.google;


class Trie {

    /** Initialize your data structure here. */
	private TrieNode node;
    public Trie() {
    		node = new TrieNode();      
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
    	TrieNode root = node;
    	for(int i = 0; i < word.length(); i++){
    		char c = word.charAt(i);
    		if(root.next[c - 'a'] == null){
    			root.next[c - 'a'] = new TrieNode();
    		}
    		root = root.next[c - 'a'];
    	}
    	//note: important!
    	root.isWord = true;
        
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode cur = node;
        for(int i = 0; i < word.length(); i++){
        	if(cur.next[word.charAt(i) - 'a'] == null){
        		return false;
        	}
        	cur = cur.next[word.charAt(i) - 'a'];
        }
        return cur.isWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
      TrieNode cur = node;
      for(int i = 0; i < prefix.length(); i++){
    	  char c = prefix.charAt(i);
    	  if(cur.next[c - 'a'] == null){
    		  return false;
    	  }
    	  cur = cur.next[c - 'a'];
      }
      
      return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
