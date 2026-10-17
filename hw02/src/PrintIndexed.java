public class PrintIndexed {
   /**
    * Prints each character of a given string followed by the reverse of its index.
    * Example: printIndexed("hello") -> h4e3l2l1o0
    */
   public static void printIndexed(String s) {
      String res = "";
      int str_len = s.length();
      for (int i = 0; i < str_len; i++) {
         int added_num = str_len - i - 1;
         res += "" + s.charAt(i) + added_num;
      }
      System.out.println(res);
   }

   public static void main(String[] args) {
      printIndexed("hello");
      printIndexed("cat"); // should print c2a1t0
   }
}