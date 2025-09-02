public class CheckInArray {
    //Given Float / Integer present in array or not
    public static void main(String[] args) {

        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num = 45.7f;
        boolean isInArray = false;
        for(float element:marks){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value present in array ");
        }
        else {
            System.out.println("The value not present in array ");
        }

    }

}
