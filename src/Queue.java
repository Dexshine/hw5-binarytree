public class Queue {
    Node[] arr; // circular array
    int capacity;
    int front;
    int back;
    int size;
    
    //constructor
    public Queue(int cap){
        this.arr = new Node[cap];
        this.capacity = cap;
        this.size = 0;
        this.front = 0;
        this.back = 0;
    }
    
    //push node at index = back
    public void enqueue(Node node){
        
        if (!isFull()){//Non-empty queue
            ++this.size; //increase amount of node in queue
            this.arr[this.back] = node; //push node at index=back
            ++this.back;//change index position that we can push next time
            //circular queue-- if back = capacity,we can't push anymore. we need to set variable back = 0
            this.back = this.back % this.capacity;
        }else{
            System.out.println("Queue Overflow!!!");
        }
    }
    
    //pop node at index = front
    public Node dequeue(){
        
        if (!isEmpty()){//Non-empty queue
            --this.size;//decrease amount of node in queue
            ++this.front;//since we popFront, we need to change index position of new front node
            return this.arr[this.front - 1]; //return old front node
        }else{
            System.out.println("Queue Underflow!!!");
            return null;
        }
    }
    
    public boolean isEmpty(){
        return this.size == 0;//true if queue is empty
    }
    
    public boolean isFull(){
        return this.size == this.capacity; //true if queue is full
    }
    
    public void printCircularIndices(){
        System.out.println("Front index = " + this.front + " Back index = " + this.back);
    }
    
    public void printQueue(){
        if (!isEmpty()){
            System.out.print("[Front] ");
            // do something here
            //create new variable because this function shouldn't affect attribute of the class
            int nSize = this.size;
            int curNode = this.front; //start at front node
            while(nSize != 0){//print data till size = 0
                System.out.print(this.arr[curNode].data + " ");
                ++curNode; //change index to next node
                //circular queue-- if curNode = capacity, set curNode = 0
                curNode = curNode % this.capacity;
                --nSize; //decrease size (while loop)
            }
            System.out.println("[Back]");
        }else{
            System.out.println("Empty Queue!!!");
        }
    }
}