package stack;

class Node{
    int data;
    Node next;
    Node(int item){
        this.data = item;
    }
}

public class StackByLinkedList {
    Node head = null;

    private void push(int value)
    {
        Node temp= new Node(value);
        if(head == null){
            head = temp;
        }
        temp.next = head;
        head=temp;
        System.out.println("Item pushed in Stack "+value);
    }

    private void pop(){
        if(head == null){
            System.out.println("Stack is empty ,Item cannot be deleted");
        }
        else if (head.next == null){
            System.out.println("item getting popped from stack :"+head.data);
            head = null;
        }
        else{
            System.out.println("item getting popped from stack :"+head.data);
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
    }

    private void peek(){
        if(head == null){
            System.out.println("Stack is empty ");
        }
        else{
            System.out.println("top element of stack is :"+head.data);
        }
    }

    public static void main(String[] args){
        StackByLinkedList stack = new StackByLinkedList();
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.peek();
        stack.pop();
        stack.peek();
    }
}
