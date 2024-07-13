public class D8pqNoOfOccurrence {

    public static void printOccurance(int arr[], int key, int i){
        if(i < 0){
            return;
        }
        
        printOccurance(arr, key, i-1);
        
        if(arr[i] == key){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {30, 20, 10, 20, 20};
        int key = 20;
        int i = arr.length-1;

        printOccurance(arr, key, i);
    }
}
