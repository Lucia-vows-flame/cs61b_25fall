public class StarTriangleN {
   /**
    * Prints a right-aligned triangle of stars ('*') with N lines.
    * The first row contains 1 star, the second 2 stars, and so on.
    */
   public static void starTriangle(int N) {
      int star_line_num = N;
      for (int i = 1; i < star_line_num + 1; i++) {
         for (int j = 0; j < N - i; j++) {
            System.out.print(" ");
         }
         for (int j = 0; j < i; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }

   public static void main(String[] args) {
      starTriangle(7);
   }
}