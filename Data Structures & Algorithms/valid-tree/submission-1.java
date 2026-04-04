class Solution {
    public boolean validTree(int n, int[][] edges) {

        int V = n;
        int components =0;
        boolean[] visited = new boolean[V];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] e:edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        for(int i=0;i<V;i++){
            if(!visited[i]){
                components++;
                if(findCycle(adj,visited,i,-1))
                return false;
            }
        }

        if(components>1){
            return false;
        }

        return true;

    }

    public boolean findCycle(ArrayList<ArrayList<Integer>> adj, boolean[] visited,
    int start, int parent){

        visited[start] = true;

        for(int i=0;i<adj.get(start).size();i++){
            int  neighbour = adj.get(start).get(i);

            if(visited[neighbour] && neighbour!= parent){
                return true;
            }

            if(!visited[neighbour]){
                if(findCycle(adj,visited,neighbour,start)){
                    return true;
                }

            }
        }

        return false;
    }
}
