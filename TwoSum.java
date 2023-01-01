import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;
        int result[] = twoSum(arr, target);
        System.out.println(Arrays.toString(result));
    }


    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // fill hashmap
        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], i);
        // searching in hasmap
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int rem = target - num;
            if (map.containsKey(rem)) {
                int index = map.get(rem);
                if (index == i) // skip when the same value is picked  like 4 = 2+2 in hashmap
                    continue;
                return new int[]{i, index};
            }
        }
        return new int[]{-1, -1};
    }
}
