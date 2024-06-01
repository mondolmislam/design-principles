public class WeatherAPIManager {
    private WeatherApiAuthentication weatherApiAuthentication;
    private WeatherApiLocationData weatherApiLocationData;

    public void WeatherAPIManager(){
        weatherApiAuthentication=new WeatherApiAuthentication();
        weatherApiLocationData=new WeatherApiLocationData();
    }

    public WeatherData getWeatherDataByLocation(String location){
        if (weatherApiAuthentication.authenticate()){
            String token=weatherApiAuthentication.getAuthToken();
            return  weatherApiLocationData.getWeatherData(token,location);
        }else {
            return null;
        }
    }
}
