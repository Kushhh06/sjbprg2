package sjb.dsa;

public class Stack {
    private int[] array;
    private int size;
    private int top;

    public Stack(int size) {
        this.size = size;
        array = new int[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() { 
        return top == -1;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return array[top];
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            array[++top] = item;
            System.out.println(item + " pushed to stack");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return array[top--];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements (top to bottom): ");
            for (int i = top; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack(5);

        st.push(10);
        st.push(20);
        st.push(30);

        st.display();

        System.out.println("Top element is: " + st.peek());
    }
}
