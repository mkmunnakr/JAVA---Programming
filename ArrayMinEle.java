public class ArrayMinEle {
    // min value in the array
    public static void main(String[] args) {
        int [] arr = {100, 343, 56, 64, 87, 239, 43, 141};
        int min = arr[0];
        for(int e: arr) {
            if(e<min){
                min = e;
            }
        }
        System.out.println("The value of the minimum element in this array is : "+ min);
    }
}
