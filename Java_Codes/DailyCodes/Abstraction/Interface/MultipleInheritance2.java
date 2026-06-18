interface Parent1{
	default void fun(){
                System.out.println("Fun method- interface");
        }
}

interface Parent2{
	default void fun(){
                System.out.println("Fun method- interface2");
        }
}

class Child implements Parent1,Parent2{
	/*public void fun(){
		System.out.println("Fun method");
	}*/
}

class Client{
	public static void main(String args[]){
		Parent1 obj = new Child();

		obj.fun();
	}
}

