package easyCollection.array;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates1(int[] nums) {
        if (nums.length == 0) return 0;
        int index = 1;
        int value = nums[0];
        for(int i=1;i<nums.length;i++){
            if(value != nums[i]){
                nums[index] = nums[i];
                value = nums[index];
                index++;
            }
        }
        return index;
    }

    public static int removeDuplicates(int[] nums) {
        List<Integer> positions = new ArrayList<>();
        int ps = 0;
        int temp;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]){
                positions.add(i);
            }
        }
        if(positions.size() == 0){
            return nums.length;
        }else{
            ps = positions.get(0);
        }
        for(int i=positions.get(0);i< nums.length;i++){
            if(!positions.contains(i)){
                temp = nums[i];
                nums[i]=nums[ps];
                nums[ps]=temp;
                ps++;
            }
        }

        return nums.length - positions.size();
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {1, 2, 2, 3};
        int[] nums3 = {1, 2, 3};
        int kq = removeDuplicates1(nums1);
        System.out.println("kq: " +kq);
        for (int i=0;i<nums1.length;i++){
            System.out.println(nums1[i]);
        }
    }
}
