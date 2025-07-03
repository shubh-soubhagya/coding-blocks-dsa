public class cuberoot {
    public static void main(String[] args) {

        int x = 27;  // You can change this value
        int i = 0;
        int j = x;

        while (i <= j) {
            int mid = (j - i) / 2 + i;

            if ((long) mid * mid * mid == x) {
                System.out.println(mid);
                return;
            } else if ((long) mid * mid * mid > x) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        System.out.println(j);  // Floor of cube root
    }
}
