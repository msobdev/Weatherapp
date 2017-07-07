package msobdev.weatherapp.Helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by sob1 on 07.07.2017.
 */

public class Helper {
    static String stream = null;

    public Helper(){

    }

    /**
     * Makes a request to OpenWeatherMap's API and get return result
     * @param urlString
     * @return
     */
    public String getHTTPData(String urlString){
        try {
            URL url = new URL(urlString);
            /** open connection based on urlString*/
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            /** response is ok*/
            if(httpURLConnection.getResponseCode() == 200){
                /** gets input stream*/
                BufferedReader r = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line;
                /** reads by the line*/
                while((line = r.readLine()) != null){
                    sb.append(line);
                }
                /** gets the string*/
                stream = sb.toString();
                /** close the connection*/
                httpURLConnection.disconnect();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stream;
    }
}
