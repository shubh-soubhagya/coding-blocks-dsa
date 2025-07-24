public class reversequeue {
    public static void main(String[] args) throws Exception{

        queue q = new queue();
        q.Enqueue(4);
        q.Enqueue(5);
        q.Enqueue(6);
        q.Enqueue(7);
        q.display();

        Rev(q);
        q.display();
    }

    public static void Rev (queue q) throws Exception{

        if(q.isEmpty()) return;
        int x = q.Dequeue();
        Rev(q);
        q.Enqueue(x);

    }
}
