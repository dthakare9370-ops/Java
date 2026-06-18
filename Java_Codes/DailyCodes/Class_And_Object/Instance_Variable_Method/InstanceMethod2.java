class InstanceMethod2{
	int x = 10;
	int y = 20;

	void fun(){
		System.out.println("In fun method");
		System.out.println("X : "+x); //10
		System.out.println("Y : "+y); //20
	}

	public static void main(String args[]){
		InstanceMethod2 obj = new InstanceMethod2();
		System.out.println(obj.x); //10
		System.out.println(obj.y); //20

		obj.fun();	
	}
}
