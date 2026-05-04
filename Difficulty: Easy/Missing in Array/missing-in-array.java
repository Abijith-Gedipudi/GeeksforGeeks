class Solution {
    int missingNum(int arr[]) {
        // code here
        int sum=0;
        int totsum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        for(int i=1;i<=arr.length+1;i++)
        {
            totsum=totsum+i;
        }
        return totsum-sum;
    }
}