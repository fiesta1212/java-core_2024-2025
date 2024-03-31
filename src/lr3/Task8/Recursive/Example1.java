package lr3.Task8.Recursive;

import lr3.Task7.Node;

public class Example1 {
    public static void main(String[] args) {
        Node node =  createTailRec(5, null);
        System.out.println(toStringRec(node));
    }
    public static Node createTailRec(int n, Node node){
        if (n == 0){
            node = new Node(null,n);
        }
        else{
            node = new Node(createTailRec(n-1,node),n);
        }
        return node;
    }
    public static Node createHeadRec(int n){
        Node node =  null;
        if (n == 0){
            node = new Node(null,n);
        }
        else{
            node = new Node(createHeadRec(n-1),n);
        }
        return node;
    }
    public static String toStringRec(Node node) {
        Node ref = node;
        if(ref.next == null) {
            return Integer.toString(node.value);
        }
        else {
            return Integer.toString(node.value) + toStringRec(ref.next);
        }
    }
}
