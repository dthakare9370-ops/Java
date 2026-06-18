import java.util.*;

class ListIteratorDemo{
	public static void main(String args[]){

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		//al.remove(0);
		al.add(20);
		al.add(30);
		al.add(40);

		System.out.println(al);


		ListIterator lt = al.listIterator();

		while(lt.hasNext()){
			System.out.println(lt.next());
		}

		while(lt.hasPrevious()){
			System.out.println(lt.previous());
		}
		
		System.out.println(lt.nextIndex());
	}

}
