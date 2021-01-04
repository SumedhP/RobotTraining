package frc.team2412.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.team2412.robot.Subsystems.LiftSubsystem;

public class LiftDownCommand extends CommandBase {

	private LiftSubsystem liftsubsystem;

	public LiftDownCommand(LiftSubsystem liftSubsystem) {
		this.liftsubsystem = liftSubsystem;
	}

	public void execute() {
		liftsubsystem.retract();
	}

	public boolean isFinished() {
		return true;
	}

}
