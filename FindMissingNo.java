// { Driver Code Starts
import java.util.*;


 // } Driver Code Ends
class Missing{
    
    // function to find first positive missing number
    static int missingNumber(int a[], int size)
    {
      int max=0;
       for(int i:a)
      {
          if(max<i)
          {
              max=i;
          }
      }
     
    int c[]=new int[max+1];
    //int i=1;
    for(int i:a )
    {
     if(i>0)
     {
       c[i]++;  
     }
        
    }
    
   for(int i=1;i<c.length;i++)
   {
      if(c[i]==0)
      {
         return i;
      }
       
   }
     
     
     
    return max+1;
    }
}