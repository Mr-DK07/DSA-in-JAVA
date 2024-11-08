import java.util.*;

public class C18InsertInPriorityQ {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);

            int x = arr.size() - 1; // x is child index
            int p = (x - 1) / 2; // p is parent index

            while (arr.get(x) < arr.get(p)) { // O(logn)
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(p));
                arr.set(p, temp);

                x = p;
                p = (x - 1) / 2;
            }
        }

        // minimum in minHeap
        public int peek() {
            return arr.get(0);
        }

        private void heapify(int i) { // O(log n)
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }
            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if (minIdx != i) {
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);

            }
        }

        public int remove() { 
            int data = arr.get(0);

            // step1 = swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // step2 = delete last
            arr.remove(arr.size() - 1);

            // step 3 = heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap pq = new Heap();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);

        while (!pq.isEmpty()) { // heap sort O(nlog n)
            System.out.println(pq.peek());
            pq.remove();
            
        }
    }
}
