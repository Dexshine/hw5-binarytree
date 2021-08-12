//inherit attributes and methods from class BTreePrinter
public class Node extends BTreePrinter{

    Node left;
    Node right;
    int data;

    //constructor
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void printTree() {
        // uncomment the following line and fix the errors
        //use method printTree from superclass
        super.printTree(this); //argument is root node
    }

    //print data in Breadth-First Traversal format by using Queue
    public void printBFT() {
        Queue q = new Queue(50); //create empty queue
        System.out.print("BFT node sequence [ ");
        //BFT
        if(this == null){//Empty tree
            return;
        }else{//Non-empty tree
            q.enqueue(this); //pushBack root to queue q
            while(!q.isEmpty()){///while queue q isn't empty
                Node curNode = q.dequeue(); //current node = q.popFront
                System.out.print(curNode.data + " ");
                //if current node.left exist, pushBack that node
                if(curNode.left != null) q.enqueue(curNode.left);
                //if current node.right exist, pushBack that node
                if(curNode.right != null) q.enqueue(curNode.right);
            }
        }
        
        System.out.println("]");
    }

    public void printDFT() { // PreOrder
        Stack s = new Stack(50);
        System.out.print("DFT node sequence [ ");
        //DFT PreOrder
        if(this == null){//Empty tree
            return;
        }else{//Non-empty tree
            s.push(this);//pushBack root to stack s
            while(!s.isEmpty()){//while stack s isn't empty
                Node curNode = s.pop();//current node = s.popBack
                System.out.print(curNode.data + " ");
                //if current node.left exist, pushBack that node
                if(curNode.right != null) s.push(curNode.right);
                //if current node.right exist, pushBack that node
                if(curNode.left != null) s.push(curNode.left);
            }
        }
        System.out.println("]");
    }

}
