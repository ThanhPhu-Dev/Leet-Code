package easyCollection.array;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class IntersectionofTwoArraysII {
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> set = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0;
        int j=0;
        while(i< nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                set.add(nums1[i]);
                i++;
                j++;
            }else if (nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int[] rs = new int[set.size()];
        for(int a=0;a<set.size();a++){
            rs[a] = set.get(a);
        }
        return rs;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};


        int[] nums3 = {1,2};
        int[] nums4 = {1,1};

        int[] nums5 = {4,9,5};
        int[] nums6 = {9,4,9,8,4};

        int[] rs = intersect(nums5, nums6);
        for (int i = 0 ;i < rs.length; i++){
            System.out.println(rs[i]);
        }
    }
}
