package core;

import java.util.ArrayList;
import java.util.Scanner;

public class Line {
	String name;
	ArrayList<Station> stations;
	ArrayList<Tile> path;
	
	public Line(String lineName) {
		this.name = lineName;
		this.stations = new ArrayList<Station>();
		this.path = new ArrayList<Tile>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Station> getStations() {
		return stations;
	}

	public void setStations(ArrayList<Station> stations) {
		this.stations = stations;
	}

	public ArrayList<Tile> getPath() {
		return path;
	}

	public void setPath(ArrayList<Tile> path) {
		this.path = path;
	}
	
	
}
