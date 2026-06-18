// Exception madhe pahile child yayla pahije pahile parent write kela and nanter child write kela tar error yeto 
class Demo{
	void fun(){
		System.out.println("Fun Method");
	}

	public static void main(String args[]){
		Demo obj = new Demo();
		obj.fun();

		obj = null;

		try{
			obj.fun();
		}/*catch(Throwable e){
                        System.out.println("Throwable Exception");
                }*/catch(ArithmeticException e){
			System.out.println("Arithmetic Exception");
		}catch(NullPointerException e){
			System.out.println("Null pointer Exception");
		}catch(RuntimeException e){
                        System.out.println("RunTime Exception");
                }catch(Exception e){
                        System.out.println("Exception ");
                }catch(Throwable e){
			System.out.println("Throwable Exception");
		}

	}
}
