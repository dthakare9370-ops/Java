class Demo{
	void fun(){
		System.out.println("No arg method");
	}
	void fun(int z){
		System.out.println("Int- fun");
	}
}

class client {
	public static void main(String args[]){
		Demo obj = new Demo();
		obj.fun();
	}
}
