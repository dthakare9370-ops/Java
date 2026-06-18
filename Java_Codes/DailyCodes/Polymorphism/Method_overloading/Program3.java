class Demo{
	void fun(int s){
		System.out.println("Int");	
	}
	void fun(float y){
		System.out.println("Float");
	}
}

class client {
	public static void main(String args[]){
		Demo obj = new Demo();
		short a =10;
		//obj.fun(a);  int
		//obj.fum(10l); float
		//obj.fun('A'); int
		//obj.fun(10.5); //Error
	       	obj.fun(10.5f);  

	}
}
