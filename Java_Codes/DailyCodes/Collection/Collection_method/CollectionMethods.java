
import java.util.*;

class CollectionMethods {
	public static void main(String args[]){
		Collection<Integer> cs = new ArrayList<Integer>();
		Collection<Integer> cs2 = new ArrayList<Integer>();
		
		//public abstract boolean add(E);	
		cs.add(10);
		cs.add(20);
		cs.add(30);
		cs.add(40);

		cs2.add(50);
		cs2.add(60);

		System.out.println(cs);


		//public abstract int size();
		System.out.println(cs.size());

		
		//public abstract boolean isEmpty();
		System.out.println(cs.isEmpty());

		// public abstract boolean remove(java.lang.Object);
		System.out.println("Remove : "+cs.remove(30));
		System.out.println(cs);

		// public abstract boolean addAll(java.util.Collection<? extends E>);
		System.out.println("AddAll Method : "+cs.addAll(cs2));
		System.out.println(cs);

		//public abstract boolean removeAll(java.util.Collection<?>);
		System.out.println("Remove All method : "+cs.removeAll(cs2));
		System.out.println(cs);

		//public abstract int hashCode();
		System.out.println("HashCode : "+cs.hashCode());
	
		//public abstract boolean contains(java.lang.Object);
		System.out.println(cs.contains(20));

		//public abstract java.lang.Object[] toArray();
		Object obj[] = cs.toArray();
		for(var data : obj){
			System.out.println(data);
		}
	}
}














