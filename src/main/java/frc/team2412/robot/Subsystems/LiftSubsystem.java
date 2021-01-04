package frc.team2412.robot.Subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.team2412.robot.Subsystems.constants.LiftConstants;

public class LiftSubsystem extends SubsystemBase {

	private final CANSparkMax leftMotor;
	private final CANSparkMax rightMotor;

	public LiftSubsystem(CANSparkMax leftMotor, CANSparkMax rightMotor) {
		this.leftMotor = leftMotor;
		this.rightMotor = rightMotor;
		this.rightMotor.setInverted(true);

	}

	public void extend() {
		setSpeed(LiftConstants.MAX_SPEED);
	}

	public void retract() {
		setSpeed(-LiftConstants.MAX_SPEED);
	}

	public void off() {
		setSpeed(0);
	}

	public void setSpeed(double speed) {
		leftMotor.set(speed);
		rightMotor.set(speed);
	}

}
