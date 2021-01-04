package frc.team2412.robot;

import static frc.team2412.robot.RobotMap.shooterLeftMotor;
import static frc.team2412.robot.RobotMap.shooterRightMotor;

import frc.team2412.robot.Subsystems.ExampleSubsystem;
import frc.team2412.robot.Subsystems.LiftSubsystem;
import frc.team2412.robot.Subsystems.ShooterSubsystem;

// this is the class for containing all the subsystems and OI of the robot
public class RobotContainer {

	// Subsystems
	public ExampleSubsystem m_ExampleSubsystem;

	public ShooterSubsystem shooterSubsystem;

	public LiftSubsystem liftSubsystem;

	public RobotContainer() {
		// create and instance of example subsystem with the id from robot map
		m_ExampleSubsystem = new ExampleSubsystem(RobotMap.exampleID);

		shooterSubsystem = new ShooterSubsystem(shooterRightMotor, shooterLeftMotor);

	}
}
