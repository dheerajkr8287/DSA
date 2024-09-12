package Datatype;



//****************GFG***************



public class dataTypeSize {
   /* Geek is learning a new programming language. As data type forms the most fundamental part of a language, Geek is learning them with focus and needs your help.
    Given a data type, help Geek in finding the size of it in byte.

    Data Type - Character, Integer, Long, Float and Double

    Example 1:

    Input: Character
    Output: 1
    Explaination: For java it would be 2 bytes.
            Example 2:

    Input: Integer
    Output: 4


    Your Task:

    Complete the function dataTypeSize() which takes a string as input and returns the size of the data type represented by the given string in byte unit.
    Return -1 if the input data type is invalid.*/

    class Solution {
        static int dataTypeSize(String str) {
            // code here



// The .BYTES constants provide a convenient way to determine the memory size of primitive types in Java.
// They are particularly useful for developers who need to manage memory efficiently or understand the data structure sizes in their applications.


            //------------BestCase----------
            //  switch(str){
            //      case "Character":
            //          return Character.BYTES;
            //      case "Integer":
            //          return Integer.BYTES;
            //      case "Long":
            //          return Long.BYTES;
            //      case "Float":
            //          return Float.BYTES;
            //      case "Double":
            //          return Double.BYTES;
            //      default:
            //       return -1;
            //  }


//            //--------brute approch-------
            switch (str.toLowerCase()) {
                case "character":
                    return 2; // In Java, the size of char is 2 bytes (16-bit Unicode character)
                case "integer":
                    return 4; // In Java, the size of int is 4 bytes
                case "long":
                    return 8; // In Java, the size of long is 8 bytes
                case "float":
                    return 4; // In Java, the size of float is 4 bytes
                case "double":
                    return 8; // In Java, the size of double is 8 bytes
                default:
                    return -1; // Invalid data type
            }
        }
    }
}
