class Demo{
	/*void fun(int x,int y){
		System.out.println("Int-int");
	}*/
	void fun(int s,int y,int z){
		System.out.println("Int-Int-int");	
	}
	void fun(int x, float y){
		System.out.println("Int-Float");
	}
}

class client {
	public static void main(String args[]){
		Demo obj = new Demo();
		obj.fun(10,20);
	}
}
