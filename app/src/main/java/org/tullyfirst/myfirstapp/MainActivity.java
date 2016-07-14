package org.tullyfirst.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.Calendar;
import org.tullyfirst.myfirstapp.TheWordReverser;

import java.util.Date;

import java.text.SimpleDateFormat;

public class MainActivity extends AppCompatActivity {

    public static void main (String[] args){
        //long currentTime = new Date().getTime();
        //System.out.println(currentTime);
        //String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
/*
        boolean isNight = checkTimeAfter("17:00");
        if (isNight) {
            System.out.println("Its Dark");
        } else {
            System.out.println("Its Bright");
        }
*/
        TheWordReverser backwards = new TheWordReverser();
        System.out.println(backwards.reverse("I Rule"));
        System.out.println(backwards.reverse("The World"));
    }
    public static boolean checkTimeAfter(String time) {
        boolean timeIsAfter = false;
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(time.substring(0, 2)));
        cal.set(Calendar.MINUTE, Integer.parseInt(time.substring(3)));
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        if (Calendar.getInstance().after(cal)) {
            System.out.println("Its After");
            timeIsAfter = true;
        } else {
            System.out.println("Its Before");
        }
        return timeIsAfter;
    }
    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    */
}
