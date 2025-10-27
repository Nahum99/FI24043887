package colas;

public interface TheQueueInterface<Type> {

    void enqueue(Type item);   
    Type dequeue();            
    Type getFront();           
    Boolean isEmpty();        
    Integer getSize();        
    String print();            
    String[] getCodons();      
}
