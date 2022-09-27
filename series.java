import java.util.Scanner;

/*Sample program for arithmetic progression
 * @author Ayush Kadam
 * @since: 26-09-2022
 */
public class series {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num,sum=0,a,d;
    System.out.println("Enter the first element:");
    a=sc.nextInt();
    System.out.println("Enter the common difference:");
    d=sc.nextInt();
    System.out.println("Enter the number of terms:");
    num=sc.nextInt();
    sum=(num/2)*((2*a)+((num-1)*d));
    System.out.println("The sum of elements is:"+sum);
    


}
        

}
