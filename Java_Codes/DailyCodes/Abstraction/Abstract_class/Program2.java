
abstract class Parent{
	int x=10;
	static int y = 20;
	abstract void fun();
	abstract void run();
}

abstract class Child extends Parent{
	final void fun(){
		System.out.println("Fun Method 1: "+x);
	}
}

class Child2 extends Child{
/*	void fun(){
		System.out.println("Fun Method 2 : "+x);
	}
*/
	void run(){
		System.out.println("Run Method : "+x);
	}
}

class Client{
	public static void main(String args[]){
		Parent obj = new Child2();
		//Child obj = new Child2();
		obj.fun();
		obj.run();
	}
}



