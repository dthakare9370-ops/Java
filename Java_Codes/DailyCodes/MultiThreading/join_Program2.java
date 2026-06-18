
class MyThread extends Thread{
	static Thread mainThread=null;
	public void run(){
		try{
			for(int i=1;i<=10;i++){
				System.out.println(getName());
				mainThread.join();
				Thread.sleep(500);
			}
		}catch(Exception e){

		}
	}
}

class Client {
	public static void main(String args[])throws Exception{
		MyThread.mainThread = Thread.currentThread();
		MyThread t1 = new MyThread();
		t1.start();
		t1.join();

		for(int i=1;i<=10;i++){
			System.out.println(Thread.currentThread().getName());
		}
	}
}
