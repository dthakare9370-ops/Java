import java.util.*;
class TrafficLite{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Trafic Color Lite :- ");
		String lite = sc.next();

		switch(lite){
			case "Red": 
			case "red":
				System.out.println("Stop");
				break;
			case "Yellow":
			case "yellow":
				System.out.println("View and go ");
				break;
			case "Green":
			case "green":
				System.out.println("Go Fast");
                                break;
			default :
				System.out.println("No such Color Present in Traffic Lite");
		}
	}
}
