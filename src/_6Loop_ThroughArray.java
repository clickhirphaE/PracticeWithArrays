
/*Create an array with the following values: [2,5,9,0,2,1,8,5,4]
  Loop through the array and print out the index each time the value equals 5.*/

public class _6Loop_ThroughArray {

    public static void main(String args[]){
        int testA[]=new int[]{2,5,9,0,2,1,8,5,4};  //Array initialization
        for(int x=0;x<testA.length;x++){
         if(testA[x]==5){    //checks the index holding value 5
             System.out.println(" This value is located at Index "+x);

         }
        }
    }
}
