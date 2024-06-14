package DSA;

public class c1ArrLinearSearch {

    public static int LinearSearch(int numbers[], int key){

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    // public static int LinearSearchStr(String menu[], String key1){

    //     for(int i=0; i<menu.length; i++){
    //         if(menu[i] == key1){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        
        int index = LinearSearch(numbers, key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Key is at index : " + index);
        }


        // String menu[] = {"Massala-Dosa", "Chhola-Bhatura", "Samosa", "Chat", "Aloo-tikki"};
        // String key1 = "Samosa";

        // int index1 = LinearSearchStr(menu, key1);
        // if(index1 == -1){
        //     System.out.println("Not Found");
        // }else{
        //     System.out.println("Key1 is at index : " + index1);
        // }
    }
}
