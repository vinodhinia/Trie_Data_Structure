import java.util.*;

class TrieNode{
	char value;
	HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
	boolean isLeaf;
	
	TrieNode(){
		
	}
	
	TrieNode(char value){
		this.value = value;
	}
}

public class Trie {
	private TrieNode root;
	
	Trie(){
		root = new TrieNode();
	}
	
	/** Inserts a word in to the Trie */
	public void insert(String word) {
		HashMap<Character, TrieNode> children  = root.children;
		
		for(int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			TrieNode t;
			if(children.containsKey(ch)) {
				t = children.get(ch);
			}else {
				t = new TrieNode(ch);
				children.put(ch, t);
			}
			children = t.children;
			if(i == word.length()-1)
				t.isLeaf = true;
		}	
		
	}
	
	/** Searches the given word in a String */
	public boolean search(String word) {
		HashMap<Character, TrieNode> children = root.children;
		TrieNode t;
		for(int i=0;i<word.length();i++) {
			char c = word.charAt(i);
			if(!children.containsKey(c))
				return false;
			else {
				t = children.get(c);
				children = t.children;
			}
		}
		return true;
	}
	
	/** Returns true if there is any word that starts with the prefix */
	public boolean startsWith(String prefix) {
		if(search(prefix))
			return true;
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie trie = new Trie();
		trie.insert("cat");
		System.out.println(trie.search("ca")? "Word is present in the Trie" :"Word not found");
		System.out.println(trie.search("ab")? "Word is present in the Trie" :"Word not found");
	}

}
