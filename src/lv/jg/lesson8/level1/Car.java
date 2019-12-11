import java.util.Objects;

public class Car extends Vehicle {
	
	private int wheelSize;
	private boolean airBag;
	private boolean alarmSystem;
	private String parkingSensors;
	
	public Car(int mass, int year, String manufacturer, String color, String engineType) {
		this.mass = mass;
		this.year = year;
		this.manufacturer = manufacturer;
		this.color = color;
		this.engineType = engineType;
	}
	
	public void setWheelSize(int wheelSize) {
		this.wheelSize = wheelSize;
	}

	public void setAirBag(boolean airBag) {
		this.airBag = airBag;
	}

	public void setAlarmSystem(boolean alarmSystem) {
		this.alarmSystem = alarmSystem;
	}

	public void setParkingSensors(String parkingSensors) {
		this.parkingSensors = parkingSensors;
	}
	
	@Override
	public String toString() {
		return "Car{" 
				+ "mass='" + mass + "', " 
				+ "year='" + year + "', " 
				+ "manufacturer='" + manufacturer + "', " 
				+ "color='" + color + "', " 
				+ "engineType='" + engineType + "', " 
				+ "wheelSize='" + wheelSize + "', " 
				+ "airBag='" + airBag + "', " 
				+ "alarmSystem='" + alarmSystem + "', " 
				+ "parkingSensors='" + parkingSensors + "'" 
				+ '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Car car = (Car) o;
		return	Objects.equals(mass, car.mass) &&
				Objects.equals(year, car.year) &&
				Objects.equals(manufacturer, car.manufacturer) &&
				Objects.equals(color, car.color) &&
				Objects.equals(engineType, car.engineType) &&
				Objects.equals(wheelSize, car.wheelSize) &&
				Objects.equals(airBag, car.airBag) &&
				Objects.equals(alarmSystem, car.alarmSystem) &&
				Objects.equals(parkingSensors, car.parkingSensors);
	}
	
}
