import accessDefault.*;

class ChildDemo extends Demo{
	ChildDemo(){
		System.out.println("Child Demo Constructor");
		//System.out.println(x);
	}
}
class Client{
	public static void main(String args[]){
		ChildDemo obj = new ChildDemo();
		System.out.println(obj.x);
	}
}
