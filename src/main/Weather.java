package main;

import org.json.JSONObject;

public class Weather {

	private JSONObject main = Main.getJSONObj().getJSONObject("main");
	private int cels = (int) main.getLong("temp");
	private int hum = main.getInt("humidity");

	public StringBuilder getTemp() {
		StringBuilder temp = new StringBuilder();
		temp.append("Temperature in ");
		temp.append(Main.getJSONObj().get("name"));
		temp.append(" is: ");
		temp.append(cels);
		temp.append("c");
		return temp;
	}

	public StringBuilder getHumidity() {
		StringBuilder humidity = new StringBuilder();
		humidity.append("Humidity: ");
		humidity.append(hum);
		humidity.append("%");
		return humidity;
	}

}
