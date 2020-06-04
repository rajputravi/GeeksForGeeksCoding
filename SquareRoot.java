class SquareRoot
{
     long floorSqrt(long x)
	 {
	  if(x == 0 || x == 1)
			return x;
			
		long start = 1, end = x, ans = 0;
		
		// binary search to find square root of a number
		while(start <= end)
		{
			long mid = (start + end)/2;

            // if mid*mid == x, then mid is the required element
			if(mid*mid == x)
				return mid;
				
			// if mid*mid < x, then iterate for upper half
			if(mid*mid < x)
			{
				start = mid+1;
				ans = mid;
			}
			// else, iterate for upper half
			else
				end = mid - 1;
				
		}
		return ans;  
       
	 }
}
