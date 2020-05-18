import static java.lang.Integer.parseInt;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        try {
            int num = parseInt(args[0]);
            int result = (int) sqrt(num);
            for (int i = 1; i < result; i++) {
                System.out.print(i + ", ");
            }
        } catch (Exception ex) {
            System.out.println("Please enter the number");
            System.exit(1);
        }
    }
}
