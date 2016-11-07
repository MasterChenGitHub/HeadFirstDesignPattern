package observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private Observable weatherData;
	private Weather weather;

	public CurrentConditionsDisplay(Observable weatherData) {
		super();
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
if(o instanceof WeatherData){
	WeatherData data=(WeatherData)o;
	display(data.getWeather());
}
	}



	@Override
	public void display(Weather data) {
		System.out.println("current condition:" + data.toString());
	}

}
