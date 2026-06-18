class InstanceMethod{
	int x = 10;
	int y = 20;

	void Fun1(){
		System.out.println("Function 1 Block");
	}

	void Fun2(){
		System.out.println("Function 2 Block");
	}

	public static void main(String args[]){
		InstanceMethod a = new InstanceMethod();
		System.out.println(a.x);
		System.out.println(a.y);
		a.Fun1();
		a.Fun2();
	}
}
