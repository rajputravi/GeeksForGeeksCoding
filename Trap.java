class Trap{
    
    // function to find the trapped water in between buildings
    // arr: input array
    // n: size of array
    static int trappingWater(int a[], int n) { 
      
      int r[]=new int[n];
      int l[]=new int[n];
      
      int lmax=a[0];
      int rmax=a[a.length-1];
      
      r[a.length-1]=rmax;
      
      l[0]=lmax;
      
      for(int i=1;i<a.length;i++)
      {
      lmax=Math.max(lmax,a[i]);  
       l[i]=lmax; 
      }
      
       for(int i=a.length-2;i>=0;i--)
      {
      rmax=Math.max(rmax,a[i]);  
       r[i]=rmax; 
      }
     int sum=0;
     for(int i=0;i<a.length;i++ )
     {
      int min=Math.min(l[i],r[i]);
      sum+=(min-a[i]); 
     }
       
     return sum;   
    } 
}