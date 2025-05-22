public class StackItem {
    private Object item;
    private StackItem next;

    public StackItem(Object item) {
        this.item = item;
    }

    public StackItem(Object item, StackItem next) {
        this.item = item;
        this.next = next;
    }

    public StackItem() {}

    public Object getItem() {
        if(item == null){
            return "NULL";
        }
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public StackItem getNext() {
        return next;
    }

    public void setNext(StackItem next) {
        this.next = next;
    }
}
