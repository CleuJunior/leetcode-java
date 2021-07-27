public class _1480_runningSumArray {
    public int[] runningSum(int[] nums){
        int runningSum = 0;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];

            nums[index++] = runningSum;
        }
        return nums;
    }
}
