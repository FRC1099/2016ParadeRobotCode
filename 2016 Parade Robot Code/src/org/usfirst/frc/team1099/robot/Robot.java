
package org.usfirst.frc.team1099.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	Talon ldrive = new Talon(0);
	Talon rdrive = new Talon(1);
	Talon flagspin = new Talon(2);
	
	Relay horn = new Relay(3);
	
	Joystick gamepad = new Joystick(0);
	
    public void robotInit() {
    }
    public void autonomousInit() {
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	//Drive Code
    	if (Math.abs(gamepad.getRawAxis(1)) > 0.1) {
			ldrive.set(-gamepad.getRawAxis(1));
    	} else {
			ldrive.set(0.0);
		}
    	
    	if (Math.abs(gamepad.getRawAxis(5)) > 0.1) {
			rdrive.set(gamepad.getRawAxis(5));
    	} else {
			rdrive.set(0.0);
		}
		
		//Flag Spin Code
		if (gamepad.getRawButton(1)) {
			flagspin.set(0.3);
		}
		else {
			flagspin.set(0.0);
		}
		
		//Horn Code
		if (gamepad.getRawButton(2)) {
			horn.set(Relay.Value.kForward);
		}
		else {
			horn.set(Relay.Value.kOff);
		}
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    }
}
