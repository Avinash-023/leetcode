class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;
        HashMap<Integer,PriorityQueue<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int k=i-j;
                map.computeIfAbsent(k,key->key>=0?new PriorityQueue<>(Collections.reverseOrder()):new PriorityQueue<>());
            map.get(k).offer(grid[i][j]);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int k=i-j;
                grid[i][j]=map.get(k).poll();
            }
        }
        return grid;
    }
}
