import static java.lang.Math.pow;

public class Numerical {
    int num;

    public Numerical(int num) {
        this.num = num;
    }

    public void numbers(){
        int result=0;
        for (int i = 1; i < num; i++) {
            result = (int) pow(i, 2);
            if(num > result)
                System.out.println(i);
        }

    }
}
