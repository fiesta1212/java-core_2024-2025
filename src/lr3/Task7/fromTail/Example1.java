package lr3.Task7.fromTail;

import lr3.Task7.Node;

public class Example1 {
    public static void main(String[] args) {
        Node head = null;
        for (int i = 9; i >= 0; i--){
            head = new Node(head,i);
        }
        Node ref = head;
        while (ref != null){
            System.out.println(ref.value);
            ref = ref.next;
        }
    }
}
