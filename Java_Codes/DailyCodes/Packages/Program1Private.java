
public class Demo{
	protected int x=10;
			
	Demo(){
		System.out.println("Demo Constructor");
	}
}
class client{
	public static void main(String args[]){
		Demo obj = new Demo();
		//System.out.println(obj.x);
	}
}
