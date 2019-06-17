/*
Get 10 number inputs from the user,
store them in an array and get the average of those 10 numbers.
*/
import java.util.*;
public class _10_Array_Average {
    public static void main(String args[]){
        int input_ten_Array[]=new int[10];
        int sum=0, Average=0;
        Scanner tt=new Scanner(System.in);
        for(int x=0;x<input_ten_Array.length;x++){
            System.out.println(" Please put in "+ x +" Index  integer:");
            input_ten_Array[x]=tt.nextInt();
            sum=sum+input_ten_Array[x];
            Average=sum/10;


        }
        System.out.println(" The average of the 10 numbers put in is: "+Average);
    }

}
