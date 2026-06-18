
import java.util.*;

class EnumerationDemo{
	public static void main(String args[]){

		Vector v = new Vector();

		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);

		System.out.println(v);

		Enumeration e = v.elements();

		/*while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}*/

		Iterator itr = e.asIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
	
