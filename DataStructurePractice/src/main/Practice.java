package main;

import main.queue.MyQueue;

public class Practice {
    public static void main(String[] args) {
//        MyStack myStack = new MyStack();
//        myStack.push(1);
//        myStack.push(2);
//        myStack.push(3);
//        System.out.println("stack peek "+myStack.peek());
//        myStack.pop();
//        myStack.push(4);
//        for(int a:myStack.stack){
//            System.out.println("printing stack: "+a);
//        }

        MyQueue  myQueue = new MyQueue();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.enqueue(6);
        myQueue.print();
        myQueue.dequeue();
        myQueue.print();
        myQueue.enqueue(7);
        myQueue.dequeue();
        myQueue.print();
        myQueue.enqueue(8);
        myQueue.print();

    }
}
