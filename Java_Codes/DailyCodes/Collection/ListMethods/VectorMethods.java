
import java.util.*;

class VectorMethod{
	public static void main(String args[]){
		 
		Vector<String> v = new Vector<>(); 
		v.add("first");
		v.addElement("Second");
		v.add("three");
		v.add("first");
                v.addElement("Second");
                v.add("three");
		v.add("first");
                v.addElement("Second");
                v.add("three");
		v.add("first");
                v.addElement("Second");
                v.add("three");

		System.out.println(v);

		//public synchronized int capacity();
		System.out.println(v.capacity());

		//public synchronized void trimToSize();
		v.trimToSize();
		System.out.println(v.capacity());
  
		//public synchronized void ensureCapacity(int);
		v.ensureCapacity(17);
		System.out.println(v.capacity());

  		
		//public synchronized void setSize(int);
		v.setSize(1);
		System.out.println(v);
  
		//public synchronized int size();
  		System.out.println(v.size());	

		//public synchronized java.util.List<E> subList(int, int);
		List ls = v.subList(0,1);
		System.out.println(ls);
    
		//public java.util.Enumeration<E> elements();
		Enumeration en = v.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
	}
}
