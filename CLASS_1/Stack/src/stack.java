package stack;

public class stack {
    int size;
    int top;
    int arr[];

    public stack(int capacity){
        size = capacity;
        top = -1;
        arr= new int[size];

    }

    void push(int data){

    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack underFlow! Stack  is empty ");
            return -1;
        }
        int v = arr[top];
        top --;
        return v ;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top];
    }
    void display (){
        int tmp = top ;
        /*while (tmp >= 0){
            System.out.println(arr[tmp]);
        }*/
        for(int i =0 ;i <){
            System.out.println(arr[i]+"->");
        }
        System.out.println();
    }
    boolean isFull(){
        return top == size-1;
    }
    boolean isEmpty(){
        return top == -1;
    }
}