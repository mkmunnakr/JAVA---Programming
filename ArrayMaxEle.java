public class ArrayMaxEle {
    // Maximum element in a Array
    public static void main(String[] args) {
        int [] arr = {1, 34, 56, 23, 64, 87, 23, 43, 14};
        int max = 0;
        for(int e: arr) {
            if(e>max){
                max = e;
            }
        }
        System.out.println("The value of the maximum element in this array is : "+ max);
    }
}
