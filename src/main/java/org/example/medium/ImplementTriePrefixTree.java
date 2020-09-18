package org.example.medium;

/**
 * 208. 实现 Trie (前缀树)
 * 难度
 * 中等
 *
 * 407
 *
 * 收藏
 *
 * 分享
 * 切换为英文
 * 关注
 * 反馈
 * 实现一个 Trie (前缀树)，包含 insert, search, 和 startsWith 这三个操作。
 *
 * 示例:
 *
 * Trie trie = new Trie();
 *
 * trie.insert("apple");
 * trie.search("apple");   // 返回 true
 * trie.search("app");     // 返回 false
 * trie.startsWith("app"); // 返回 true
 * trie.insert("app");
 * trie.search("app");     // 返回 true
 * 说明:
 *
 * 你可以假设所有的输入都是由小写字母 a-z 构成的。
 * 保证所有输入均为非空字符串。
 */
public class ImplementTriePrefixTree {

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));
        trie.insert("app");
        System.out.println(trie.search("app"));

    }

    static class Trie {
        private boolean isEnd;
        private Trie[] next;
        private String val;

        /**
         * Initialize your data structure here.
         */
        public Trie() {
            isEnd = false;
            next = new Trie[26];
        }

        /**
         * Inserts a word into the trie.
         */
        public void insert(String word) {
            if (word == null || word.length() == 0) {
                return;
            }
            Trie curr = this;
            char[] words = word.toCharArray();
            for (int i = 0; i < words.length; i++) {
                int n = words[i] - 'a';
                if (curr.next[n] == null) {
                    curr.next[n] = new Trie();
                }
                curr = curr.next[n];
            }
            curr.isEnd = true;
            curr.val = word;
        }

        /**
         * Returns if the word is in the trie.
         */
        public boolean search(String word) {
            Trie node = searchPrefix(word);
            System.out.println("search: " + node.val);
            return node != null && node.isEnd;
        }

        /**
         * Returns if there is any word in the trie that starts with the given prefix.
         */
        public boolean startsWith(String prefix) {
            Trie node = searchPrefix(prefix);
            return node != null;
        }

        private Trie searchPrefix(String word) {
            Trie node = this;
            char[] words = word.toCharArray();
            for (int i = 0; i < words.length; i++) {
                node = node.next[words[i] - 'a'];
                if (node == null) {
                    return null;
                }
            }
            return node;
        }
    }

}
