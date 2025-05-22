import java.util.ArrayList;
import java.util.Objects;

public class StackArray implements Stack{
    private ArrayList<Object> stack=new ArrayList<Object>();


    @Override
    public void push(Object item) {
        stack.add(0,item);
    }

    @Override
    public Object pop() {
        if (this.isEmpty()){
            throw new MyEmptyStackException("Stack is Empty, you can't pop");
        }

    @Override
    public void peek() {
        if(this.isEmpty()){
            System.out.println("Stack is empty!");
            return;
        }

        System.out.println("The top element is: "+stack.get(0));
    }

    @Override
    public boolean isEmpty() {
        return stack.size()==0;
    }
}
