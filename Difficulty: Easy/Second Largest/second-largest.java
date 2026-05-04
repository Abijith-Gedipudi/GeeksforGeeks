class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(max,arr[i]);
        }
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=max)
            {
            secondmax=Math.max(secondmax,arr[i]);
            }
        }
        return secondmax==Integer.MIN_VALUE?-1:secondmax;
    }
}