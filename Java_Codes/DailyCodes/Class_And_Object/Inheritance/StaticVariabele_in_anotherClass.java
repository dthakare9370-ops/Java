class Parent1{
	static int x = 10;
	int j = 30;
}
class Parent2 extends Parent1{
	int y = 20;
	public static void display(){
		System.out.println(x);
	}
}

class StaticVariabele_in_anotherClass{
	public static void main(String args[]){
		Parent2 obj = new Parent2();
		//obj.display();
		
		System.out.println(Parent1.x);
		//System.out.println(obj.x);
	}
}
