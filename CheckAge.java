public class CheckAge {
  static String cekAge(int age) { 
    if (age < 18) {
        return "Access denied - You must be at least 18 years old."; 
    }
    else {
        return "Access granted - You are old enough!"; 
    }
  } 
}
