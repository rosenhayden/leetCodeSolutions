class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            char[] curCharArr = strs[i].toCharArray();
            Arrays.sort(curCharArr);
            String cur = new String(curCharArr);
            if (anagrams.containsKey(cur)) {
                anagrams.get(cur).add(strs[i]);
            } else {
                anagrams.put(cur, new ArrayList<>());
                anagrams.get(cur).add(strs[i]);
                //System.out.println(anagrams);
            }
        }
        ArrayList<List<String>> grouped = new ArrayList<>();
        for (List<String> key : anagrams.values()) {
            grouped.add(key);
        }
        return grouped;
    }
}
