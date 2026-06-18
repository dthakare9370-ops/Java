class Parent{
	//he chalel   Object fun()
	String fun(){
		System.out.println("Parent Fun");
		return "ssss";
	}
}


class Child extends Parent{
	
	//String refrence = parent object chalat nahi
	Object fun(){
	//he Chalel String ()
		System.out.println("Child Fun()");
		return new String();
	}	
}

class Client {
	public static void main(String args[]){
		Parent obj = new Child();
		obj.fun();
	}
}
