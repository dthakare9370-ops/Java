
import java.util.*;

class StackMethods {
	public static void main(String args[]){
		Stack st = new Stack();

		 //public E push(E);
		 System.out.println(st.push(10));
		 st.push(20);
		 st.push(30);
		 st.push(40);

		 System.out.println(st);
  
		 //public synchronized E pop();
		 System.out.println("Pop : "+st.pop());
  
		 //public synchronized E peek();
		 System.out.println("Peek : "+st.peek());
  
		 //public boolean empty();
		 System.out.println(st.empty());
 
		 st.push(40);
		 System.out.println(st);	
		 //public synchronized int search(java.lang.Object);
		 System.out.println("Search 10 :"+st.search(10));
		 System.out.println("Search 90 :"+st.search(90));
	}
}
