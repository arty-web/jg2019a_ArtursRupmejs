import java.util.Objects;

public class Bus extends Vehicle {
	
	private int passengersSeats;
	private int totalPassangerCapacity;
	private boolean doubleDecker;
	
	public Bus(int mass, int year, String manufacturer, String color, String engineType) {
		this.mass = mass;
		this.year = year;
		this.manufacturer = manufacturer;
		this.color = color;
		this.engineType = engineType;
	}
	
	public void setPassengersSeats(int passengersSeats) {
		this.passengersSeats = passengersSeats;
	}

	public void setTotalPassangerCapacity(int totalPassangerCapacity) {
		this.totalPassangerCapacity = totalPassangerCapacity;
	}

	public void setDoubleDecker(boolean doubleDecker) {
		this.doubleDecker = doubleDecker;
	}
	
	@Override
	public String toString() {
		return "Bus{" 
				+ "mass='" + mass + "', " 
				+ "year='" + year + "', " 
				+ "manufacturer='" + manufacturer + "', " 
				+ "color='" + color + "', " 
				+ "engineType='" + engineType + "', " 
				+ "passengersSeats='" + passengersSeats + "', " 
				+ "totalPassangerCapacity='" + totalPassangerCapacity + "', " 
				+ "doubleDecker='" + doubleDecker + "'" 
				+ '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Bus bus = (Bus) o;
		return	Objects.equals(mass, bus.mass) &&
				Objects.equals(year, bus.year) &&
				Objects.equals(manufacturer, bus.manufacturer) &&
				Objects.equals(color, bus.color) &&
				Objects.equals(engineType, bus.engineType) &&
				Objects.equals(passengersSeats, bus.passengersSeats) &&
				Objects.equals(totalPassangerCapacity, bus.totalPassangerCapacity) &&
				Objects.equals(doubleDecker, bus.doubleDecker);
	}
	
}
