interface A{
	final static public int a=10;
	void fun();
}
class Demo implements A{
	public void fun(){
		System.out.println(a);
	}
}

class Client{
	static public void main(String args[]){
		Demo obj = new Demo();
		obj.fun();
	}
}
