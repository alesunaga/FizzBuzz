class FizzBuzz {
  public static void main(String[] args) {
    // Loop through numbers 1 to 100
    for(int i = 1; i <= 100; i++) {
      
      // Check if 'i' is divisible by both 3 and 5
      if(i % 3 == 0 && i % 5 == 0) {
        // If true, print "FizzBuzz"
        System.out.println("FizzBuzz");
        // Skip the remaining code in the loop and move to the next iteration
        continue;
      } 
      
      // Check if 'i' is divisible by 3 only
      else if(i % 3 == 0) {
        // If true, print "Fizz"
        System.out.println("Fizz");
        // Skip the remaining code in the loop and move to the next iteration
        continue;
      } 
      
      // Check if 'i' is divisible by 5 only
      else if(i % 5 == 0) {
        // If true, print "Buzz"
        System.out.println("Buzz");
        // Skip the remaining code in the loop and move to the next iteration
        continue;
      }
      
      // If 'i' is not divisible by 3 or 5, print the number itself
      System.out.println(i);
    }
  }
}
