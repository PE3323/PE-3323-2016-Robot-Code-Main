package org.usfirst.frc.team3323.robot.commands;

import org.usfirst.frc.team3323.robot.subsystems.Arm;

public class ArmOff extends CommandBase {
    
	private Arm arm;

	public ArmOff( Arm arm) {
    	this.arm = arm;
        requires(arm);
    }

    protected void initialize() {
    }

    protected void execute() {
        arm.stop();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}