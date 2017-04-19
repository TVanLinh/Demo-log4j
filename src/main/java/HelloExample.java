import org.apache.log4j.Logger;
import  java.util.Scanner;

/**
 * Created by linhtran on 17/04/2017.
 */
public class HelloExample{

    final static Logger logger = Logger.getLogger(HelloExample.class);

    public static void main(String[] args) {

        Phanso phanso=new Phanso();
        phanso.nhap();


        HelloExample obj = new HelloExample();
        obj.runMe("Tran Van Linh 2");
        try
        {
            System.out.println("enter one number: ");
            int a=(new Scanner(System.in)).nextInt();
        }catch(Exception e)
        {
            logger.error("Error not is number!");
        }
    }

    private void runMe(String parameter){

        if(logger.isDebugEnabled()){
            logger.debug("This is debug : " + parameter);
        }

        if(logger.isInfoEnabled()){
            logger.info("This is info : " + parameter);
        }

        logger.warn("This is warn : " + parameter);
        logger.error("This is error : " + parameter);
        logger.fatal("This is fatal : " + parameter);
    }
}