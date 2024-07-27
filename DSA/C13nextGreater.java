import java.util.Stack;

public class C13nextGreater { // O(n)
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();

        int nextGreater[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if(s.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }

        for(int i=0; i<nextGreater.length; i++){
            System.out.print(nextGreater[i]+ " ");
        }
        System.out.println();
    }
}

//next greater in right side
//next greater in left side
//next smaller in right side
//next smaller in right side