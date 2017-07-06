package msobdev.weatherapp.Common;

/**
 * Created by sob1 on 06.07.2017.
 */

public class Common {
    public static String API_KEY = "";
    public static String API_LINK = "http://api.openweathermap/data/2.5/weather";


    /**
     * Creates a functional link to the api
     * @param lat City geo location, longitude
     * @param lng Cuty geo location, latitude
     * @return weather request
     * */
    public static String apiRequest(String lat, String lng){
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lon=%s&APPID=%s&units=metric", lat, lng, API_KEY));
        return sb.toString();
    }
}
