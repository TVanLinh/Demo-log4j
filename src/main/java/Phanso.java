import java.util.Scanner;
import org.apache.log4j.*;

/**
 * Created by linhtran on 18/04/2017.
 */
public class Phanso {
    int a;
    int b;
    public Phanso() {
    }

    public Phanso(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void nhap()
    {
        Logger logger= Logger.getLogger(this.getClass().getName());
        Scanner scanner=new Scanner(System.in);
        try
        {
            System.out.println("Enter a: ");
            this.a= scanner.nextInt();

            System.out.println("Enter b: ");
            this.a= scanner.nextInt();

        }catch (Exception e)
        {
            logger.error("Error number format");
        }
    }

}

