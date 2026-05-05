class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        HashMap<Integer,Integer> h=new HashMap<>();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i:arr)
        {
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(int i:h.keySet())
        {
            if(h.get(i)>1)
            {
                al.add(i);
            }
        }
        return al;
    }
}