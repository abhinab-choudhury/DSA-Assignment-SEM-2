package DSA_Assignment_1_SEM_2.Home_Assignment;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class A1Q2 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter number of lines you want to enter : ");
    int n = obj.nextInt();
    String arr[] = new String[n];

    System.out.println("Enter " + n + " number of lines : ");
    int k = 0;
    while(n > 0) {
      String temp = obj.nextLine();
      obj.nextLine();
      arr[k] = temp;
      k++;
      n--;
    } 

    System.out.println("Reverse of Lines : ");
    for(int i = arr.length - 1;i >= 0;i++) {
      System.out.println(arr[i]);
    }
    obj.close();
  }
}
