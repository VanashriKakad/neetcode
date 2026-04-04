class Solution {

    public class Tuple{
        int src;
        int dest;
        int distFromChest;

        public Tuple(int src, int dest,int distFromChest){
            this.src = src;
            this.dest = dest;
            this.distFromChest = distFromChest;
        }

    }

    public void islandsAndTreasure(int[][] grid) {
        
        int INF = Integer.MAX_VALUE;

        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];
        Queue<Tuple> q = new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && grid[i][j] == 0){
                    q.add(new Tuple(i,j,0));
                    visited[i][j] = true;
                }

            }
        }

        while(!q.isEmpty()){

            Tuple t = q.poll();
            int i = t.src;
            int j = t.dest;
            int distFromChest = t.distFromChest;

            if(grid[i][j]== INF){
                grid[i][j] = distFromChest;
            }

            if( i-1>=0 && !visited[i-1][j] && grid[i-1][j] == INF){
                q.add(new Tuple(i-1,j,distFromChest+1));
                visited[i-1][j] = true;
            }

            if( i+1<n && !visited[i+1][j] && grid[i+1][j] == INF){
                q.add(new Tuple(i+1,j,distFromChest+1));
                visited[i+1][j] = true;
            }

            if(j-1>=0 && !visited[i][j-1] && grid[i][j-1]== INF){
                q.add(new Tuple(i,j-1,distFromChest+1));
                visited[i][j-1] = true;
            }

            if(j+1<m && !visited[i][j+1] && grid[i][j+1]== INF){
                q.add(new Tuple(i,j+1,distFromChest+1));
                visited[i][j+1] = true;
            }

        }


    }
}
