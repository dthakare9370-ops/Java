class Outer{
	
	static class Inner{
		static int x=10;
		void display(){
			System.out.println("Inner - Method");
			System.out.println(x);
		}
	}
}

class client{
	public static void main(String args[]){
		Outer.Inner obj = new Outer.Inner();
		obj.display();
	}
}	
	

