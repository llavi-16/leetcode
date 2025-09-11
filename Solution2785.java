class Solution2785 {
    public String sortVowels(String s) {
        String v = "aeiouAEIOU";
        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray())
            if (v.indexOf(c) >= 0)
                list.add(c);
        Collections.sort(list);

        StringBuilder res = new StringBuilder();
        int i = 0;
        for (char c : s.toCharArray())
            res.append(v.indexOf(c) >= 0 ? list.get(i++) : c);

        return res.toString();
    }
}
