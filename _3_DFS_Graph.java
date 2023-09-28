import java.util.*;

class _3_DFS_Graph {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n + 1; i++) {
            arrayList.add(new ArrayList<Integer>());
        }
        arrayList.get(2).add(3);
        arrayList.get(3).add(2);

        arrayList.get(1).add(3);
        arrayList.get(3).add(1);

        arrayList.get(4).add(1);
        arrayList.get(1).add(4);

        arrayList.get(2).add(4);
        arrayList.get(4).add(2);
        boolean visited[] = new boolean[n];

        visited[2] = true;

        System.out.print(2);
        dfs(2, arrayList, visited);

    }

    private static void dfs(int node, ArrayList<ArrayList<Integer>> arrayList, boolean visited[]) {

        for (Integer it : arrayList.get(node)) {
            if (visited[it] != true) {
                visited[it] = true;
                System.out.print(it);
                dfs(it, arrayList, visited);
            }
        }
    }

}