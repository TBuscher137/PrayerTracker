
import java.util.*;
import java.util.jar.Attributes;

/**
 * @author Brandon Boughton
 */

public class prayer {
    public static void main(String[] args) {

        boolean answeredPrayer = true;
        if(answeredPrayer == true){
            System.out.print(true);
        }else{
            System.out.print(false);
        }


        String title[] = new String[1];
        title[0] = " ";

        String description[] = new String[1];
        description[0] = "";

        String photo[] = new String[1];
        photo[0] = " ";


        String name[] = new String[1];
        name[0] = " ";

        String phoneNumber[] = new String[1];
        phoneNumber[0] = " ";

        String email[] = new String[1];
        email[0] = " ";

        {
            GregorianCalendar date = new GregorianCalendar();

            int year = date.get(GregorianCalendar.YEAR);
            int month = date.get(GregorianCalendar.MONTH);
            int day = date.get(GregorianCalendar.DAY_OF_MONTH);

            date.setTimeInMillis(1234567898765L);


        }

    public String getTitle() {
        return title;
    }

    public void setTitle(String prayerTitle) {
        title = prayerTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String prayerDescription) {
        description = prayerDescription;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String prayerPhoto) {
        photo = prayerPhoto;
    }

    public String getName() {
        return name;
    }

    public void setName(String personName) {
        name = personName;
    }

    public String getPhoneNumber() {
        return getPhoneNumber;
    }

    public void setPhoneNumber(String personPhoneNumber) {
        phoneNumber = personPhoneNumber;
    }

    public String getEmail() {
        return getEmail;
    }

    public void setEmail(String personEmail) {
        email = personEmail;
    }
}
}
