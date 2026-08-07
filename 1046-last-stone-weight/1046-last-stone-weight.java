class Solution {
    public int lastStoneWeight(int[] arr) {
        PriorityQueue <Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:arr){
            pq.add(ele);
        }
        while(pq.size()>1){
            int y=pq.remove();
            int x=pq.remove();
            if(x!=y){
               pq.add(y-x);
            }
        }
        return pq.isEmpty() ? 0 : pq.peek();

    }
}