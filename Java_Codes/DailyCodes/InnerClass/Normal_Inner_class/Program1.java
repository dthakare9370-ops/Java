class Outer {
	
	static int f =10;
	class Inner{
		final static int f = 20;
		void display(){
			System.out.println("Hellow");
			
			System.out.println(Outer.f);
			System.out.println(f);
		}
	}

}

class client{
	public static void main(String args[]){
		Outer obj = new Outer();
		Outer.Inner obj1 = obj.new Inner();
		obj1.display();
	}
}
