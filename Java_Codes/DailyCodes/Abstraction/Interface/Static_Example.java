interface Demo{
	public static void fun(){
		System.out.println("In Fun Method");
	}
	public abstract void run();
}

class DemoChild1 implements Demo{
	public void run(){
		System.out.println("Run Method - DemoChild1");
	}
}

class DemoChild2 implements Demo{
	public void run(){
                System.out.println("Run Method - DemoChild2");
        }
}

class Client {
	public static void main(String args[]){
		Demo obj1 = new DemoChild1();
		Demo obj2 = new DemoChild2();

		//DemoChild.fun(); // Error Cannot find Symbol : karn Inheriace through static method
				//interface madhe khali yetach nahi
		//obj1.fun(); he class madhe chalat hot pan interface madhe chalt nahi same reson

		Demo.fun();
		obj1.run();

		Demo.fun();
		obj2.run();
	}
}
