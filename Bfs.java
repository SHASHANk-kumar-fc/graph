class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer>l=new ArrayList<>();
        boolean visit[]=new boolean[adj.size()];
        Queue<Integer>q=new LinkedList<>();
        q.add(0);visit[0]=true;
        while(!q.isEmpty()){
            int p=q.poll();
            int x=0;l.add(p);
            while(x<adj.get(p).size()){int val=adj.get(p).get(x);
                if(!visit[val]){
                    q.add(val);
                    visit[val]=true;

                }x++;
            }

        }return l;

    }
}