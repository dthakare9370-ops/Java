class Parent{

	int x = 10;
	void displayParent(){
		System.out.println(x);
		System.out.println(this);
	}

}

class Child extends Parent{
	int x = 20;
	void displayChild(){
		System.out.println(x);
		System.out.println(super.x);
		System.out.println(this);
	}
}
class SuperkeywordParentVariable{
	public static void main(String args[]){
		Child obj = new Child();
		obj.displayParent();
		obj.displayChild();
	}
}
