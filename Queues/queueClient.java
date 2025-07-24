public class queueClient {
    public static void main(String[] args) throws Exception{
        queue q = new queue(4);
        q.Enqueue(4);
        q.Enqueue(5);
        q.Enqueue(6);
        q.display();
        q.Enqueue(7);

        System.out.println(q.Dequeue());
        q.Enqueue(-1);
        q.display();
        System.out.println(q.peek());
    }
}
