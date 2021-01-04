package frc.team2412.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

//This is the class in charge of all the motors, motor ids, and any other sensors the robot uses. 
//remember to declare robot container at the bottom of this class 
public class RobotMap {

	// IDs
	public static int exampleID = 1;

	private static final int SHOOTER_LEFT_MOTOR_ID = 0;
	private static final int SHOOTER_RIGHT_MOTOR_ID = 1;
	public static CANSparkMax shooterLeftMotor = new CANSparkMax(SHOOTER_LEFT_MOTOR_ID, MotorType.kBrushless);
	public static CANSparkMax shooterRightMotor = new CANSparkMax(SHOOTER_RIGHT_MOTOR_ID, MotorType.kBrushless);

	// Robot container
	public static RobotContainer robotContainer = new RobotContainer();

	public static OI OI = new OI(robotContainer);

}
