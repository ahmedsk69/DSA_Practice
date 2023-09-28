import java.util.*;
class _2_BFS_Graph{
    public static void main(String[] args){
        int n =5;
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<n+1;i++){
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
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(2);
        visited[2]=true;
        // get by node
        while(!q.isEmpty()){
            Integer node = q.poll();
            for(Integer it : arrayList.get(node)){
                if(visited[it]!=true){
                    visited[it]=true;
                    System.out.print(it);
                    q.add(it);
                }
            }
        }
        
        boolean visitednew[] = new boolean[n];
        /// Get All
        for(int i=0; i<n+1;i++){
            // 
            System.out.println("");
            for(Integer it : arrayList.get(i)){
                if(visitednew[it]!=true){
                    visitednew[it]=true;
                    System.out.print(it);
                }
            }
        }
           
    }

}