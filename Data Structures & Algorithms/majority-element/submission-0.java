class Solution {
    public int majorityElement(int[] nums) {
        int major = (nums.length)/2;
        int max = 0;
        Map<Integer, Integer> map = new HashMap();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue()>major){
                max = e.getKey();
            }
        }
        return max;
    }
}