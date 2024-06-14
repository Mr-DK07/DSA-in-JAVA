package DSA;

public class c1ArrBinarySearch {
    public static int BinarySearch(int numbers[], int key){
        int start = 0;
        int end = numbers.length-1;

        while (start <= end) {
            int mid = (start + end)/2;

            if(key == numbers[mid]){
                return mid;
            }
            if(key < numbers[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 4;
        System.out.println("key is at index : " + BinarySearch(numbers, key));
    }
}
