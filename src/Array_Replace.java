/*Given the following array: ['w','t','y','h','k']
 Loop through the array and replace the the letter 't' with the word "hello" once it's found*/


import java.lang.*;
public class Array_Replace {
    public static void main(String args[]) {
        String[] char_Array = new String[]{"w", "t", "y", "h", "k"};  //String array initialization
        for (int x = 0; x < char_Array.length; x++) {
            if (char_Array[x] == "t") {
                char_Array[x]="Hello";   //Assigning and replacing char at index 2 with hello string
                }
            System.out.println(char_Array[x]+ " ");

            }
        }
    }
