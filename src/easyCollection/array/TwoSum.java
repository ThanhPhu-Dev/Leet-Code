package easyCollection.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int target = 6;
        int[] rs= new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                rs[0] = i;
                rs[1] = map.get(complement);
                break;
            }
        }
        System.out.println(rs[0] + " " +rs[1]);
    }
}
