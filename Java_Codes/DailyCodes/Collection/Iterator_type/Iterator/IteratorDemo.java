import java.util.*;

class IteratorDemo{
	public static void main(String args[]){

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		System.out.println(al);

		for(Integer data : al){
			System.out.println(data);
		}
	}
}
