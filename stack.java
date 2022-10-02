import java.util.Scanner;

class Stack {
  
    int arr[];
    int top;
    int capacity;
  
    Stack(int size) {
      arr = new int[size];
      capacity = size;
      top = -1;
    }
  
  
    public void push(int x) {
      if (isFull()) {
        System.out.println("Stack OverFlow");
        System.exit(1);
      }
      System.out.println("Inserting " + x);
      arr[++top] = x;
    }

    public int pop() {
      if (isEmpty()) {
        System.out.println("STACK EMPTY");
        System.exit(1);
      }
      return arr[top--];
    }

    public int getSize() {
      return top + 1;
    }

    public Boolean isEmpty() {
      return top == -1;
    }

    public Boolean isFull() {
      return top == capacity - 1;
    }

    public void printStack() {
      for (int i = 0; i <= top; i++) {
        System.out.print(arr[i] + ", ");
      }
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Stack size: ");
        int size = sc.nextInt();
        Stack stack = new Stack(size);
          
        int choice = 0;
        do{
            System.out.println("\n\nChoose operation:\n\n1. Push\n2. Pop\n0. Exit\n");
            choice = sc.nextInt();
            switch(choice){
                case 1: System.out.print("\nEnter the data to push: ");
                        int num = sc.nextInt();
                        stack.push(num);
                        stack.printStack();
                        break;
                case 2: stack.pop();
                        System.out.print("\nStack After popping out: ");
                        stack.printStack();
                        break;
                case 0: break;
            }
        }while(choice!=0);
    }
  }