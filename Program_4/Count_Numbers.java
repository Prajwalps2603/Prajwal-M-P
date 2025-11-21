package Program_4;

public class Count_Numbers {
	
    public static void main(String[] args) {

        int[] arr = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        System.out.print("{ ");

        for (int i = 1; i <= 9; i++) {
            int count = 0;

            for (int n : arr) {
                if (n % i == 0) {
                    count++;
                }
            }

            System.out.print(i + ": " + count);

            if (i != 9) {
                System.out.print(", ");
            }
        }

        System.out.println(" }");
    }
}
