package main;

import org.json.JSONObject;

public class Wind {
	JSONObject wind = Main.getJSONObj().getJSONObject("wind");

	int winSpeed = (int) wind.getLong("speed");
	int degree = (int) wind.getLong("deg");

	boolean north = (degree >= 315 && degree <= 360) || (degree >= 0 && degree <= 44);
	boolean east = (degree >= 45 && degree <= 134);
	boolean south = (degree >= 135 && degree <= 224);
	boolean west = (degree >= 225 && degree <= 314);

	public StringBuilder getWindSpeed() {
		StringBuilder winds = new StringBuilder();
		winds.append("Wind Speed: ");
		winds.append(winSpeed);
		winds.append("m/s");
		return winds;
	}

	public StringBuilder getDegree() {
		StringBuilder deg = new StringBuilder();
		deg.append("Wind Direction: ");

		if (north)
			deg.append("NORTH");
		if (east)
			deg.append("EAST");
		if (south)
			deg.append("SOUTH");
		if (west)
			deg.append("WEST");
		return deg;
	}

}
