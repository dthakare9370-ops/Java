

import java.util.*;

class LinkListMethod{
	public static void main(String args[]){

		LinkedList<Object> ls = new LinkedList<Object>();
		
		//public boolean add(E);
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(50);
		
		//public E getFirst();
		System.out.println(ls.getFirst());
  
		//public E getLast();
		System.out.println(ls.getLast());
 
	       	//public E removeFirst();
		System.out.println(ls.removeFirst());
  
		//public E removeLast();
		System.out.println(ls.removeLast());

		System.out.println(ls);
  
		//public void addFirst(E);
		ls.addFirst(10);
  
		//public void addLast(E);
		ls.addLast(50);
		System.out.println(ls);
  
		//public boolean contains(java.lang.Object);
		System.out.println(ls.contains(20));
  
		//public int size();
		System.out.println(ls.size());
  
		//public boolean remove(java.lang.Object);
  		System.out.println(ls.remove(2));
		System.out.println(ls);

		//public boolean addAll(java.util.Collection<? extends E>);
  
		//public boolean addAll(int, java.util.Collection<? extends E>);
  
		//public void clear();
  
		//public E get(int);
		System.out.println(ls.get(0));
  
		//public E set(int, E);
 		System.out.println(ls.set(0,100));

	       	//public void add(int, E);
  
		//public E remove(int);
  
		//public int indexOf(java.lang.Object);
		System.out.println(ls.indexOf(20));
  
		//public int lastIndexOf(java.lang.Object);
		System.out.println(ls.lastIndexOf(20));
  
		//public E peek();
		System.out.println("Peek : "+ls.peek());
 
	       	//public E element();
		System.out.println("Element : "+ls.element());
  
		//public E poll();
		System.out.println("poll : "+ls.poll());
		System.out.println(ls);
  
		//public E remove();
		System.out.println(ls.remove());
  		System.out.println(ls);

		//public boolean offer(E);
		System.out.println(ls.offer(50));
		System.out.println(ls);
  
		//public boolean offerFirst(E);
 		System.out.println("offerFirst : "+ls.offerFirst(10));
	        System.out.println(ls);

		//public boolean offerLast(E);
		System.out.println("OfferLast : "+ls.offerLast(10));
		System.out.println(ls);

		//public E peekFirst();
		System.out.println("peekFirst : "+ls.peekFirst());
  
		//public E peekLast();
		System.out.println("peekLast : "+ls.peekLast());
  
		//public E pollFirst();
		System.out.println("PollFirst : "+ls.pollFirst());
		System.out.println(ls);
  
		//public E pollLast();
		System.out.println("Polllast : "+ls.pollLast());
  
		//public void push(E);
		ls.push(10);
  		System.out.println(ls);
		
		//public E pop();
		System.out.println("Pop : "+ls.pop());
  		System.out.println(ls);

		//public boolean removeFirstOccurrence(java.lang.Object);
		System.out.println(ls.removeFirstOccurrence(50));
  
		//public boolean removeLastOccurrence(java.lang.Object);
 
	       	//public java.util.ListIterator<E> listIterator(int);
  
		//public java.util.Iterator<E> descendingIterator();
		Iterator itr = ls.descendingIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
  
		//public java.lang.Object clone();
  
		//public java.lang.Object[] toArray();
	}
}
