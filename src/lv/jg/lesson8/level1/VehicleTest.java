// nekompilējas

public class VehicleTest {
	
	public static void main(String[] args) {
		
		Car myCar = new Car(1500, 2017, "Tesla", "black", "electric");
		myCar.setWheelSize(18);
		myCar.setAirBag(true);
		myCar.setAlarmSystem(true);
		myCar.setParkingSensors("rear");
		System.out.println(myCar);
		
		Lorry myLorry = new Lorry(4750, 2010, "Volvo", "gray", "diesel");
		myLorry.setWheelCount(6);
		myLorry.setSizeType("medium");
		myLorry.setMaxCargoMass(1000);
		myLorry.setBodyType("box truck");
		System.out.println(myLorry);
		
		Bus myBus = new Bus(2800, 1999, "Mercedes", "yellow", "petrol");
		myBus.setTotalPassangerCapacity(115);
		myBus.setPassengersSeats(40);
		myBus.setDoubleDecker(false);
		System.out.println(myBus);
		
	}

}
