public class DListNode{
    private Object value;
    private DListNode next;
    private DListNode previous;

    // Constructor:
    public DListNode(Object initValue,
                     DListNode initNext,
                     DListNode initPrevious){

        value = initValue;
        next = initNext;
        previous = initPrevious;
    }

    public Object getValue(){
        return value;
    }

    public DListNode getNext(){
        return next;
    }

    public DListNode getPrevious(){
        return previous;
    }

    public void setValue(Object theNewValue){
        value = theNewValue;
    }

    public void setNext(DListNode theNewNext){
        next = theNewNext;
    }

    public void setPrevious(DListNode theNewPrevious){
        previous = theNewPrevious;
    }
}
