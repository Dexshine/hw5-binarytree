public class Main {
    
    public static Node constructTree1(){
        Node root = new Node(3); // create root node
        //left side of tree
        root.left = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(6);
        root.left.right.left = new Node(1);
        root.left.right.right = new Node(8);
        //right side of tree
        root.right = new Node(5);
        root.right.right = new Node(9);
        root.right.right.left = new Node(4);
        
        return root; //return root node
    }

    public static Node constructTree2(){
        Node root = new Node(1);
        //left side of tree
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(8);
        root.left.right.right.right = new Node(10);
        //right side of tree
        root.right = new Node(3);
        root.right.right = new Node(6);
        root.right.right.left = new Node(9);
        
        return root; //return root node
    }
    
    public static void main(String[] args) {
        
        // Node tree = Main.constructTree1();
        // tree.printTree();
        // tree.printBFT();
        // tree.printDFT();

        Node tree = Main.constructTree2();
        tree.printTree();
        tree.printBFT();
        tree.printDFT();

        //stack test case 1
        // Stack s = new Stack(4);
        // s.pop();
        // s.push(new Node(5));
        // s.push(new Node(6));
        // s.push(new Node(7));
        // s.push(new Node(8));
        // s.printStack();
        // s.push(new Node(9));
        // System.out.println(s.pop().data);
        // System.out.println(s.pop().data);
        // System.out.println(s.pop().data);
        // s.printStack();
        
        //queue test case 1
        // Queue q = new Queue(4);
        // q.dequeue();
        // q.enqueue(new Node(5));
        // q.enqueue(new Node(6));
        // q.enqueue(new Node(7));
        // q.enqueue(new Node(8));
        // q.printQueue();
        // q.enqueue(new Node(9));
        // System.out.println(q.dequeue().data);
        // System.out.println(q.dequeue().data);
        // System.out.println(q.dequeue().data);
        // q.printQueue();

        //queue test case 2
        // Queue q = new Queue(4);
        // q.printCircularIndices();
        // q.enqueue(new Node(5));
        // q.enqueue(new Node(6));
        // q.printCircularIndices();
        // q.enqueue(new Node(7));
        // q.enqueue(new Node(8));
        // q.printCircularIndices();
        // q.printQueue();
        // System.out.println(q.dequeue().data);
        // q.printCircularIndices();
        // System.out.println(q.dequeue().data);
        // q.printCircularIndices();
        // System.out.println(q.dequeue().data);
        // q.printCircularIndices();
        // q.enqueue(new Node(9));
        // q.enqueue(new Node(10));
        // q.enqueue(new Node(11));
        // q.printQueue();
    }
}
