/*
Ini akan menghasilkan kesalahan, karena myNumbers [10] tidak ada.

public class MyClass {
  public static void main(String[ ] args) {
    int[] myNumbers = {1, 2, 3};
    System.out.println(myNumbers[10]); // error!
  }
}

Outputnya akan seperti ini:
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
        at MyClass.main(MyClass.java:4) 
*/

// Refactor pakai try & catch
public class TryCatch {
  public static void main(String[ ] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]); // error!
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    }
  }
}