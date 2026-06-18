
class Demo extends Thread{
	public void run(){
		System.out.println("Run Method Call");

		for(int i=1;i<=10;i++){
			System.out.println(getName());
			System.out.println(getState());
			try{
				Thread.sleep(5000);

			}catch(Exception e){
			
			}
		}
	}
}

class Client{
	public static void main(String args[])throws Exception{

		Demo obj = new Demo();
		System.out.println(obj.getState());
		obj.start();

		for(int i=1;i<=10;i++){
			System.out.println("\t"+obj.getState());
			Thread.sleep(200);
			System.out.println("\t"+Thread.currentThread().getState());
		}
	}

}
