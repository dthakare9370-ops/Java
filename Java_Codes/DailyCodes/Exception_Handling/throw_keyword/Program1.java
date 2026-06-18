
class biryniException extends RuntimeException{
	biryniException(String msg){
		super(msg);
	}
}

class client{
	public static void main(String args[]){
		throw new biryniException("Last Hoti");
	}
}
		
