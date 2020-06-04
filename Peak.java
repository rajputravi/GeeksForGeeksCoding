class Peak
{
	// Function to find the peak element
	// a[]: input array
	// n: size of array a[]
	public int peakElement(int[] a,int n)
    {
      int l=0;
      int h=a.length-1;
      while(l<=h)
      {
       int mid=(h+l)/2;
       if((mid==0||(a[mid-1]<a[mid]))&&(mid==a.length-1||(a[mid]>a[mid+1])) )
        {
           
         return mid;  
           
        }
        
        if(mid>0&&(a[mid-1]>a[mid]))
        {
          
           h=mid-1;    
        }
        else
        {
          l=mid+1;  
        }
          
    
    
          
          
          
      }
       
      return 1; 
       
    }
}