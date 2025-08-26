import java.sql.SQLOutput;
import java.util.Scanner;

public class WebsitesType {
    // URL ---> type of websites
    public static void main(String[] args) {
        System.out.print("Enter Full Websites name : ");
        Scanner website = new Scanner(System.in);
        String nam = website.nextLine() ;
        if(nam.endsWith(".com")){
            System.out.println("Commercial Website ");
        }
        else if(nam.endsWith(".org") ) {
            System.out.println("Organization Website ");
        }
        else if(nam.endsWith(".in")){
            System.out.println("Indian Website");
        }
    }
}
