package easyCollection.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
          Map<Integer,Long> a = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            for(Integer i : a.keySet()){
                if(a.get(i) == 1){
                    return i;
                }
            }
        return 0;
    }

    public static int singleNumber2(int[] nums) {
        return Arrays.stream(nums)
                .reduce(0, (acc, x) -> acc ^ x);
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1};
        int[] nums2 = {4,1,2,1,2};
        int[] nums3 = {1};
        System.out.println(singleNumber2(nums));
    }
}
