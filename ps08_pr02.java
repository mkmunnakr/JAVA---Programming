// Create a class Cellphone with mnethod to print "ringing..", "Vibrating..." etc

class CellPhone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Mukul...");
    }
}
public class ps08_pr02 {
    public static void main(String[] args) {
        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.ringing();
        asus.vibrating();
    }
}
