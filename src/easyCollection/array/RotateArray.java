package easyCollection.array;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        int value=0;
        for(int j=1 ;j <=k;j++){
            value= nums[nums.length-1];
            for(int i=nums.length - 2;i>=0 ;i--){
                nums[i+1] = nums[i];
            }
            nums[0]= value;
        }

    }


    static void reverse(int[] array, int start, int end){
        while(start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate2(int[] nums, int k) {
        //giảm số lần nếu k xoay quá nhiều lần nhưng kq vẫn giống số làn quay trước đó
        k = k% nums.length;
        //nếu gọi hàm với start =0 end = length-1 thì số sẽ đi về ở giữa, mục tiêu là làm các số đi từ phải sang trái
        //đảo từ 0 đến length-1-k (làm để đi ngược từ phải sang trái)
        reverse(nums, 0,  nums.length-k-1);
        //đảo từ 0 đến length-1-k (làm để đi ngược từ phải sang trái)
        reverse(nums,  nums.length-k, nums.length-1);
        //đảo ngược lại tất cả lại từ trái sang phải
        reverse(nums, 0, nums.length-1);


    }

    public static void main(String[] args) {
        int[] demo = {1,2,3,4,5,6,7}; //3
        int[] demo2 = {-1,-100,3,99};//2
        rotate2(demo2, 3);
        for (int i=0;i<demo.length;i++){
            System.out.println(demo[i]);
        }
    }
}
