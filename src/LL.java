import java.util.LinkedList;
import java.util.Objects;

public class LL<T> {
    Node<T> root;


    public void add(T value) {
        if (Objects.isNull(root)) {
            root = new Node<T>(value);
            return;
        }
        Node<T> thisNode = root;
        while (thisNode.next != null) {
            thisNode = thisNode.next;
        }
        thisNode.next = new Node<T>(value);
    }

    public T get(int index) {
        Node<T> node = root;
        int counter = 0;
        while (counter != index) {
            node = node.next;
            counter++;
        }
        return node.value;
    }

    public void delete(int index) {
        Node<T> node = root;
        Node<T> previous = root;
        int counter = 0;
        while (counter != index) {
            previous = node;
            node = node.next;
            counter++;
        }
        previous.next = node.next;
    }

    public void add(int index, T value) {
        if(root.next==null || root==null){
            add(value);
            return;
        }
        Node<T> node = root;
        Node<T> previous = root;
        int counter = 0;
        while (counter != index) {
            previous = node;
            node = node.next;
            counter++;
        }
        previous.next = new Node<>(value);
        previous.next.next = node;

    }
}
