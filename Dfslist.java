import java.util.*;

public class DFTList {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean visited[];

    static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int x : graph.get(v)) {
            if (!visited[x]) {
                dfs(x);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of vertices:");
        int n = sc.nextInt();

        visited = new boolean[n];

        // Initialize graph
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        System.out.println("Enter number of edges:");
        int e = sc.nextInt();

        System.out.println("Enter edges (u v):");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u); // remove this line for directed graph
        }

        System.out.println("DFS Traversal:");
        dfs(0);

        sc.close();
    }
}
