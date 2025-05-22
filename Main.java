import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /*Stack stack=new StackArray();
        stack.push("String");
        stack.push(12);
        stack.peek();
        System.out.println("Pop="+stack.pop());*/

        /*StackLinkedList stack = new StackLinkedList();
        stack.push("5");
        stack.push("it is a string");
        stack.peek();
        System.out.println(stack.top.getItem());
        System.out.println(stack.top.getNext());
        System.out.println(stack.top.getNext().getNext());*/

        Stack stack=new StackLinkedList();
        try{
            stack.pop();

        }catch(Exception e){
            System.out.println(e);
        }


        /*ArrayList<String> stringArrayList=new ArrayList<>();
        stringArrayList.add("String");
        HashMap<String,Double> grades=new HashMap<String,Double>();
        grades.put("Ali",35.0);
        System.out.println(grades);
        grades.put("Pelin",98.0);
        System.out.println(grades);
        grades.put("Enes",10.0);
        System.out.println(grades);
        grades.put("Ali",60.0);
        System.out.println(grades);
        System.out.println(grades.keySet() instanceof Set);
        */




    }
}
