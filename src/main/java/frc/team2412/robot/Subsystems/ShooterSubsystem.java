package frc.team2412.robot.Subsystems;

import static frc.team2412.robot.Subsystems.constants.ShooterConstants.SHOOTER_OFF_SPEED;
import static frc.team2412.robot.Subsystems.constants.ShooterConstants.SHOOTER_ON_SPEED;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase {

	private final CANSparkMax rightMotor;
	private final CANSparkMax leftMotor;

	public ShooterSubsystem(CANSparkMax rightMotor, CANSparkMax leftMotor) {
		this.rightMotor = rightMotor;
		this.leftMotor = leftMotor;
		this.leftMotor.setInverted(true);

	}

	public void bothMotorsForward() {
		setSpeed(SHOOTER_ON_SPEED);
	}

	public void bothMotorsStop() {
		setSpeed(SHOOTER_OFF_SPEED);
	}

	public void setSpeed(double speed) {
		rightMotor.set(speed);
		leftMotor.set(speed);
	}

}
