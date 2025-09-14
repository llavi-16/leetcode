import java.util.*;

class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exactWords = new HashSet<>(Arrays.asList(wordlist));
        Map<String, String> caseMap = new HashMap<>();
        Map<String, String> vowelMap = new HashMap<>();

        for (String word : wordlist) {
            String lower = word.toLowerCase();
            caseMap.putIfAbsent(lower, word);
            vowelMap.putIfAbsent(devowel(lower), word);
        }

        String[] ans = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];
            if (exactWords.contains(q)) {
                ans[i] = q; // Exact match
            } else if (caseMap.containsKey(q.toLowerCase())) {
                ans[i] = caseMap.get(q.toLowerCase()); // Case-insensitive
            } else {
                ans[i] = vowelMap.getOrDefault(devowel(q.toLowerCase()), ""); // Vowel-error
            }
        }
        return ans;
    }

    private String devowel(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) {
                sb.append('*'); // Replace vowel with *
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
