public class Loop_Through_Array {
    public static void main(String args[]){
        int Array1_through_10[]= new int[]{1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for(int x=0;x<Array1_through_10.length;x++){
           sum=sum+Array1_through_10[x];
        }
        System.out.println(" The sum of the array 1 through 10 is: "+sum);
    }
}
