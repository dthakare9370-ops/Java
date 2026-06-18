
class Outer{

	int x = 10;
	static int y = 20;
	
	class Inner{
		int x = 30;
		final static int y = 40;
		void display(){
			System.out.println(Outer.this.x);
			System.out.println(Outer.y);
			System.out.println(x);
			System.out.println(y);
		}
	}
}

class Client{
	public static void main(String agrs[]){
		Outer outObj = new Outer();
		Outer.Inner obj = outObj.new Inner();
		obj.display();
	}
}


