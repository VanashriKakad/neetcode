class Solution {
    public int countComponents(int n, int[][] edges) {

        int V = n;
        int connectedComp =0;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] e:edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        boolean[] visited = new boolean[V];

        for(int i=0;i<V;i++){
            if(!visited[i]){
                connectedComp++;
                dfs(adj,visited,i);
            }
        }

        return connectedComp;

    }

    public void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] visited,int start){

        visited[start] = true;

        for(int i=0;i<adj.get(start).size();i++){
            int neighbour = adj.get(start).get(i);

            if(!visited[neighbour]){
                dfs(adj,visited,neighbour);
            }
        }
    }
}
