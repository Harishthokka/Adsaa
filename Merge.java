class MergeSort {

    static void merge(int A[], int l, int m, int h) {
        int i = l;
        int j = m + 1;
        int k = l;

        int B[] = new int[A.length];

        while (i <= m && j <= h) {
            if (A[i] < A[j]) {
                B[k++] = A[i++];
            } else {
                B[k++] = A[j++];
            }
        }

        while (i <= m) {
            B[k++] = A[i++];
        }

        while (j <= h) {
            B[k++] = A[j++];
        }

        for (i = l; i <= h; i++) {
            A[i] = B[i];
        }
    }

    static void mergeSort(int A[], int l, int h) {
        if (l < h) {
            int m = (l + h) / 2;

            mergeSort(A, l, m);
            mergeSort(A, m + 1, h);
            merge(A, l, m, h);
        }
    }

    public static void main(String[] args) {

        int A[] = {38, 27, 43, 10, 9, 82};
        int n = A.length;

        System.out.println("Before Sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

        mergeSort(A, 0, n - 1);

        System.out.println("\nAfter Sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
