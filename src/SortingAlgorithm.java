public class SortingAlgorithm {

    static public String[] InsertionSort(String[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {

            String key = arr[i];
            int j = i - 1;

            while (j >= 0 && Helpers.biggerThan(arr[j],key) ) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    static public String[] SelectionSort(String[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {

                if ( Helpers.smallerThan(arr[j],arr[min_idx])  ) {
                    min_idx = j;
                }
            }

            String temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }



    private static void MergeSort_merge(String[] a, int lo, int mid, int hi) {
        String[] aux = a.clone();

        // merge back to a[]
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if      (i > mid)              a[k] = aux[j++];  // this copying is unneccessary
            else if (j > hi)               a[k] = aux[i++];
            else if ( Helpers.smallerThan(aux[j],aux[i]) )      a[k] = aux[j++];
            else                           a[k] = aux[i++];
        }

    }

    static public String[] MergeSortBottomUp(String[] arr) {

        int N = arr.length;

        for (int sz = 1; sz < N; sz = sz + sz) {
            for(int lo = 0; lo < N-sz; lo += sz+sz){
                int mid = lo + sz - 1;
                int hi = Math.min(lo + sz + sz - 1, N - 1);
                MergeSort_merge(arr, lo, mid, hi);
            }
        }

        return arr;
    }




}
