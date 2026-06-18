interface A{
	static void fun(){
		System.out.println("Fun method A Interface ");
	}
}

interface B{
	static void fun(){
		System.out.println("Fun Method B Interface ");
	}

}

class Demo implements A,B{
	public static void fun(){
		System.out.println("Demo - ");
	}
}

class Client{
	public static void main(String args[]){
		Demo obj = new Demo();
		obj.fun();
		A.fun();
		B.fun();

	}
}
