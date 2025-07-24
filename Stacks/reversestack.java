
public class reversestack {
    public static void main(String[] args) throws Exception{
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        Rev(s);
        s.Display();
    }
    public static void Rev(stack s) throws Exception{
        if(s.isEmpty()) return;
        int x = s.pop();
        Rev(s);
        Insert(x,s);
    }
    public static void Insert(int x, stack s){
        if(s.isEmpty()){
            s.push(x);
            return; 
        }
        int remove = s.pop();
        Insert(x,s);
        s.push(remove);
    }
}

