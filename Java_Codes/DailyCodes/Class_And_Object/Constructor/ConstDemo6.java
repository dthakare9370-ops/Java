class ConstDemo5{
//Recursion is not allow in instructor  

	ConstDemo5(){
		//this(10); error: recursive constructor invocation
		System.out.println("No-Arg Constructor");
	}

	ConstDemo5(int c){
		this();
		System.out.println("Parameterize Constructor");
		//this();
		//ConstDemo6.java:12: error: call to this must be first statement in constructor
                this();
	}


	public static void main(String args[]){
		ConstDemo5 a = new ConstDemo5(10);
	}
}

