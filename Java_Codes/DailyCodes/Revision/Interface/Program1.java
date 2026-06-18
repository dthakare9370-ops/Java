interface A{
	void fun();
}

interface B{
	void fun();
}

class Demo implements A,B{
	public void fun(){
		System.out.println("Fun Method of Demo Class");
	}
}

class Client{
	public static void main(String args[]){
		Demo obj = new Demo();
		obj.fun();
	}
}
