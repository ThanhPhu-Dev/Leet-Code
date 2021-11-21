package easyCollection.strings;

public class ReverseInteger {
    public static int reverse(int x) {
        int du=x%10;
        int tong = x/10;
        int rs = du;
        while (tong != 0) {
            du = tong%10;
            tong = tong / 10;
            try {
                Math.multiplyExact(rs,10);
                rs = rs*10 + du;
            }catch (ArithmeticException e){
                return 0;
            }
        }
        return rs;
    }

    public static void main(String[] args) {
        int x = 123;//321
        int x2 = -123;//-321
        int x3 = 1534236469;//0
        System.out.println(reverse(x));
    }
}
