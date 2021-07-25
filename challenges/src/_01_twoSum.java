public class _01_twoSum {
    public int[] twoSum(int[] nums, int target) {
        int []positionsFound = new int[2];
        for(int i=1; i<nums.length;i++)
        {
            for (int j = 0; j < i; j++) {
                if(target == nums[i] + nums[j]){
                    positionsFound[0] = i;
                    positionsFound[1] = j;
                    break;
                }
            }
        }
        return positionsFound;
    }
}
