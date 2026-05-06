class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int low=0;
        int high=arr.length -1;
        int res=-1;
        while(low<=high)
        {
            int mid=low+ (high-low)/2;
            if(arr[mid]==k)
            {
                res=mid;
                high=mid-1;
            }
            else if(arr[mid]>k)
            {
                high=mid-1;
            }
            else{
            low=mid+1;
            }
        }
        return res;
    }
}