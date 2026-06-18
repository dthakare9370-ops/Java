//Method ch scop kami karun chalt nahi error yeto 
//1.Scop vadla tar chalel 


//
//parent chi method jar private asel tar Overriding karu shakat nahi 

class Parent{
	// private void fun(){ //Error	
	private void fun(){
		System.out.println("Parent Method");
	}
}

class Child extends Parent{
	// private void fun(){ Error
	void fun(){
		System.out.println("child Fun");
	}
}

class Client{
	public static void main(String args[]){
		Parent obj = new Child();
		obj.fun();
	}
}
