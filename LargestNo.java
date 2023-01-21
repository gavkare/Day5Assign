package Day5Assign;

public class LargestNo {

        public static void main(String args[]) {

            int x = 77;
            int y = 65;
            int z = 66;


            if (x >= y && x >= z) {
                System.out.println(x + " is The Largest Number");
            } else if (y >= z) {
                System.out.println(y + " is The Largest Number");
            } else {
                System.out.println(z + " is The Largest Number");
            }
        }
    }
