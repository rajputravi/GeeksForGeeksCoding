class LeftIndex{ 
    static int leftIndex(int sizeOfArray, int a[], int e)
    {
    
    int l=0;
    int h=a.length-1;
    
    while(l<=h)
    {
    int mid=(h+l)/2;
    
    if((mid==0||a[mid-1]!=e)&&(a[mid]==e))
    {
     return mid;   
    } 
    
    if(a[mid]>=e)
    {
    h=mid-1;    
    }
    else
    {
    l=mid+1;  
    }
        
        
    }
      return -1; 
      
      }
}
