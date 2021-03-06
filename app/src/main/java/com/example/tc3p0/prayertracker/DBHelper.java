package com.example.tc3p0.prayertracker;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper{

    public SQLiteDatabase DB;
    public String DBPath;
    public static String DBName = "PrayerTracker";
    public static final int version = '1';
    public static Context currentContext;
    public static String tableName = "Prayers";


    public DBHelper(Context context) {
        super(context, DBName, null, version);
        currentContext = context;
        DBPath = "/data/data/" + context.getPackageName() + "/databases";
        createDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub

    }

    private void createDatabase() {
        boolean dbExists = checkDbExists();

        if (dbExists) {
            // do nothing
        } else {
            DB = currentContext.openOrCreateDatabase(DBName, 0, null);
            DB.execSQL("CREATE TABLE IF NOT EXISTS " +
                    tableName +
                    " (title VARCHAR, description VARCHAR, photo VARCHAR," +
                    " name VARCHAR, phoneNumber INTEGER, email VARCHAR" +
                    " untilDate VARCHAR, prayedFor INTEGER");

            DB.execSQL("INSERT INTO " +
                    tableName +
                    " Values ('Grandma Jensons dog', 'Grandma Jensons dog is annoying, " +
                    "but it's leg is broken.', 'null', 'Grandma Jenson', 9999999999, " +
                    "'GJENson@gmail.com', '2015-12-03 13:45', 0);");
            DB.execSQL("INSERT INTO " +
                    tableName +
                    " Values ('Brents Boss', 'His boss is making him do too much work.'," +
                    " 'null', 'Brent', 8888888889, " +
                    "'BrentIsacomputerteacher@gmail.com', '2015-11-12 23:59', 1);");
        }


    }

    private boolean checkDbExists() {
        SQLiteDatabase checkDB = null;

        try {
            String myPath = DBPath + DBName;
            checkDB = SQLiteDatabase.openDatabase(myPath, null,
                    SQLiteDatabase.OPEN_READONLY);

        } catch (SQLiteException e) {

            // database does't exist yet.

        }

        if (checkDB != null) {

            checkDB.close();

        }

        return checkDB != null ? true : false;
    }
}