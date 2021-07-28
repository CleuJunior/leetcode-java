import java.util.ArrayList;

public class _1470_shuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int sizeArray = nums.length / 2;
        int sortedArray1[] = new int[sizeArray];
        int sortedArray2[] = new int[sizeArray];
        int arrayReturn[] = new int[nums.length];
        ArrayList<Integer> arrayListInt = new ArrayList<>();

        for (int i = 0; i < sizeArray; i++) {
            sortedArray1[i] = nums[i];
            sortedArray2[i] = nums[i+n];

        }

        for (int i = 0; i < sizeArray; i++) {
            arrayListInt.add(sortedArray1[i]);
            arrayListInt.add(sortedArray2[i]);
        }

        for (int i = 0; i < arrayReturn.length; i++) {
            arrayReturn[i] = arrayListInt.get(i);
        }

        return arrayReturn;

    }
}
