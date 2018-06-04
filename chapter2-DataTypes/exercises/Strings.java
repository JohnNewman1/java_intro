public class Strings {
  public static void main(String[] args) {
    // declare the first name
    String first_name = "John";
    // declare the second name
    String second_name = "Jane";
    // create your message
    String message = String.format( "%s and %s are learning Java!",first_name, second_name);
    // print your message!
    System.out.println(message);
  }
}
