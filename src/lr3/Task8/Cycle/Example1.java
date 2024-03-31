package lr3.Task8.Cycle;

import lr3.Task7.Node;

public class Example1 {
    public static void main(String[] args) {
        Node node = CreateHead(15);
        Remove(5, node);
        System.out.println(toString(node));
    }
    public static Node CreateHead(int n){
        Node node = new Node(null, n);
        for (int i = n-1; i>0; i--){
            node = new Node(node,i);
        }
        return node;
    }
    public static Node CreateTail(int n){
        Node node = null;
        for (int i = 1; i<=n;i++){
            node = new Node(node,i);
        }
        return node;
    }
    public static String toString(Node node) {
        String str = "";
        Node ref = node;
        while (ref!=null) {
            str = str + ref.value;
            ref = ref.next;
        }
        return str;
    }
    public static void Insert(int index, Node node, int num) {
        Node ref = node;
        int count = 0;
        while(ref!= null) {
            if(count == index) {
                ref.value = num;
            }
            count++;
            ref = ref.next;
        }
    }
    public static void AddLast(Node node) {
        Node ref = node;
        while(ref!= null) {
            if(ref.next == null) {
                ref.next = new Node(null, -1);
                break;
            }
            ref = ref.next;
        }
    }
    public static Node Addfirst(Node node) {
        return new Node(node, -1);
    }
    public static void RemoveLast(Node node) {
        Node ref = node;
        while(ref!= null) {
            if(ref.next.next == null) {
                ref.next = null;
                break;
            }
            ref = ref.next;
        }
    }
    public static Node RemoveFirst(Node node) {
        return node.next;
    }
    public static void Remove(int index, Node node) {
        Node ref = node;
        int count = 0;
        while(ref!= null) {
            if(count == index - 1) {
                ref.next = ref.next.next;
                break;
            }
            count++;
            ref = ref.next;
        }
    }
}
