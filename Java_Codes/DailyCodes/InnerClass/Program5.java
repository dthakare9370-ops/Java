
class Outer{	
	class Inner1{
		class Inner2{
			void display(){
				System.out.println("Display Method of Inner2 class");
			}
		}
	}
}

class Client{
	public static void main(String agrs[]){
		Outer outObj = new Outer();
		Outer.Inner1 obj = outObj.new Inner1();
		Outer.Inner1.Inner2 obj2 = obj.new Inner2();
		obj2.display();

		new Outer().new Inner1().new Inner2().display();
	}
}


