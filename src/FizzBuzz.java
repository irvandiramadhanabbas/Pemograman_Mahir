public class FizzBuzz {

    public static void main(String[] args) {

        int i = -1;

        System.out.println(fizzBuzz(i));

    }

    public static String fizzBuzz(int i) {

        if (i % 3 == 0 && i % 5 == 0) {

            return "FizzBuzz";

        } else if (i % 3 == 0) {

            return "Fizz";

        } else if (i % 5 == 0) {

            return "Buzz";

        } else {

            return "" + i;

        }

    }

}