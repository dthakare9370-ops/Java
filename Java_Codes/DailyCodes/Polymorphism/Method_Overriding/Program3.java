class Parent{
	void fun(int x){
		System.out.println("1=st Int");
	}
}

class Child extends Parent{ 
	int fun(int y){
		System.out.println("2= nd");
		return 10;
	}
}

class Client{
	public static void main(String args[]){
		Parent obj = new Child();
		obj.fun(10);
	}
}
