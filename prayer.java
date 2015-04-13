import java.text.DateFormat;
import java.util.Date;

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

    Date date = new Date(location.getTime());
    DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(getApplicationContext());
    mTimeText.setText("Time: " +dateFormate.format(date));


    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
