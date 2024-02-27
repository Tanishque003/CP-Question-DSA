class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<Integer>();

        ListNode tmp = head;
        int size = 0;
        while(tmp != null) {
            size++;
            list.add(tmp.val);
            tmp = tmp.next;
        }

        int ans[] = new int[size];
        for(int i = list.size() - 1; i>=0 ; i--){
            while(!s.isEmpty() && s.peek() <= list.get(i) ) {
                s.pop();
            }
            if(s.isEmpty()) {
                ans[i] = 0;
            } else {
                ans[i] = s.peek();
            }

            s.push(list.get(i));
        }
        return ans;
    }
}