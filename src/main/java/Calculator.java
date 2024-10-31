import java.util.List;
import java.util.Deque;
import java.util.LinkedList;

// calculator class to run the logic

public class Calculator {

    private  final Deque<Number> stack = new LinkedList<>();

    private static final List<String> OPERATORS = List.of("+","-");

    public void push(Object arg) {
        if (OPERATORS.contains(arg)){
            Number y = stack.removeLast();
            Number x = stack.removeLast();
            Double answer = null;

            switch (arg.toString()){
                case "+":
                    answer = x.doubleValue() + y.doubleValue();
                    break;
                case "-":
                    answer = x.doubleValue() - y.doubleValue();
                    break;
                default:
                    answer = x.doubleValue() + y.doubleValue();
                    break;
            }
            push(answer);
        }
        else{
            stack.add((Number) arg);
        }


    }


    public Number value() {
        return stack.getLast();
    }
}
