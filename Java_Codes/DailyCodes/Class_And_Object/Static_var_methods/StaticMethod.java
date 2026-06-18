class StaticMethod{
	static int a = 10;
	static int b = 20;

	public static void add(){
		System.out.println(a);
		System.out.println(b);

		System.out.println("Addition :- "+(a+b));
	}

	public static void main(String args[]){
		System.out.println("Main Method");
		add();
	}
}
