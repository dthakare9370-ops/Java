
class MyThread extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			try{
				System.out.println(getName());
				Thread.sleep(500);
			}catch(Exception e){

			}

		}
	}
}
class Client{
	public static void main(String args[])throws Exception{
		MyThread t1 = new MyThread();
		t1.start();
		t1.join();

		for(int i=1;i<=10;i++){
			System.out.println(Thread.currentThread().getName());
		}
	}
}
