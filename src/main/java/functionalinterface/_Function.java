package functionalinterface;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int increment = incrementByOne(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2); // senf
    }


    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static int incrementByOne(int number) {
        return number + 1;
    }
}
