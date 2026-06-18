

interface Demo{
	int x=10;
	default void fun(){
		System.out.println("Fun Method");
	}
	static void run(){
		System.out.println("Run Method");
	}
}


class Child implements Demo{
	public void fun(){
		 System.out.println("Fun Method 2");
	}	
       	public static void run(){
		System.out.println("Run Methodi 2");
	}	
}

class client {
	public static void main(String args[]){
		Demo obj = new Child();
		obj.fun();
		Demo.run();
		Child.run();;
	}
}
