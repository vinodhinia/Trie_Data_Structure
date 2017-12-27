# Trie_Data_Structure
- Trie is basically an efficient information retrieval data structure. 
- Every node of Trie consists of multiple branches. Each branch represents a possible character of keys. To mark end of the word I use isLeaf that is set true only for the last character in the word.
- Implement a trie with insert, search, and searchPrefix methods.
- **insert()**
  - Insets a word in the Trie
  -  Every character of input key is inserted as an individual Trie node. Children is a HashMap of next level trie nodes. Every  character in the word acts as an index into HashMap. 
- **search()**
  - Searches the given word in the trie.
  - In search we compare the characters at every level and move down.
