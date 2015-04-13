
import java.time.Year;
import java.util.*;

/**
 *
 * @author Brandon Boughton
 */
public class prayer {

    
    public String Title() {
        return "title" + " ";
    }

    public String Description(){
            return "description" + " ";

    }

    public String Photo() {
        return String.format("Photo ");
    }

    public String Name() {
        return "Name" + " ";
    }


    public String phoneNumber() {
        return "Phone Number" + " ";
    }


    public String email() {
        return "email" + " ";

    }




    public static void main(String[] args) {
       GregorianCalendar date = new GregorianCalendar();

        int year0 = date.get(GregorianCalendar.YEAR);
        int month0 = date.get(GregorianCalendar.MONTH);
        int day0 = date.get(GregorianCalendar.DAY_OF_MONTH);

        date.setTimeInMillis(1234567898765L);

        int year1

    }
    
}
