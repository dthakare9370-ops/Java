import java.util.*;

class IteratorDemo2{
	public static void main(String args[]){

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		System.out.println(al);

		Iterator itr = al.iterator();

		while(itr.hasNext()){
			var data = itr.next();
			if(data == new Integer(30)){
				itr.remove();
			}
		}

		System.out.println(al);

	}
}
