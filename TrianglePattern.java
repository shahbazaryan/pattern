package introduction;
//java code to print the right angle triangle shape
import java.util.Scanner;
public class TrianglePattern
  {
   public static void main(String[] args)
     {
		   int line,i,j;
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter how many lines to print");
		   line=sc.nextInt();
		   for(i=1;i<=line;i++)
		      {
              for(j=1;j<=line;j++)
                  {
                     if(j==1 || i==line || j==i)
                     	System.out.print('*');
                     else
                     	System.out.print(' ');
	                 }
              System.out.println();
           }
     }
  } 



