import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        try {
            int num = parseInt(args[0]);
            Numerical number = new Numerical(num);
            number.numbers();
        }catch (Exception ex){
            System.out.println("Please enter the number");
            System.exit(1);
        }
    }
}
