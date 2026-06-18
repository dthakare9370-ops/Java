class Parent1{
	Parent1(){
		System.out.println("Parent1 Constructor");
	}
}
class Parent2 extends Parent1{
	Parent2(){
		 super();  //By default
		 System.out.println("Parent2 Constructor");
	}
}

class SuperKeywordConstructor{
	public static void main(String args[]){
		Parent2 obj = new Parent2();
	}
}
