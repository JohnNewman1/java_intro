import java.util.*;
public class Array {

// can you remember how to set up your main function?
  public static void main(String[] args) {
// declare an array of Strings and print it
String[] arrayOne = {"hi", "John", "how", "are", "you?"};
System.out.println(Arrays.toString(arrayOne));
// declare an array of integers and print it
int[] arrayTwo = {1,2,3,4,5,6};
System.out.println(Arrays.toString(arrayTwo));
// declare an ArrayList of integers, add numbers to it, and then print it
ArrayList<Integer> arrayThree = new ArrayList<Integer>();
arrayThree.add(1);
arrayThree.add(2);
arrayThree.add(3);
System.out.println(arrayThree);

  }
}
