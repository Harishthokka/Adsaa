import java.util.*;

public class DFTMatrix {

    static void dfs(int v, boolean visited[], int adj[][], int n) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int i = 0; i < n; i++) {
            if (adj[v][i] == 1 && !visited[i]) {
                dfs(i, visited, adj, n);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of vertices:");
        int n = sc.nextInt();

        int adj[][] = new int[n][n];

        System.out.println("Enter adjacency matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adj[i][j] = sc.nextInt();
            }
        }

        boolean visited[] = new boolean[n];

        System.out.println("DFS Traversal:");
        dfs(0, visited, adj, n);

        sc.close();
    }
}
