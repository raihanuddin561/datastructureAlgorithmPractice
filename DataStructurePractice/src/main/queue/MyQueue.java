package main.queue;

public class MyQueue {
    int capacity=5, rear = -1,totalItem=0,front=0;
    int[] queue = new int[capacity];
    boolean isEmpty(){
        if(totalItem==0)
            return true;
        return false;
    }
    public int dequeue(){
        if(totalItem<=0){
            System.err.println("Queue is empty");
            return -1;
        }
        int frontItem = queue[front];
        queue[front]=-1;
        front = (front + 1) % capacity;
        totalItem--;
        return frontItem;
    }
    public void enqueue(int in){
        if(totalItem==capacity){
            System.err.println("Queue is full!!!");
        }else{
            rear=(rear+1)%capacity;
            System.out.println("rear value after mod: "+rear);
            queue[rear]=in;
            System.out.println("successfully added: "+in);
            totalItem++;
        }

    }
    public void print(){
        if(isEmpty()){
            System.err.println("Queue is empty!!!");
        }else {
            for(int i=0;i<capacity;i++){
                System.out.println("printing queue: "+queue[i]+"\t index: "+i);
            }
        }
    }

}
