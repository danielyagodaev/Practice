package problems.data_structers.queues_and_stacks.calculator;

import java.util.HashMap;
import java.util.Stack;
import java.util.function.IntBinaryOperator;

public class PrefixPostfixCalculatorNotation {

    private static boolean isOperator(String s, HashMap<Character, IntBinaryOperator> operators){
        return (s.length() == 1 && operators.containsKey(s.charAt(0)));
    }

    private static boolean isNumber(String s){
        try{
            int val = Integer.parseInt(s);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    private static boolean inputIsValid(String op, String num1, String num2,
                                        HashMap<Character, IntBinaryOperator> operators){
        return (isOperator(op, operators) && isNumber(num1) && isNumber(num2));
    }

    private static boolean canPerformAction(Stack<String> stack, HashMap<Character, IntBinaryOperator> operators){
        if (stack.size() < 3) {
            return false;
        }
        String num2AsString = stack.pop();
        String num1AsString = stack.pop();
        String opAsString = stack.pop();
        if (inputIsValid(opAsString, num1AsString, num2AsString, operators)){
            int num1 = Integer.parseInt(num1AsString);
            int num2 = Integer.parseInt(num2AsString);
            IntBinaryOperator op = operators.get(opAsString.charAt(0));
            int res = op.applyAsInt(num1, num2);
            stack.push(String.valueOf(res));
            return true;
        }
        else{
            stack.push(opAsString);
            stack.push(num1AsString);
            stack.push(num2AsString);
        }
        return false;
    }

    public static int prefixNotation(String s, HashMap<Character, IntBinaryOperator> operators) throws Exception {
        if (s == null || s.length() == 0){
            return 0;
        }
        String[] parts = s.split(" ");
        Stack<String> stack = new Stack<>();
        for (int i=0; i<parts.length; i++){
            String curr = parts[i];
            stack.push(curr);
            while (canPerformAction(stack, operators));
        }
        if (stack.size() == 1){
            return Integer.parseInt(stack.pop());
        }
        else{
            throw new Exception("Invalid expression");
        }
    }

    public static int postfixNotation(String s, HashMap<Character, IntBinaryOperator> operators) throws Exception {
        if (s == null || s.length() == 0){
            return 0;
        }
        String[] parts = s.split(" ");
        Stack<String> stack = new Stack<>();
        for (int i=0; i<parts.length; i++){
            String curr = parts[i];
            if (isNumber(curr)){
                stack.push(curr);
            }
            else if (isOperator(curr, operators)){
                if (stack.size() < 2){
                    throw new Exception("Invalid Expression");
                }
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                IntBinaryOperator op = operators.get(curr.charAt(0));
                int temp = op.applyAsInt(num1, num2);
                stack.push(String.valueOf(temp));
            }
        }
        if (stack.size() == 1){
            return Integer.parseInt(stack.pop());
        }
        else{
            throw new Exception("Invalid expression");
        }
    }

}
