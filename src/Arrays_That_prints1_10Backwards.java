/* Declare an array with the numbers 1-10.
 Print the numbers 1-10 backwards from the array.*/

public class Arrays_That_prints1_10Backwards {
    public static void main(String args[]){
        int x=10;
        int [] Array_x=new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.print(" The reversed Array value is:");
       do {

           System.out.print(+Array_x[x-1]+" ");


       x--;
       }while(x>=1);
    }}

