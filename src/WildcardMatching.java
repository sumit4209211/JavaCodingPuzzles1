/*Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*' where:

        '?' Matches any single character.
        '*' Matches any sequence of characters (including the empty sequence).
        The matching should cover the entire input string (not partial).



        Example 1:

        Input: s = "aa", p = "a"
        Output: false
        Explanation: "a" does not match the entire string "aa".
        Example 2:

        Input: s = "aa", p = "*"
        Output: true
        Explanation: '*' matches any sequence.
        Example 3:

        Input: s = "cb", p = "?a"
        Output: false
        Explanation: '?' matches 'c', but the second letter is 'a', which does not match 'b'.
        Example 4:

        Input: s = "adceb", p = "*a*b"
        Output: true
        Explanation: The first '*' matches the empty sequence, while the second '*' matches the substring "dce".
        Example 5:

        Input: s = "acdcb", p = "a*c?b"
        Output: false


        Constraints:

        0 <= s.length, p.length <= 2000
        s contains only lowercase English letters.
        p contains only lowercase English letters, '?' or '*'.
        Complexity Analysis

Time complexity : \mathcal{O}(\min(S, P))O(min(S,P)) for the best case and better than \mathcal{O}(S \log P)O(SlogP) for the average case, where S and P are lengths of the input string and the pattern correspondingly. Please refer to this article for the detailed proof.
Space complexity : \mathcal{O}(1)O(1) since it's a constant space solution.

        */

public class WildcardMatching {
    public boolean isMatch(String s, String p) {
        int sLen = s.length(), pLen = p.length();
        int sIdx = 0, pIdx = 0;
        int starIdx = -1, sTmpIdx = -1;

        while (sIdx < sLen) {
            // If the pattern caracter = string character
            // or pattern character = '?'
            if (pIdx < pLen && (p.charAt(pIdx) == '?' || p.charAt(pIdx) == s.charAt(sIdx))){
                ++sIdx;
                ++pIdx;
            }
            // If pattern character = '*'
            else if (pIdx < pLen && p.charAt(pIdx) == '*') {
                // Check the situation
                // when '*' matches no characters
                starIdx = pIdx;
                sTmpIdx = sIdx;
                ++pIdx;
            }
            // If pattern character != string character
            // or pattern is used up
            // and there was no '*' character in pattern
            else if (starIdx == -1) {
                return false;
            }
            // If pattern character != string character
            // or pattern is used up
            // and there was '*' character in pattern before
            else {
                // Backtrack: check the situation
                // when '*' matches one more character
                pIdx = starIdx + 1;
                sIdx = sTmpIdx + 1;
                sTmpIdx = sIdx;
            }
        }

        // The remaining characters in the pattern should all be '*' characters
        for(int i = pIdx; i < pLen; i++)
            if (p.charAt(i) != '*') return false;
        return true;
    }
}

