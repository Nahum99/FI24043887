import java.util.ArrayList;

public class MyStackCharacter {

    private ArrayList<Character> myList = new ArrayList<>();
    private int CAPACITY = 1000; 
 
    public void push(char ch) {
        if (myList.size() < CAPACITY) {
            System.out.println("\n push: " + ch);
            myList.add(ch);
        } else {
            System.out.println("\n 'push' failed: Stack overflow");
        }
        print();
    }

   
    public char pop() {
        if (!myList.isEmpty()) {
            char ch = myList.remove(myList.size() - 1);
            System.out.println("\n pop: " + ch);
            print();
            return ch;
        } else {
            System.out.println("\n 'pop' failed: Stack underflow");
            print();
            return '\0'; // carácter nulo
        }
    }

    
    public char peek() {
        if (!myList.isEmpty()) {
            char ch = myList.get(myList.size() - 1);
            System.out.println("\n peek: " + ch);
            print();
            return ch;
        } else {
            System.out.println("\n 'peek' failed: Stack underflow");
            print();
            return '\0';
        }
    }

 
    public boolean empty() {
        boolean isEmpty = myList.isEmpty();
        System.out.println("\n empty: " + isEmpty);
        print();
        return isEmpty;
    }

    
    public int size() {
        int count = myList.size();
        System.out.println("\n size: " + count);
        print();
        return count;
    }

     
        private void print() {
        System.out.print("  ↳ Stack: ");
        System.out.println(myList);
    }
}
