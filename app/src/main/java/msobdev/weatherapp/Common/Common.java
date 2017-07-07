package msobdev.weatherapp.Common;

import android.support.annotation.NonNull;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sob1 on 06.07.2017.
 */

public class Common {
    public static String API_KEY = "798b037de135e2e3bcfe5cf6953d9a87";
    public static String API_LINK = "http://api.openweathermap/data/2.5/weather";


    /**
     * Creates a functional link to the api
     * @param lat City geo location, longitude
     * @param lng Cuty geo location, latitude
     * @return weather request
     * */
    @NonNull
    public static String apiRequest(String lat, String lng){
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lon=%s&APPID=%s&units=metric", lat, lng, API_KEY));
        return sb.toString();
    }

    /**
     * Converts unix time stamp to Date type with format "HH:mm"
     * @param unixTimeStamp unix time stamp
     * @return Date type
     */
    public static String unixTimeStampToDateTime(double unixTimeStamp){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime((long) unixTimeStamp*1000);
        return dateFormat.format(date);
    }

    /**
     * Gets a link image from OpenWeatherMap
     * @param icon
     * @return
     */
    public static String getImage(String icon){
        return String.format("http://openweathermap.org/img/w/%s.png", icon);
    }

    /**
     * Gets Date with format "dd MMMM yyyy HH:mm"
     * @return
     */
    public static String getDateNow(){
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
