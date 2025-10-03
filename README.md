## Smart Home Automation 

Imagine you're building a smart home automation system where various devices (lights, thermostat, music player, etc.) can be controlled remotely using a central hub or app. Each device has different functionalities, but you want to create a unified and flexible control mechanism.

Design a system that allows you to control multiple smart home devices with ease. Your goal is to create a solution where:
  1. You can control a variety of devices from a central hub or app, sending commands like "Turn On," "Turn Off," "Increase Temperature," "Decrease Volume," etc.
  2. Each device has unique actions associated with these commands. For example, turning on the lights might involve changing their brightness level, while turning on the music player may involve playing a specific playlist.
  3. New devices can be seamlessly integrated into the system without modifying existing code. You want to ensure that adding a new device doesn't require changes to the central control logic.
  4. Devices can be controlled without the central hub or app needing to understand the internal workings of each device. It should send high-level commands without needing low-level details.

Your challenge is to apply a design pattern that provides a flexible and scalable way to control a variety of smart home devices, ensuring that new devices can be added without disrupting the existing system's functionality.

## UML Class Diagram

<img width="1874" height="1448" alt="Software Engineering 1" src="https://github.com/user-attachments/assets/d4800b1b-27cd-4a02-91f2-1715548c2d23" />

## Components

#### SmartHomeApplication (Client)
- The main class that creates devices, sets commands on the remote, and simulates button presses to control lights, AC, and music player.

#### RemoteControl (Invoker)
- Acts as the remote that triggers commands pressButton(). It doesn’t know device details, only executes the assigned command.

#### Command (Interface)
- Defines the execute() method. All commands implement this so they can be run by the remote.

#### TurnOnCommand (Concrete Command)
- Turns on the given device (light, AC, or music player) by calling its turnOn() method.

#### TurnOffCommand (Concrete Command)
- Turns off the given device by calling its turnOff() method.

#### VolumeUpCommand (Concrete Command)
- Increases the device’s setting (brightness for light, temperature for AC, volume for music player).

#### VolumeDownCommand (Concrete Command)
- Decreases the device’s setting (brightness, temperature, or volume).

#### Light (Receiver)
- Represents a light with brightness control. It can turn on, turn off, and adjust brightness.

#### AirConditioner (Receiver)
- Represents an air conditioner with temperature control. It can start, stop, and adjust temperature.

#### MusicPlayer (Receiver)
- Represents a music player with volume control. It can play, stop, increase, and decrease volume.

#### Package: SmartHomeAutomation
- All classes are declared in the SmartHomeAutomation package, which groups the client, invoker, commands, and receivers for the smart-home application.
