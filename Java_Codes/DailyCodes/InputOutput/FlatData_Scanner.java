import java.util.*;
class FlatData_Scanner{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter Society Name : ");
                String sName = sc.next();
                System.out.println("Enter wing : ");
                char wing = sc.next().charAt(0);
		System.out.println("Enter rent : ");
                float rent = sc.nextFloat();
		System.out.println("Enter FlatNo : ");
                int flatNo = sc.nextInt();
                System.out.println("Society Name : "+sName);
		System.out.println("Wing : "+wing);
		System.out.println("rent :"+rent);
		System.out.println("FlatNo : "+flatNo);

        }
}
