package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Connect {
	public static String start() {

		String key = "3b533332460a1f75c7b0cedb5ed99517";
		try {
			URL url = new URL(
			"http://api.openweathermap.org/data/2.5/weather?q=Belgrade&units=metric&APPID=" + key);

			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

			return br.readLine();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("I/O Error: " + e.getMessage());
			System.exit(1);
		}
		throw new RuntimeException("Method failed");
	}

}
