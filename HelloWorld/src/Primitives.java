public class Primitives {
    public static void main(String[] args){
        /**
         * The letters at the end just type cast the number, not necessary, kinda stupid
         */
        // 8 bit
        byte myByte = 10;
        // 16 bit
        short myShort = 20;
        // 32 bit
        int myInt = 50;
        // 64 bit
        long myLong = (50_000L + 10L*(myByte + myShort + myInt));
        /***********************************************************/
        // 32 bit
        float myFloat = 2.2362f;
        // 64 bit
        double myDouble = 2.236d;
        System.out.println(poundsToKilos(200));
        /***********************************************************/
        // 16 bits
        char myChar = '\u00A9';
        System.out.println(myChar);

        boolean myBool = true;
        /***********************************************************/

        System.out.println(limit(20d, 80d));

    }

    private static String limit(double a, double b){
        return ((((a + b) * 25d) % 40d) <= 20d) ? "Total was over the limit" : "Total was not over the limit";
    }

    private static double poundsToKilos(double pounds){
        return (pounds * .45359237d);
    }
}