class ConstDemo5{
//Only one object create to call anather constuctor 

	ConstDemo5(){
		System.out.println("No-Arg Constructor");
	}

	ConstDemo5(int c){
		this();
		System.out.println("Parameterize Constructor");
	}


	public static void main(String args[]){
		ConstDemo5 a = new ConstDemo5(10);
	}
}

