import java.util.*;
class FullFormSize{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Size  :- ");
                String size = sc.next();

                switch(size){
                        case "s":
			case "S":
                                System.out.println("Small");
                                break;
                        case "L":
			case "l":
                                System.out.println("Large");
                                break;
                        case "XL":
			case "xl":
                                System.out.println("Extra Large");
                                break;
                        case "XS":
			case "xs":
                                System.out.println("Extra Small");
                                break;
                        default :
                                System.out.println("No Any Size");
                }
        }
}
