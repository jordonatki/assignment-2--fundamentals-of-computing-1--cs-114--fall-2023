import java.util.Scanner;
//Goal is to take user input and use it print a diamond pattern using "*"
public class Diamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number");
    int row = scanner.nextInt();
    int col = (row+1)/2;
    int a,b,c;

    for (a=1; a<=col; a++) { //outer loop to handle rows
      for (b=1; (b<=col-a);b++) { //handles columns
        System.out.print(" ");
      }
      for (c=1; c<=2*a-1; c++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (a=1; a<=col; a++) { //outer loop to handles rows
      for (b=1; b<=a; b++) { //handles columns
        System.out.print(" ");
      }
      for (c=0; c<(2*(col-a)-1); c++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
