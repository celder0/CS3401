import java.util.*;

public abstract class Vehicle {
	String color;
	Double speed;
	String nickname;
	
	Vehicle(String c, Double s, String n)
	{
		color = c;
		speed = s;
		nickname = n;
	}
	
	public abstract double getNumberOfWheels();	
}

class VehicleComparator_Speed implements Comparator<Vehicle>
{
	public int compare(Vehicle vh1, Vehicle vh2)
	{
		Vehicle v1 = (Vehicle)vh1;
		Vehicle v2 = (Vehicle)vh2;
		int ret = 1;
		
		if(v1.speed == v2.speed) ret = -1;
		if(v1.speed < v2.speed) ret = -1;
		
		return ret;
	}
}

class VehicleComparator_Color implements Comparator<Vehicle>
{
	public int compare(Vehicle vh1, Vehicle vh2)
	{
		Vehicle v1 = (Vehicle)vh1;
		Vehicle v2 = (Vehicle)vh2;
		int ret = 1;
		
		if(v1.color.length() == v2.color.length()) ret = -1;
		if(v1.color.length() < v2.color.length()) ret = -1;
		
		return ret;
	}
}

class VehicleComparator_Wheels implements Comparator<Vehicle>
{
	public int compare(Vehicle vh1, Vehicle vh2)
	{
		Vehicle v1 = (Vehicle)vh1;
		Vehicle v2 = (Vehicle)vh2;
		int ret = 1;
		
		if(v1.getNumberOfWheels() == v2.getNumberOfWheels()) ret = 1;
		if(v1.getNumberOfWheels() < v2.getNumberOfWheels()) ret = -1;
		
		return ret;
	}
}