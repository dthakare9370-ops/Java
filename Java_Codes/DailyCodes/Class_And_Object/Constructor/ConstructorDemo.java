import java.io.*;
class ConstructorDemo{
	
	int x = 10;
	static int y = 20;
	
	static{
		System.out.println("Static block1");
	}

	{
		System.out.println("Instance Block");
	}

	ConstructorDemo(){
		System.out.println("Constructor");
	}
	

	void fun(){
		System.out.println("Fun method");
	}

	
	static{
		System.out.println("Static block2");
	}

	static void run(){
		System.out.println("Run methods");
	}

	public static void main(String args[]){
		ConstructorDemo a = new ConstructorDemo();
		ConstructorDemo.run();
		//a.run();
		a.fun();		
	}
}

