package stack;

public class StackwithArrayBased {
    int top =-1;
    int size;
    int[] arr;
    StackwithArrayBased(int size){
        this.size=size;
        arr=new int[size];
    }

    private boolean isEmpty(){
      if(top == -1) return true;
      else
          return false;

    }
    private boolean isFull(){
        if(top == size -1) return true;
        else return false;
    }

    private int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
            return arr[top];
    }

    private void push(int item){
        if(isFull()){
            System.out.println("Stack is full , can not be insterted new element");
        }
        else{
            top++;
            arr[top]=item;
            System.out.println("Sucessfully item pushed into the stack "+item);
        }
    }
    private int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty, cannot delete element");
        }
        int element = arr[top];
        top--;
        System.out.println("Item Sucessfully deleted from Stack "+element);
        return element;
    }
    public static void main(String [] args){
        StackwithArrayBased stack = new StackwithArrayBased(5);
        stack.push(5);
        stack.push(7);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}
