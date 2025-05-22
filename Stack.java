public interface Stack {
    void push(Object o);
    void pop() throws MyEmptyStackException;
    void peek();
    boolean isEmpty();
}
