package observer;

public class WeatherStation {

	public static void main(String[] args) {

		WeatherData weatherData=new WeatherData();
		
		CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);
		
		ForecastDisplay forecastDisplay=new ForecastDisplay(weatherData);
		
		
		weatherData.setMeasurement(80, 65, 41.1f);
		weatherData.setMeasurement(41, 85, 21.1f);
		weatherData.setMeasurement(52, 90, 31.1f);
		
	}

}
