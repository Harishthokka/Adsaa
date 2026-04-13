import java.util.*;

public class Main {

    static int n, m;
    static int g[][];
    static int color[];

    static boolean safe(int v, int c) {
        for (int i = 0; i < n; i++) {
            if (g[v][i] == 1 && color[i] == c) {
                return false;
            }
        }
        return true;
    }

    static void solve(int v) {
        if (v == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(color[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int c = 1; c <= m; c++) {
            if (safe(v, c)) {
                color[v] = c;
                solve(v + 1);
                color[v] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        g = new int[n][n];
        color = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                g[i][j] = sc.nextInt();
            }
        }

        solve(0);
        sc.close();
    }
}
