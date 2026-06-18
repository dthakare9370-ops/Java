
class MyThread extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(getName());
			try{
				Thread.sleep(500);
			}catch(Exception e){

			}
		}
	}
}

class Client {
	public static void main(String args[])throws Exception{
		MyThread mt = new MyThread();
		mt.start();

		for(int i=1;i<=10;i++){
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(500);
		}
	}
}
