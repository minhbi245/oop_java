import java.util.Arrays;

public class Hello {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 334, 22, 3, 33 };
        System.out.println(findNumbers(arr));

    }

    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int a : nums) {
            int countNumbers = calCountNumber(a);
            if (countNumbers % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static int calCountNumber(int a) {
        int count = 0;
        int result = a;

        while (result != 0) {
            result = a / 10;
            a = result;
            count++;
        }

        return count;
    }
}