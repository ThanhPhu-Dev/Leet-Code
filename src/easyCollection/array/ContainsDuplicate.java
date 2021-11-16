package easyCollection.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {

            set.add(nums[i]);
        }
        if(set.size() != nums.length){
            return true;
        }
        return false;
    }

    public static boolean containsDuplicate3(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values().stream()
                .anyMatch(count -> count > 1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};//true
        int[] nums2 = {1,2,3,4};//false
        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};//true
        System.out.println(containsDuplicate2(nums1));
    }
}

