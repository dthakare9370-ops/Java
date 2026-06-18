
class Daemon_Thread extends Thread{
	public void run(){
		while(true){
			System.out.println(getName());
			System.out.println(isDaemon());
			try{
				Thread.sleep(500);
			}catch(Exception e){

			}
		}
	}
}

class Client{
	public static void main(String args[])throws InterruptedException{
		Daemon_Thread t1 = new Daemon_Thread();
		t1.setDaemon(true);
		t1.start();
	
		for(int i=1;i<=10;i++){
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(7000);
		}
	}
}
