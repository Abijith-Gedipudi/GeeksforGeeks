class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        HashMap<Integer,Integer> h=new HashMap<>();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i:arr)
        {
            h.put(i,h.getOrDefault(i,0)+1);
        }
        int dup=0;
        for(int i: h.keySet())
        {
            if(h.get(i)>1)
            {
                al.add(i);
                dup=i;
            }
        }
        int totsum=0;
        int sum=0;
        for(int i=1;i<=arr.length;i++)
        {
            totsum=totsum+i;
        }
        for(int i:h.keySet())
        {
            sum=sum+i;
        }
        al.add(totsum-sum);
        return al;
    }
}
