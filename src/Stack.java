public class Stack {
    Node[] arr; // regular array
    int capacity;
    int size;

    //constructor
    public Stack(int cap){
        this.arr = new Node[cap];
        this.capacity = cap;
        this.size = 0;
    }
    
    //pushBack node to stack
    public void push(Node node){
        if (!isFull()){//stack isn't full
            this.arr[size] = node; //push node at index = size
            //increase amount of node in stack and change index position that we can push next time
            ++this.size;
        }else{
            System.out.println("Stack Overflow!!!");
        }
    }
    
    //popBack node
    public Node pop(){
        if (!isEmpty()){//Non-empty stack
            //decrease amount of node in stack and change index positino that we can push next time
            --this.size;
            return this.arr[size];//popBack
        }else{
            System.out.println("Stack Underflow!!!");
            return null;
        }
    }
    public boolean isFull(){
        //if size = cap, return true(array is full)
        return this.size == this.capacity;
    }
    public boolean isEmpty(){
        //if size = 0 return true(array is empty)
        return this.size == 0;
    }
    
    public void printStack(){
        if (!isEmpty()) {
            System.out.print("[Bottom] ");
            // do something here
            //create new variable because this functino shouldnt' affect attribute of the class
            int nSize = this.size;
            int curNode = 0;//start at index 0
            while(nSize != 0){//print data till size = 0
                System.out.print(this.arr[curNode].data + " ");
                ++curNode;//change index to next node
                --nSize;//decrease size(for while loop)
            }
            System.out.println("[Top]");
        } else {
            System.out.println("Empty Stack!!!");
        }
    }
}