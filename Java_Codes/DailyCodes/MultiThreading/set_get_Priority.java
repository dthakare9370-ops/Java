
class MyThread extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			try{
				System.out.println("\t"+getName());
				System.out.println("\t"+getPriority());
				Thread.sleep(1000);
			}catch(InterruptedException ie){

			}
		}
	}
}

class Client{
	public static void main(String agrs[])throws InterruptedException{
		MyThread t1 = new MyThread();
		t1.setPriority(10);
		t1.start();
		for(int i=1;i<=10;i++){
       
                        System.out.println(Thread.currentThread().getName());
  	       		Thread.sleep(1000);
                }

	}
}
