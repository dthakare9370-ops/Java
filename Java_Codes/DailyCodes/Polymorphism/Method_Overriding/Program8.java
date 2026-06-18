//Method ch scop kami karun chalt nahi error yeto 
//1.Scop vadla tar chalel 


//
//parent chi method jar private asel tar Overriding karu shakat nahi 

class Parent{
	protected void fun(){
		System.out.println("Parent Method");
	}
}

class Child extends Parent{
	public void fun(){
		//void fun(){ Error because of low scope of methed
		System.out.println("child Fun");
	}
}

class Client{
	public static void main(String args[]){
		Parent obj = new Child();
		obj.fun();
	}
}
