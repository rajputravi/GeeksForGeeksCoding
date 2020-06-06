/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
   static void sorZeroesOnesTwos(int a[])
   {
       //0 2 1 2 0
       int low = 0, high = a.length-1, mid = 0;
        while(mid <= high){
            if(a[mid]==0) {
                int temp=a[low];
                a[low]=a[mid];
                a[mid]=temp;
                low++;
                mid++;
            } else if(a[mid]==1) {
                mid++;
            } else {
                int temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
            }
       
   }
   }
   
public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	   int T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
		 int N=sc.nextInt();  
		 int a[]=new int[N];
		 
		 for(int j=0;j<N;j++)
		 {
		   a[j]=sc.nextInt();  
		 }
	     sorZeroesOnesTwos(a);
	     StringBuffer sb=new StringBuffer();
	     for(int k=0;k<a.length;k++)
	     {
	      sb.append(a[k]).append(" "); 
	     }
	       
	 System.out.println(sb);    
	}
	
	
	}
}