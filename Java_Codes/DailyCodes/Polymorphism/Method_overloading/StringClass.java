class Demo{
	void fun(String str1){
		System.out.println("String");	
	}
	void fun(StringBuffer str){
		System.out.println("String Buffer");
	}
}

class client {
	public static void main(String args[]){
		Demo obj = new Demo();
		obj.fun("Ganu");
	      	obj.fun(new StringBuffer("Thakare"));
		obj.fun(new String("Harish"));	
		
		obj.fun(null);
	}
}
