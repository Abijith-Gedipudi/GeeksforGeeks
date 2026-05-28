class Solution {
    public static int firstRepeated(int[] arr) {
        // code here
        HashMap<Integer,Integer> h =new HashMap<>();
        for(int i:arr)
        {
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(h.get(arr[i])>1)
            {
                return i+1;
            }
        }
        return -1;
    }
}
