
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class ps08_pr03 {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.side = 6;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
