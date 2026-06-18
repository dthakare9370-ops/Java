
class Outer{

	int x = 10;
	static int y = 20;
	class Inner{
		int x = 30;
		void display(){
			System.out.println(Outer.this.x);
			System.out.println(y);
			System.out.println(x);
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


