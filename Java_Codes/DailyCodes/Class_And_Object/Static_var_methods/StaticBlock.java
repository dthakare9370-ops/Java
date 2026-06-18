class StaticBlock{
	static int a;
	static int b;

	static{
		System.out.println("Static Block 1");
		a=10;	
	}
	public static void main(String args[]){
		System.out.println("Main Method Call");
	}

	static{
		b=20;
		System.out.println("Static Block 2");
	}

	static{
		System.out.println("Static Block 3");

		System.out.println("A :"+a);
		System.out.println("B :"+b);
	}
}
