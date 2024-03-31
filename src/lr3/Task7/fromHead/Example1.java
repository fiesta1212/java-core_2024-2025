package lr3.Task7.fromHead;

import lr3.Task7.Node;

public class Example1 {
    public static void main(String[] args) {
        Node node0 = new Node(null,0);
        Node node1 = new Node(null, 1);
        Node node2 = new Node(null,2);
        Node node3 = new Node(null,3);
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        Node ref = node0;
        while (ref != null){
            System.out.println(ref.value);
            ref = ref.next;
        }
    }
}
