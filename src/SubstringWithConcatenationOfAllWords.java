/*You are given a string s and an array of strings words of the same length. Return all starting indices of substring(s) in s that is a concatenation of each word in words exactly once, in any order, and without any intervening characters.

        You can return the answer in any order.



        Example 1:

        Input: s = "barfoothefoobarman", words = ["foo","bar"]
        Output: [0,9]
        Explanation: Substrings starting at index 0 and 9 are "barfoo" and "foobar" respectively.
        The output order does not matter, returning [9,0] is fine too.
        Example 2:

        Input: s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
        Output: []
        Example 3:

        Input: s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]
        Output: [6,9,12]


        Constraints:

        1 <= s.length <= 104
        s consists of lower-case English letters.
        1 <= words.length <= 5000
        1 <= words[i].length <= 30
        words[i] consists of lower-case English letters.*/
import java.util.*;

public class SubstringWithConcatenationOfAllWords {
    //time complexity: O (N * M * L) where N is the string length, M is the words array size and L is the word length
    //space complexity: O(N + M) where N is the string length (worst case all letters will be stored as result) and M is the words array size (hash maps storing all the found words)
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<Integer>();

        int wordsQty = words.length,
                wordSize = words[0].length(),
                windowLength = wordSize * wordsQty;

        Map<String, Integer> wordsCountMap = new HashMap<>();
        for(String word : words) {
            wordsCountMap.put(word, wordsCountMap.getOrDefault(word, 0) + 1);
        }

        for(int i = 0; i <= s.length() - windowLength; i++) {
            Map<String, Integer> wordsSeenMap = new HashMap<>();
            windowLoop: {
                for(int j = 0; j < wordsQty; j++) {
                    int start = i + j * wordSize;
                    int end = start + wordSize;
                    String word = s.substring(start, end);

                    if(!wordsCountMap.containsKey(word)) {
                        break windowLoop;
                    }

                    wordsSeenMap.put(word, wordsSeenMap.getOrDefault(word, 0) + 1);

                    if(wordsSeenMap.get(word) > wordsCountMap.get(word)) {
                        break windowLoop;
                    }
                }
                result.add(i);
            }
        }

        return result;
    }
}

