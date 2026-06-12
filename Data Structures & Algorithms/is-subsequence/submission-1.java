class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        // int count = 0;
        // while(i<s.length() && j<t.length()){
        //     if(s.charAt(i) == t.charAt(j)){
        //         i++;
        //         j++;
        //         count++;
        //     }else if(s.charAt(i) != t.charAt(j)){
        //         j++;
        //     }else if(j==t.length())
        //         i++;
        // }
        // return count == s.length();
        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}