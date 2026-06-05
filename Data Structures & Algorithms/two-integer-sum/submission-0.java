class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        int diff = 0;
        int[] arr = new int[2];
        for(int i=0; i<nums.length; i++){
            diff = target - nums[i];
            if(map.containsKey(diff) && i != map.get(diff)){
                if(i<map.get(diff)){
                    arr[0] = i;
                    arr[1] = map.get(diff);
                }else{
                arr[0] = map.get(diff);
                arr[1] = i;
                }
            }
            map.put(nums[i], i);
        }
        return arr;
    }
}
