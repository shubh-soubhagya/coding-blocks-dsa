
public class boston {
    public static void main(String[] args) {

        int num = 378;
        int temp = num;
        int fact = 2;
        int factsum = 0;

        while (temp > 1) {
            if (temp % fact == 0) {
                int tempfact = fact;

                while (tempfact > 0) {
                    int ld = tempfact % 10;
                    factsum = factsum + ld;
                    tempfact = tempfact / 10; // fixed this line
                }

                temp = temp / fact;
            } else {
                fact++; // added missing semicolon
            }
        }

        temp = num; // fixed: was "n" before
        int digitsum = 0;

        while (temp > 0) { // fixed: was only one-time check with if
            int ld = temp % 10;
            digitsum = digitsum + ld;
            temp = temp / 10;
        }

        System.out.println(digitsum == factsum ? "Boston Number" : "Not Boston Number");
    }
}
