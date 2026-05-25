class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        HashMap<Integer,Integer> h= new HashMap<>();
        for(int i: arr)
        {
            h.put(i,h.getOrDefault(i,0)+1);
        }
        if(h.containsKey(target))
        {
        return h.get(target);
        }
        else {
            return 0;
        }
    }
}
