/**
 * Created by admin on 28.09.2017.
 */
public class LIambdaApp {
    public static void main(String[] args) {
        Operationable operationable;
        operationable = (x, y) -> x + y;

        int result = operationable.calculate(10 , 20);
        System.out.println(result);
    }
}

interface Operationable {
    int calculate(int x , int y);
}