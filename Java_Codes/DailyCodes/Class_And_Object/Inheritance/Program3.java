class Parent{
	int x = 10;
	Parent(){
		System.out.println("Parent Constructor");
	}
	void displayParent(){
		System.out.println(x);
	}
}
class Child extends Parent{
	Child(){
		System.out.println("child Constructor");
	}
	void displayChild(){
		System.out.println(x);
	}
}

class Program3{
	public static void main(String args[]){
		Child obj = new Child();
		obj.displayParent();
		obj.displayChild();
	}
}

