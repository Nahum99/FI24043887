package pilas;

import java.util.Random;
import java.util.Stack;

public class TheStack<Type> implements TheStackInterface<Type> {

 
    private Stack<Type> _stack;
    private Integer _capacity;

    public TheStack(Integer capacity) {
        _stack = new Stack<Type>();
        _capacity = capacity;
    }

    
    @Override
    public Boolean push(Type item) {
        Boolean available = _stack.size() < _capacity;
        if (available) {
            _stack.push(item); 
        }
        return available;
    }

  
    @Override
    public Type pop() {
        return _stack.isEmpty() ? null : _stack.pop();
    }

    @Override
    public Type peek() {
        return _stack.isEmpty() ? null : _stack.peek();
    }

   
    @Override
    public Boolean empty() {
        return _stack.isEmpty();
    }

    @Override
    public Integer size() {
        return _stack.size();
    }

    @Override
    public String print() {
        return _stack.toString();
    }

    
    public static void main(String[] args) {
        Integer capacity = Integer.parseInt(args[0]);
        TheStackInterface<Double> stack = new TheStack<Double>(capacity);
        System.out.println("Pushing {capacity + 1}");
        Random random = new Random();
        for (int n = 0; n <= capacity; n++) {
            Double number = random.nextDouble();
            Boolean pushed = stack.push(number);
            System.out.println(" ↳ push(" + number + ") → " + pushed);
        }
        System.out.println();
        System.out.println("Pushed {full}");
        System.out.println(" ↳ print() → " + stack.print());
        System.out.println("   ↳ peek() → " + stack.peek());
        System.out.println("   ↳ size() → " + stack.size());
        System.out.println("   ↳ empty() → " + stack.empty());
        System.out.println();
        System.out.println("Popping {capacity + 1}");
        for (int n = 0; n <= capacity; n++) {
            var popped = stack.pop();
            System.out.println(" ↳ pop() → " + popped);
        }
        System.out.println();
        System.out.println("Popped {empty}");
        System.out.println(" ↳ print() → " + stack.print());
        System.out.println("   ↳ peek() → " + stack.peek());
        System.out.println("   ↳ size() → " + stack.size());
        System.out.println("   ↳ empty() → " + stack.empty());
    }
}
