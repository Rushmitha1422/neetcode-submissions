class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }
        boolean flag = true;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Map<Character, Integer> mapS = new HashMap();
        for(char c: a){
            mapS.put(c, mapS.getOrDefault(c,0)+1);
        }
        Map<Character, Integer> mapT = new HashMap();
        for(char c: b){
            mapT.put(c, mapT.getOrDefault(c,0)+1);
        }
        for(int i=0; i<s.length()-1; i++){
            if(a[i] == a[i+1] && b[i] == b[i+1] && mapS.get(a[i])==mapT.get(b[i])){
                flag = true;
            }else if(a[i] != a[i+1] && b[i] != b[i+1] && mapS.get(a[i])==mapT.get(b[i])){
                flag = true;
            }
            else{
                flag = false;
                return flag;
            }
        }
        return flag;
    }
}