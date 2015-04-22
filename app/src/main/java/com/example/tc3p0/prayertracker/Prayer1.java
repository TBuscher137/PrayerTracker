package com.example.tc3p0.prayertracker;
import java.util.*;
import java.util.jar.Attributes;

/**
 * @author Brandon Boughton
 */

public class Prayer1 {
        public String Title(){

            String name = "title";
            int len = name.length();
            char[] tmpCharArray = new char[len];
            char[] charArray = new char[len];

            for (int i = 0; i < len; i++){
                tmpCharArray[i] = name.charAt(i);
            }


            return name;
        }


    public String Description() {

        String name = "Description";
        int len = Description().length();
        char[] tmpCharArray = new char[len];
        char[] charArray = new char[len];

        for (int i = 0; i < len; i++) {
            tmpCharArray[i] = name.charAt(i);
        }


        return "description";
    }

    public String Photo() {
        String name = "Photo";
        int len = Photo().length();
        char[] tmpCharArray = new char[len];
        char[] charArray = new char[len];

        for (int i = 0; i < len; i++){
            tmpCharArray[i] = name.charAt(i);
        }


        return String.format("Photo ");
    }


    public String Name() {
        String name = "Name";
        int len = Name().length();
        char[] tmpCharArray = new char[len];
        char[] charArray = new char[len];

        for (int i = 0; i < len; i++){
            tmpCharArray[i] = name.charAt(i);
        }



        return "Name" + " ";
    }

    public String phoneNumber() {
        String name = "phoneNumber";
        int len = phoneNumber().length();
        char[] tmpCharArray = new char[len];
        char[] charArray = new char[len];

        for (int i = 0; i < len; i++){
            tmpCharArray[i] = name.charAt(i);
        }



        return "Phone Number" + " ";
    }

    public String email() {
        String name = "email";
        int len = email().length();
        char[] tmpCharArray = new char[len];
        char[] charArray = new char[len];

        for (int i = 0; i < len; i++){
            tmpCharArray[i] = name.charAt(i);
        }



        return "email" + " ";

    }

    public GregorianCalendar dateGreg()
    {
        GregorianCalendar date = new GregorianCalendar();
        int year = date.get(GregorianCalendar.YEAR);
        int month = date.get(GregorianCalendar.MONTH);
        int day = date.get(GregorianCalendar.DAY_OF_MONTH);

        date.setTimeInMillis(1234567898765L);

        return date;
    }


    public String getName()

    {
        return Name();
    }
}