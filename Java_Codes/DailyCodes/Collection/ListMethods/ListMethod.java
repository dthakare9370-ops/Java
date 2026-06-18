import java.util.*;

class ListMethod{
	public static void main(String args[]){

		
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		
		
		//public abstract int size();
  		System.out.println(ls.size());
		
		//public abstract boolean isEmpty();
		System.out.println(ls.isEmpty());
  		
		//public abstract boolean contains(java.lang.Object);
		System.out.println("Contains 20 :"+ls.contains(20));
  
		//public abstract java.util.Iterator<E> iterator();
		Iterator itr = ls.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
  
		//public abstract java.lang.Object[] toArray();
  		Object obj[] = ls.toArray();
		for(var data : obj){
			System.out.println(data);
		}

		//public abstract <T> T[] toArray(T[]);
  
		//public abstract boolean add(E);
		System.out.println("Add 50"+ls.add(50));
  
		//public abstract boolean remove(java.lang.Object);
		System.out.println("remove "+ls.remove(4));
		System.out.println(ls);
  
		//public abstract boolean containsAll(java.util.Collection<?>);
		List<Integer> ls2 = new ArrayList<Integer>();
		ls2.add(50);
		ls2.add(60);
		System.out.println("Contains All : "+ls.containsAll(ls2));
  
		//public abstract boolean addAll(java.util.Collection<? extends E>);
		System.out.println("addAll : "+ls.addAll(ls2));
		System.out.println("After Add All : "+ls);
  
		//public abstract void clear();
		ls2.clear();
		System.out.println("LS2 : "+ls2);

		//public abstract boolean addAll(int, java.util.Collection<? extends E>);
 		ls2.add(25);
		ls2.add(27);
		System.out.println(ls.addAll(2,ls2));
		System.out.println(ls);

		//public abstract boolean removeAll(java.util.Collection<?>);
  		//System.out.println("remove All : "+ls.removeAll(ls2));

		//public abstract boolean retainAll(java.util.Collection<?>);
  		System.out.println("RetainAll : "+ls.retainAll(ls2));
		
		//public default void replaceAll(java.util.function.UnaryOperator<E>);
  

		//public default void sort(java.util.Comparator<? super E>);
  
  
		//public abstract boolean equals(java.lang.Object);
		System.out.println(ls.equals(20));
  
		//public abstract int hashCode();
		System.out.println(ls.hashCode());
  
		//public abstract E get(int);
		System.out.println(ls.get(0));
 		 
		//public abstract E set(int, E);
  		System.out.println(ls.set(0,100));
		System.out.println(ls);


		//public abstract int indexOf(java.lang.Object);
  		ls.add(100);
		System.out.println(ls.indexOf(100));

		//public abstract int lastIndexOf(java.lang.Object);
		System.out.println(ls.lastIndexOf(100));
 		
	       	//public abstract java.util.ListIterator<E> listIterator();
		ListIterator itr2 = ls.listIterator();

		System.out.println("List Iterator : ");
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}

		while(itr2.hasPrevious()){
			System.out.println(itr2.previous());
		}
	}
}
