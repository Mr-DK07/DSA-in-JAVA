public class C9rotatedSArray {

    public static int search(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        // calculate mid
        int mid = si + (ei - si) / 2;

        if (arr[mid] == tar) {
            return mid;
        }

        // mid on L1
        if (arr[si] <= arr[mid]) {
            // left part
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                // right part
                return search(arr, tar, mid + 1, ei);
            }
        }
        // mid on L2
        else {
            // right part
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                // left part
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 1;
        int tarIdx = search(arr, target, 0, arr.length - 1);
        System.out.println("index = "+tarIdx);
    }
}