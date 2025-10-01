/*Smart Home Devices (Abstract Class + Multiple Interfaces)

Create an abstract class Device with:

Abstract method turnOn() and turnOff()

A concrete method status()


Create two interfaces:

Connectable with method connectWifi()

VoiceControl with method acceptVoiceCommand(String command)


Implement a SmartLight and SmartSpeaker class that use both abstract class and interfaces.
👉 Demonstrate polymorphism and multiple interface implementation.*/

package Abstraction;

abstract class Device{
	abstract void turnOn();
	abstract void turnOff();
	void status() {
		System.out.println("Device Status Checked.");
	}
}


interface Connectable{
	void connectWifi();
}
interface VoiceControl{
	void acceptVoiceCommand();
}


class SmartLight extends Device implements Connectable,VoiceControl{
	@Override
	public void connectWifi() {
		System.out.println("SmartLight connected to Wifi.");
	}
	@Override
	public void acceptVoiceCommand() {
		System.out.println("SmartLight accept Voice Command.");
	}
	@Override
	void turnOn() {
		System.out.println("SmartLight On.");
	}
	@Override
	void turnOff() {
		System.out.println("SmartLight Off.");
	}
}
class SmartSpeaker extends Device implements Connectable,VoiceControl{
	@Override
	public void connectWifi() {
		System.out.println("SmartSpeaker connected to Wifi.");
	}
	@Override
	public void acceptVoiceCommand() {
		System.out.println("SmartSpeaker accept Voice Command.");
	}
	@Override
	void turnOn() {
		System.out.println("smartSpeaker On.");
	}
	@Override
	void turnOff() {
		System.out.println("SmartSpeaker Off.");
	}
}
public class AbstractionSmartHomeDevice {
public static void main(String[] args) {
	SmartLight light = new SmartLight();
	SmartSpeaker speaker = new SmartSpeaker();
	
	light.status();
	light.connectWifi();
    light.acceptVoiceCommand();
	light.turnOn();
	light.turnOff();
	speaker.status();
	speaker.connectWifi();
    speaker.acceptVoiceCommand();
	speaker.turnOn();
	speaker.turnOff();
}
}
