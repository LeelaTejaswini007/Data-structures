import java.io.*;
import java.util.Scanner;
public class BubbleSort
{
  public static void main(String args[])
  {
    int a[];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size");
    int n=sc.nextInt();
    a=new int[n];
    System.out.println("enter the array elements");
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    System.out.println("\n before sorting");
    display(a);
    bubbleSort(a);
    System.out.println("\n after sorting");
    display(a);
  }
  public static void bubbleSort(int a[])
  {
    int i,j,temp;
    for(i=0;i<a.length;i++)
    {
      for(j=i+1;j<a.length;j++)
      {
        if(a[i]>a[j])
        {
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }
  }
  public static void display(int a[])
  {
    for(int i=0;i<a.length;i++)
      System.out.print(a[i]+" ");
  }
}