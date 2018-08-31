public class ThingsToRemember {

    /**
     * static: Doesn't rely on an instance of the object
     * final: const
     */
    private static final String MY_STRING = "Hello";

    public static void main(String[] args) {

    }

    public static void Operators() {
        /**
         * Operators
         * +, -, /, %, &&, !, ++, +=, ||, etc
         */
    }

    public static void KeywordsAndExpressionsAndLiterals() {
        /**
         * Keyword: int
         * Expression: myInt = 2;
         * Literal: 2
         */
        int myInt = 2;

        /**
         * Expression: "Text"
         */
        System.out.println("Text");
    }

    public static int reverseANumber(int number) {
        int reversed = 0;
        int lastDigit = 0;
        int num = Math.abs(number);

        /**
         * Take the last digit, place it in the new number
         * multiply new number by 10 to shift it left
         * divide old number by 10 to remove last digit
         * repeat until old number is 0
         */
        while (num != 0){
            lastDigit = num % 10;
            reversed += lastDigit;
            reversed *= 10;
            num /= 10;
        }

        if (number < 0) return reversed * -1;
        return reversed;
    }

    public static void wrapperClasses() {
        /**
         * A wrapper class is a class that acts on primitives
         * Integer is a wrapper class
         */
        int number = Integer.parseInt("20");
    }
}
