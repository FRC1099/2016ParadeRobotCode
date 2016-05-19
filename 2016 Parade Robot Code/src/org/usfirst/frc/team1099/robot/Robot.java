
package org.usfirst.frc.team1099.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Victor;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	Victor ldrive = new Victor(0);
	Victor rdrive = new Victor(1);
	Victor flagspin = new Victor(2);
	
	Joystick gamepad = new Joystick(1);
	
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
    	if (gamepad.getRawAxis(1) > 0.1) {
			ldrive.set(1.0);
    	}
		
		else if (gamepad.getRawAxis(1) < -0.1) {
			ldrive.set(-1.0);
		}
		else {
			ldrive.set(0.0);
		}
	
		if (gamepad.getRawAxis(2) > 0.1) {
			rdrive.set(1.0);
		}
		
		else if (gamepad.getRawAxis(2) < -0.1) {
			rdrive.set(-1.0);
		}
		else {
			rdrive.set(0.0);
		}
		
		if (gamepad.getRawButton(1)) {
			flagspin.set(0.3);
		}
			else {
				flagspin.set(0.0);
			}
        
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
