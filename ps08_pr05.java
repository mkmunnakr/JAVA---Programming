// TommyVercetti Rockstar Game

class TommyVercetti{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running  from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
public class ps08_pr05 {
    public static void main(String[] args) {
        TommyVercetti player1 = new TommyVercetti();
        player1.fire();
        player1.run();
        player1.hit();
    }
}
