class Parent{
	void fun(){
		System.out.println("No- argument");
	}
}

class Child extends Parent{
	void fun(int x){
		System.out.println("Int");
	}
}

class Client{
	public static void main(String args[]){
		Child obj = new Child();
		obj.fun();

		Parent obj2 = new Child();
		
		/*obj2.fun(10);
		// error: method fun in class Parent cannot be applied to given types;
                obj2.fun(10);
                    ^
 		 required: no arguments
  		found: int
  		reason: actual and formal argument lists differ in length
		1 error*/
	}
}
