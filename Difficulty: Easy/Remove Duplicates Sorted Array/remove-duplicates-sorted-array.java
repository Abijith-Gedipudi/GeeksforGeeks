class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        LinkedHashMap<Integer,Integer> h=new LinkedHashMap<>();
        for(int i:arr)
        {
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(int i: h.keySet())
        {
                al.add(i);
        }
        return al;
    }
}
