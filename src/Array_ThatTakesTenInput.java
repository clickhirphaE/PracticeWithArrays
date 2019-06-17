
import java.util.*;
public class Array_ThatTakesTenInput {

    public static void main(String args[]){

        int sum=0;
        int[]ten_arrays=new int[10];
        Scanner xx=new Scanner(System.in);
        for(int x=0;x<ten_arrays.length;x++){
            System.out.println(" Please Insert "+ (x) +" Index integers:");
          ten_arrays[x]=xx.nextInt();
          sum=sum+ten_arrays[x];
        }
        System.out.println("The sum of ten input inserted by the user is:"+sum);
    }
}
