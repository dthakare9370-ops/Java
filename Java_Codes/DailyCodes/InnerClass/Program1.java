
class Outer{

	class Inner{

		void dispInner(){
			System.out.println("Inner class Method ");
		}
	}
	void dispOuter(){
		System.out.println("Outer class Method ");
	}

}

class client{
	public static void main(String args[]){
		Outer obj = new Outer();
		Outer.Inner obj2 = obj.new Inner();
		obj.dispOuter();
		obj2.dispInner();
	}
}


