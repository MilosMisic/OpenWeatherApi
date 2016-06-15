package main;

import org.json.JSONObject;

public class Main {
	public static JSONObject getJSONObj() {
		return new JSONObject(Connect.start());
	}

	public static void main(String[] args) {
		Weather w = new Weather();
		Wind wind = new Wind();

		StringBuilder output = new StringBuilder();
		output.append(w.getTemp());
		output.append("\n");
		output.append(w.getHumidity());
		output.append("\n");
		output.append(wind.getWindSpeed());
		output.append("\n");
		output.append(wind.getDegree());
	
		System.out.println(output);

	}

}
