class Solution {
    public int candy(int[] a) {
        int n=a.length,i;
        ArrayList<Integer> c = new ArrayList<>(n);
        for(i=0;i<n;i++)
        c.add(1);
        for(i=1;i<n;i++)
        {
            if(a[i]>a[i-1])
                c.set(i,c.get(i-1)+1);
        }
        for(i=n-2;i>=0;i--)
        {
            if(a[i]>a[i+1])
                c.set(i,Math.max(c.get(i),c.get(i+1)+1));
        }
        int s=0;
        for(i=0;i<n;i++)
        s+=c.get(i);
        return s;
    }
}