public class StackLinkedList implements Stack {
    StackItem top=null;

    @Override
    public void push(Object item) {
        StackItem temp_box=new StackItem(item);
        StackItem previous_top=top;
        top=temp_box;
        top.setNext(previous_top);
    }

    @Override
    public void pop() throws MyEmptyStackException {
        if (this.top==null){
            throw new MyEmptyStackException("Stack is empty, you can't pop anything from the stack");
        }
    }

    @Override
    public void peek() {
        System.out.println("The top is: "+top.getItem());
    }

    @Override
    public boolean isEmpty() {
        return this.top==null;
    }



}
