package sec01;

public class SignOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        x = -x; // x = -(-100) = 100
        System.out.println(x); // 100

        byte b = 100;
        int y = -b;
        System.out.println(y); // -100
    }
}