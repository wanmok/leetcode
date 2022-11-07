class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer> result = new ArrayList<>();
        int numEdges = prerequisites.length;
        int[] vertexEdges = new int[numCourses];
        Deque<Integer> zeroVertices = new LinkedList<>();
        
        for (int i = 0; i < numEdges; i ++)
            vertexEdges[prerequisites[i][0]] ++;
        
        for (int i = 0; i < numCourses; i ++)
            if (vertexEdges[i] == 0)
                zeroVertices.offerLast(i);
        
        int count = 0;
        while (! zeroVertices.isEmpty()) {
            Integer v = zeroVertices.pollLast();
            
            result.add(v);
            count ++;
            
            for (int j = 0; j < numEdges; j ++) {
                if (prerequisites[j][1] != v) continue;
                vertexEdges[prerequisites[j][0]] --;
                if (vertexEdges[prerequisites[j][0]] == 0)
                    zeroVertices.offerLast(prerequisites[j][0]);
            }
        }
        if (count != numCourses)
            return new int[0];
        else {
            int[] ret = new int[result.size()];
            for (int i = 0; i < numCourses; i ++)
                ret[i] = result.get(i);
            return ret;
        }
    }
}