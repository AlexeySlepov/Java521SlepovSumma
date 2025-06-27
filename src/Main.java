import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        int[] nums = {2, 7, 11, 15};
        int targetSum = 10;
        boolean hasTargetSum = false;

        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(targetSum - nums[i])) {
                System.out.println("[" + i + "," + indexOf(nums, targetSum - nums[i]) + "]");
                hasTargetSum = true;
            } else{
                hashSet.add(nums[i]);
            }
        }

        if (!hasTargetSum) {
            System.out.println("Не найдена пара чисел");
        }
    }


    private static int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return 0;
    }
}
