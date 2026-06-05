class Solution {
    public boolean hasDuplicate(int[] nums) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap();
        
        for(int item: nums){
            map.put(item,map.getOrDefault(item,0)+1);
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() > 1){
                return true;
            }
        }
        return false;
    }
}