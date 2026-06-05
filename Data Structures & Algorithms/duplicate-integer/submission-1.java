class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Map<Integer, Integer> map = new HashMap();
        
        // for(int item: nums){
        //     map.put(item,map.getOrDefault(item,0)+1);
        // }
        // for(Map.Entry<Integer, Integer> e : map.entrySet()){
        //     if(e.getValue() > 1){
        //         return true;
        //     }
        // }
        // return false;

        Set<Integer> set = new HashSet();
        for(int i=0 ; i<nums.length; i++){
            set.add(nums[i]);
        }
        if(set.size() != nums.length){
            return true;
        }return false;
    }
}