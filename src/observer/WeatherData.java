package observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {

	
	private List<Observer> observers=Collections.EMPTY_LIST;	
	
	private Weather weather=new Weather(0, 0, 0);
	
	
	
	public WeatherData() {
		observers=new ArrayList<Observer>();
	}

	public void measureChanged(){
		setChanged();
		notifyObservers();
	}
	
	
	public void setMeasurement(float temperature,float humidity,float pressure){
		
		weather.setTemperature(temperature);
		weather.setHumidity(humidity);
		weather.setPressure(pressure);
		
		measureChanged();
	}
	
	public Weather getWeather(){
		return weather;
	}
	
}
