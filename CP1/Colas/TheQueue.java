package colas;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Random;

public class TheQueue<Type> implements TheQueueInterface<Type> {

    
    private Deque<Type> _queue;

    
    public TheQueue() {
        _queue = new ArrayDeque<Type>();
    }

    @Override
    public void enqueue(Type item) {
        _queue.addLast(item);
    }

 
    @Override
    public Type dequeue() {
        return _queue.pollFirst(); 
    }

    @Override
    public Type getFront() {
        return _queue.peekFirst(); 
    }

    @Override
    public Boolean isEmpty() {
        return _queue.isEmpty();
    }

    @Override
    public Integer getSize() {
        return _queue.size();
    }

    @Override
    public String print() {
        return _queue.toString();
    }

    
    @Override
    public String[] getCodons() {
        int n = _queue.size();
        String[] codons = new String[n / 3];
        StringBuilder current = new StringBuilder();
        int index = 0;

        while (!_queue.isEmpty()) {
            current.append(_queue.pollFirst());
            if (current.length() == 3) {
                codons[index++] = current.toString();
                current = new StringBuilder();
            }
        }
        return codons;
    }

    
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); 
        TheQueueInterface<String> queue = new TheQueue<String>();
        Random random = new Random();
        String[] nucleotides = { "A", "C", "G", "T" };

        System.out.println("Filled {full}");
        for (int i = 0; i < n; i++) {
            queue.enqueue(nucleotides[random.nextInt(4)]);
        }
        System.out.println(" ↳ print() → " + queue.print());
        System.out.println("   ↳ getFront() → " + queue.getFront());
        System.out.println("   ↳ getSize() → " + queue.getSize());
        System.out.println("   ↳ isEmpty() → " + queue.isEmpty());

        System.out.println();
        System.out.println("getCodons() → " + Arrays.toString(queue.getCodons()));

        System.out.println();
        System.out.println("End {empty}");
        System.out.println(" ↳ print() → " + queue.print());
        System.out.println("   ↳ getFront() → " + queue.getFront());
        System.out.println("   ↳ getSize() → " + queue.getSize());
        System.out.println("   ↳ isEmpty() → " + queue.isEmpty());
    }
}
