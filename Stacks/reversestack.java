
public class reversestack {
	public static void main(String []args)throws Exception {
		 stack st = new stack();
		
		 st.push(5);
		 st.push(10);
		 st.push(15);
		 st.push(20);
		 st.Display();
		 
		 rev(st);
         System.out.println();
		 st.Display();
	}	
	//------------------------------------------------------------------------------------------------------------------------------------
	public static void rev(stack st)throws Exception {
		if(st.isEmpty()) return;
		int x = st.pop();
		rev(st);
		Insert(x,st);
	}
	//----------------------------------------------------------------------------------------------------------------------------------
	public static void Insert(int x , stack st) throws Exception{
		if(st.isEmpty()) {
			st.push(x);
			return;
	}
		int remove =st.pop();
		Insert(x, st);
		st.push(remove);
	}
}