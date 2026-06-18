interface Parent1{
	int x = 10;
	void fun();
}
interface Parent2{
	int x = 20;
}

class Child implements Parent1,Parent2{
	public void fun(){
		System.out.println(x);
	}
}

class Client{
	public static void main(String args[]){
		Parent1 obj = new Child();
		obj.fun();
	}
}

