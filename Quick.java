class QuickSort {

    static int partition(int A[], int l, int h) {
        int pivot = A[l];
        int i = l + 1;
        int j = h;

        while (i <= j) {

            while (i <= h && A[i] <= pivot) {
                i++;
            }

            while (A[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }

        int temp = A[l];
        A[l] = A[j];
        A[j] = temp;

        return j;
    }

    static void quickSort(int A[], int l, int h) {
        if (l < h) {
            int j = partition(A, l, h);
            quickSort(A, l, j - 1);
            quickSort(A, j + 1, h);
        }
    }

    public static void main(String[] args) {

        int A[] = {20, 10, 30, 50, 40, 0};
        int n = A.length;

        System.out.println("Before Sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

        quickSort(A, 0, n - 1);

        System.out.println("\nAfter Sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
