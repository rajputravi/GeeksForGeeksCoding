class Ones{
    
    // Object of Arrays class to access array declared in Arrays class
    static Arrays obj = new Arrays();
    
    // Function to count number of ones in the binary array
    // n: size of array
    public static int countOnes(int n){
      
      int l=0;
      int h=n-1;
      
      while(l<=h)
      {
        int mid=(h+l)/2;
        if((obj.arr[mid]==1&&(mid==n-1||obj.arr[mid+1]==0)))  
        {
         return mid+1;   
        }
        
        if(obj.arr[mid]!=1)
        {
          h=mid-1;  
        }
        else
        {
         l=mid+1;   
        }
          
          
      }
      
      return 0;  
    }
        

}