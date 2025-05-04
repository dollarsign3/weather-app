// retrieve weather data from API - this backend logic will fetch the latest weather
// data from the external API and return it. The GUI will
// display this data to the user

import java.net.HttpURLConnection;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class WeatherApp {
    // fetch weather data for given location
    public static JSONObject getWeatherData(String locationName){
        // get location coordinates using the geolocation API
        JSONArray locationData = getLocationData(locationName);
    }

    // retrievs geographic coordinates for given location name
    private static JSONArray getLocationData(String locationName){
        // replace any whitespace in location name to + to adhere to API's request format
        locationName = locationName.replaceAll(" ", "+");

        // build API url with location parameter
        String urlString = "https://geocoding-api.open-meteo.com/v1/search?name=" +
        locationName + "&count=10&language=en&format=json";

        try {
            // call api and get a response
            HttpURLConnection conn = fetchApiResponse(urlString);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static HttpURLConnection fetchApiResponse(String urlString){

    }


}
