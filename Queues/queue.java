public class queue {
    private int arr[];
    private int front;
    private int size;

    // Default constructor
    public queue() {
        arr = new int[5];
        front = 0;
        size = 0; // Don't redeclare size here
    }

    // Parameterized constructor
    public queue(int n) {
        arr = new int[n];
        front = 0;
        size = 0; // Same here
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public void Enqueue(int val) throws Exception {
        if (isFull()) throw new Exception("Queue is Full!");
        int idx = (front + size) % arr.length;
        arr[idx] = val;
        size++;
    }

    public int Dequeue() throws Exception {
        if (isEmpty()) throw new Exception("Queue is Empty");
        int re = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return re;
    }

    public int size() {
        return size;
    }

    public int peek() throws Exception{
        if (isEmpty()) throw new Exception("Queue is Empty");
        return arr[front];
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % arr.length;
            System.out.print(arr[idx] + " ");
        }
        System.out.println();
    }
}
