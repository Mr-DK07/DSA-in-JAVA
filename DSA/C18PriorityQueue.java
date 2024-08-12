import java.util.*;

public class C18PriorityQueue {

    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }

    }

    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // pq.add(3);// O(logn)
        // pq.add(4);
        // pq.add(1);
        // pq.add(7);

        PriorityQueue<Student> pq1 = new PriorityQueue<>();
        pq1.add(new Student("A", 4));
        pq1.add(new Student("B", 3));
        pq1.add(new Student("C", 12));
        pq1.add(new Student("D", 1));

        while (!pq1.isEmpty()) {
            System.out.println(pq1.peek().name + "-> "+ pq1.peek().rank);// O(1)
            pq1.remove();// O(logn)

        }

    }
}
