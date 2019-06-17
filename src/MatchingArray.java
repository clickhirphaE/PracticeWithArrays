/* Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
        Write a program that will print out all matching pairs from arrays 1 and 2.
        Expected output:
        (7,7) and (6,6)*/


public class MatchingArray {
    public static void main(String args[]){
        int [] Array_1=new int[]{1,7,6,5,9};
        int [] Array_2=new int[]{2,7,6,3,4};
        for(int x=0;x<Array_1.length && x<Array_2.length;x++)
        {
            if(Array_1[x]==Array_2[x]){
                System.out.println("("+Array_1[x]+","+Array_2[x]+")");
            }
        }
    }
}
