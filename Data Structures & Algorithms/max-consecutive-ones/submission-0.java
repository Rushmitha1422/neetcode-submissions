class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        List<Integer> list = new ArrayList();
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
            }else if(nums[i] == 0){
                list.add(count);
                count = 0;
            }
            list.add(count);
        }
        int max = 0;
        for(int item: list){
            if(item>max){
                max = item;
            }
        }
        return max;
    }
}