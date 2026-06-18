class Static_block_with_Method{
	static int x = 10;

	static {
		System.out.println("Static block call ");
	}

	{
		
	}
	public static void fun(){
		System.out.println("this is Fun() Method");
	}

	public static void main(String args[]){
		System.out.println(x);
		fun();
	}
}
