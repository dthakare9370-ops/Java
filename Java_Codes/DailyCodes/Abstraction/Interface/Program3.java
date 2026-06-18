interface Demo{
	default void fun(){
		System.out.println("In fun");
	}
	void run();
}

class DemoChild1 implements Demo{
	public void run(){
		System.out.println("Run Method - DemoChild1");
	}
}

class DemoChild2 implements Demo{
	public void fun(){
		System.out.println("Fun Method - Demochild2");
	}
	public void run(){
		System.out.println("Run method = Demo Child2");
	}
}

class Client{
	public static void main(String args[]){
		Demo obj1 = new DemoChild1();
		Demo obj2 = new DemoChild2();

		obj1.fun();
		obj1.run();

		obj2.fun();
		obj2.run();
	}
}

