import java.util.*;

class Job {
    int id, deadline, profit;

    Job(int i, int d, int p) {
        id = i;
        deadline = d;
        profit = p;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Job jobs[] = new Job[n];

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            int deadline = sc.nextInt();
            int profit = sc.nextInt();
            jobs[i] = new Job(id, deadline, profit);
        }

        // Sort jobs by profit (descending)
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        int maxd = 0;
        for (Job j : jobs) {
            maxd = Math.max(maxd, j.deadline);
        }

        int slot[] = new int[maxd + 1];
        Arrays.fill(slot, -1);

        int totalProfit = 0;

        for (Job j : jobs) {
            for (int d = j.deadline; d > 0; d--) {
                if (slot[d] == -1) {
                    slot[d] = j.id;
                    totalProfit += j.profit;
                    break;
                }
            }
        }

        System.out.println("Total Profit: " + totalProfit);

        sc.close();
    }
}
