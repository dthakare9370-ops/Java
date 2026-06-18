interface Parent1{
	void fun();
}

interface Parent2{
	void fun();
}

class Child implements Parent1,Parent2{
	public void fun(){
		System.out.println("Fun method");
	}
}

class Client{
	public static void main(String args[]){
		Parent1 obj = new Child();

		obj.fun();
	}
}

