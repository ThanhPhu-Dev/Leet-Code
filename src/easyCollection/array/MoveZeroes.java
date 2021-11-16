package easyCollection.array;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        if(nums.length == 1){
            return;
        }
        int positionZero = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[positionZero] != 0 ){
                positionZero++;
            }
            if(i > positionZero && nums[i] != 0){
                nums[i] = nums[positionZero];
                nums[positionZero] = 0;
                positionZero++;
            }
        }
    }

    public static void moveZeroes2(int[] nums) {
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[count]=nums[i];
                count++;
            }
        }
        for(int i=count;i<nums.length;i++){
            nums[i]=0;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {0,1,0,3,12};
        int[] nums2 = {1,0,1};
        int[] nums3 = {4,2,4,0,0,3,0,5,1,0};
        moveZeroes(nums3);
        for(int i=0;i<nums3.length;i++){
            System.out.println(nums3[i]);
        }
    }
}
