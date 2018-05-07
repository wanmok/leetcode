class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int numEdges = prerequisites.length;
        int[] vertexEdges = new int[numCourses];
        Deque<Integer> zeroVertices = new LinkedList<>();
        
        for (int i = 0; i < numEdges; i ++)
            vertexEdges[prerequisites[i][1]] ++;
        
        for (int i = 0; i < numCourses; i ++)
            if (vertexEdges[i] == 0)
                zeroVertices.offerLast(i);
        
        int count = 0;
        while (! zeroVertices.isEmpty()) {
            Integer v = zeroVertices.pollFirst();
            count ++;
            
            for (int j = 0; j < numEdges; j ++) {
                if (prerequisites[j][0] != v) continue;
                vertexEdges[prerequisites[j][1]] --;
                if (vertexEdges[prerequisites[j][1]] == 0)
                    zeroVertices.offerLast(prerequisites[j][1]);
            }
        }
        
        return count == numCourses;
    }
}