package main.linkedlistpractice;

import org.w3c.dom.Node;

public class LinkedList {
    Node head;
     static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }

    }
    public void printNode(){
         Node n = head;
         while (n!=null){
             System.out.println("data:"+n.data);
             n = n.next;
         }
    }

    public LinkedList insert(LinkedList list,int data){
         Node newNode = new Node(data);
         newNode.next = null;
         if(list.head==null){
            list.head = newNode;
         }else {
             Node last = list.head;
             while (last.next != null) {
                 last = last.next;
             }
             last.next = newNode;
         }
         return list;

         }

         public LinkedList deleteByKey(LinkedList list, int key){
            Node currentNode = list.head, prev =null;
            if(currentNode!=null && currentNode.data ==key){
                list.head = currentNode.next;
                System.out.println(key+" found and deleted.");
                return list;
            }

            while (currentNode !=null && currentNode.data!=key){
               prev = currentNode;
               currentNode = currentNode.next;
            }

            if(currentNode!=null){
                prev.next = currentNode.next;
                System.out.println(key+" found and deleted");

            }
            if(currentNode==null){
                System.out.println("Not found");
            }
            return list;

         }

    public static void main(String[] args) {
        LinkedList lList = new LinkedList();
        lList.head = new Node(1);
        Node secondeNode = new Node(2);
        Node thirdNode = new Node(3);
        lList.head.next = secondeNode;
        secondeNode.next = thirdNode;
        lList.printNode();
        System.out.println("Inserting new node:");
        lList.insert(lList,50);
        lList.printNode();
        lList.deleteByKey(lList,50);
        lList.printNode();
        lList.deleteByKey(lList,50);

    }
}
