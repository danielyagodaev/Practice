package problems.data_structers.queues_and_stacks.calculator;

import java.util.HashMap;
import java.util.function.IntBinaryOperator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTester {

    private static HashMap<Character, IntBinaryOperator> getOperations() {
        HashMap<Character, IntBinaryOperator> operators = new HashMap<>();
        operators.put('+', (Integer::sum));
        operators.put('-', (a,b) -> a-b);
        operators.put('*', (a,b) -> a*b);
        operators.put('/', (a,b) -> a/b);
        return operators;
    }

    @Test
    public void prefixTest1(){
        HashMap<Character, IntBinaryOperator> operators = getOperations();
        try {
            assertEquals(PrefixPostfixCalculatorNotation.prefixNotation("+ 3 * 4 5", operators), 23);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void prefixTest2(){
        HashMap<Character, IntBinaryOperator> operators = getOperations();
        try {
            assertEquals(PrefixPostfixCalculatorNotation.prefixNotation("* * * 1 2 3 4", operators), 24);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void prefixTest3(){
        HashMap<Character, IntBinaryOperator> operators = getOperations();
        try {
            assertEquals(PrefixPostfixCalculatorNotation.prefixNotation("+ / 5 1 5", operators), 10);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void postfixTest1(){
        HashMap<Character, IntBinaryOperator> operators = getOperations();
        try {
            assertEquals(PrefixPostfixCalculatorNotation.postfixNotation("3 4 5 * +", operators), 23);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void postfixTest2(){
        HashMap<Character, IntBinaryOperator> operators = getOperations();
        try {
            assertEquals(PrefixPostfixCalculatorNotation.postfixNotation("6 8 + 12 14 + +", operators), 40);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void postfixTest3(){
        HashMap<Character, IntBinaryOperator> operators = getOperations();
        try {
            assertEquals(PrefixPostfixCalculatorNotation.postfixNotation("1 2 3 4 5 * * * *", operators), 120);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
