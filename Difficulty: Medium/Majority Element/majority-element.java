class Solution {
    int majorityElement(int arr[]) {
        // code here
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i:arr)
        {
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(int i:h.keySet())
        {
            if(h.get(i)>arr.length/2)
            {
                return i;
            }
        }
         return -1;

    }
}