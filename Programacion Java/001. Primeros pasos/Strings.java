public class Strings {
    public static void main(String[] args) {
        int aNumber = 9;
        double aDouble = 8.4545;

        String text = "Hello";
        String blank = " ";
        String moreText = "there";
        String result = text + blank + moreText;

        text.length();

        System.out.println(text + blank + moreText);
        System.out.println("Hello" + " " + "there");
        System.out.println(result);
        System.out.println("My numbers: "+ aNumber+", "+aDouble);
    }
}
