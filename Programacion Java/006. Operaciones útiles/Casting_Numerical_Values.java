public class Application {
    public static void main(String[] args) {
        byte byteValue = 3;
        short shortValue = 38;
        int intValue = 29;
        long longValue = 49836;
        String stringValue = "67";

        float floatValue = 678.9f;
        double doubleValue = 235.67;

        System.out.println(Byte.MAX_VALUE);

        intValue = (int) longValue;
        System.out.println(intValue);

        intValue = (int) floatValue;
        System.out.println(intValue);

        intValue = Integer.parseInt(stringValue);
        System.out.println(intValue);
    }
}
