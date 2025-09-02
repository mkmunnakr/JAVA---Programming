public class ArrayReverse {
    // Reverse an array
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            // a b temp
            // || |4| |3|
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-i-1] = temp;
        }
        for(int element: arr){
            System.out.print(element + " ");
        }
    }
}
