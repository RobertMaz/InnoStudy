public class Test {
    public static void main(String[] args) {
        System.out.println((int)42.50 );
        System.out.println(42.50 % (int)42.50 * 10);
        String data = "    N=42  ";
        String newData = data.substring(data.indexOf("=") + 1).trim();
        System.out.println(Integer.valueOf(newData));
    }
}
