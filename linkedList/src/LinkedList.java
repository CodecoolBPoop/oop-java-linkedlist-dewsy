import java.util.ArrayList;
import java.util.List;

public class LinkedList {

    private List<Node> linkedList = new ArrayList<>();
    private int length = -1;
    public Node head;
    public Node tail;


    public Node add(Object object){
        length +=1;
        Node node = new Node(object, length, length + 1);
        if (length == 0) { this.head = node; }
        this.tail = node;
        linkedList.add(node);
        return node;
    }

}
