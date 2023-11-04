public class NodePerson {
    private Penson obj;
    private NodePerson next = null;
    ////// методыыы

    NodePerson(Penson obj){
        this.obj = obj;
    }
    public NodePerson getNext(){
        return next;

    }
    public void setNext(NodePerson obj){
        this.next = obj;
    }
    public Penson getPerson(){
        return obj;
    }
    @Override
    public String toString(){
        return obj.toString();
    }

}
