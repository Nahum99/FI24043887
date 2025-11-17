
import java.util.Arrays;
import java.util.Stack;

public class BinTreeIntArray {

    private Integer[] _tree;

    public BinTreeIntArray(int size) {
        _tree = new Integer[size];
    }

    public Integer[] getTree() {
        return _tree;
    }

    // INSERT 
    public void insert(int value) {

        int i = 0;

        while (i < _tree.length) {

            if (_tree[i] == null) {
                _tree[i] = value;
                break;
            }

            if (value < _tree[i]) {
                i = 2 * i + 1;  // left
            } else {
                i = 2 * i + 2;  // right
            }
        }

        System.out.println(" ↳ insert: " + value + " → " + Arrays.toString(_tree));
    }

    // INORDER 
    public void inOrderTraversal() { // left -> root -> right
        System.out.print(" ↳ inOrderTraversal → ");
        var stack = new Stack<Integer>();
        var index = 0;
        while (!stack.isEmpty() || (index < _tree.length && _tree[index] != null)) {
            while (index < _tree.length && _tree[index] != null) {
                stack.push(index);
                index = 2 * index + 1;
            }
            index = stack.pop();
            System.out.print(_tree[index] + " ");
            index = 2 * index + 2;
        }
        System.out.println();
    }

    // PREORDER 
    // root → left → right
    public void preOrderTraversal() {
        System.out.print(" ↳ preOrderTraversal → ");

        if (_tree[0] == null) {
            System.out.println();
            return;
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        while (!stack.isEmpty()) {

            int i = stack.pop();
            System.out.print(_tree[i] + " ");

            int right = 2 * i + 2;
            int left = 2 * i + 1;

            if (right < _tree.length && _tree[right] != null) {
                stack.push(right);
            }

            if (left < _tree.length && _tree[left] != null) {
                stack.push(left);
            }
        }

        System.out.println();
    }

    // POSTORDER 
    // left → right → root
    public void postOrderTraversal() { // left -> right -> root
        System.out.print(" ↳ postOrderTraversal → ");

        if (_tree[0] == null) {
            System.out.println();
            return;
        }

        Stack<Integer> stack = new Stack<>();
        Integer lastVisited = null;
        int index = 0;

        while (!stack.isEmpty() || (index < _tree.length && _tree[index] != null)) {

            while (index < _tree.length && _tree[index] != null) {
                stack.push(index);
                index = 2 * index + 1;
            }

            int peek = stack.peek();
            int right = 2 * peek + 2;

            // sin variable booleana
            if (right >= _tree.length
                    || _tree[right] == null
                    || (lastVisited != null && lastVisited == right)) {

                System.out.print(_tree[peek] + " ");
                lastVisited = peek;
                stack.pop();

            } else {
                index = right;
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        var tree = new BinTreeIntArray(7);
        System.out.println("Empty array → " + Arrays.toString(tree.getTree()));
        tree.insert(4);
        tree.insert(6);
        tree.insert(5);
        tree.insert(2);
        tree.insert(7);
        tree.insert(1);
        tree.insert(3);
        System.out.println("\nFull array → " + Arrays.toString(tree.getTree()));
        tree.inOrderTraversal(); // 1 2 3 4 5 6 7
        tree.preOrderTraversal(); // 4 2 1 3 6 5 7
        tree.postOrderTraversal(); // 1 3 2 5 7 6 4
    }
}
