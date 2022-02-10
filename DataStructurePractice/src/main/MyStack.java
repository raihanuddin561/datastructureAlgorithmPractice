package main;

public class MyStack {
    int capacity = 3;
    int[] stack = new int[capacity];
    int top = -1;
    void push(int in){
        if(top<capacity-1){
            top = top+1;
            stack[top]=in;
            System.out.println("stack pushed success: "+in);
        }else{
            System.err.println("Stack is overflow");
        }
    }
    int pop(){
        if(top>-1){
            top = top-1;
            System.out.println("Stack is removed");
            return stack[top];
        }else{
            System.err.println("Stack is empty");
            return -1;
        }
    }
    int peek(){
        if(top>-1)
            return stack[top];
        else
            return -1;
    }

}
