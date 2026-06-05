class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Map<Character, Integer> map1 = new HashMap();
        Map<Character, Integer> map2 = new HashMap();

        for (char item : a) {
            map1.put(item, map1.getOrDefault(item, 0) + 1);
        }
        for (char item : b) {
            map2.put(item, map2.getOrDefault(item, 0) + 1);
        }
        return map1.equals(map2);
    }
}