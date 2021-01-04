package frc.team2412.robot.subsystems;

import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.revrobotics.CANSparkMax;
import com.robototes.helpers.MockHardwareExtension;
import com.robototes.helpers.TestBase;
import com.robototes.helpers.TestWithScheduler;

import frc.team2412.robot.Commands.LiftDownCommand;
import frc.team2412.robot.Subsystems.LiftSubsystem;
import frc.team2412.robot.Subsystems.constants.LiftConstants;

public class LifSubsystemtTest extends TestBase {

	// Mock instance of Example Subsystem
		LiftSubsystem realLiftSubsystem;
		CANSparkMax leftMotor;
		CANSparkMax rightMotor;
		
		
		// This method is run before the tests begin. initialize all mocks you wish to
		// use in multiple functions here. Copy and paste this function in your own test
		@Before
		public void before() {
			TestWithScheduler.schedulerStart();
			TestWithScheduler.schedulerClear();
			MockHardwareExtension.beforeAll();

			leftMotor = mock(CANSparkMax.class);
			rightMotor = mock(CANSparkMax.class);

			realLiftSubsystem = new LiftSubsystem(leftMotor, leftMotor);
		}
	
		@Ignore
		@Test
		public void liftDownTest() {
			test(new LiftDownCommand(realLiftSubsystem), leftMotor, -LiftConstants.MAX_SPEED);
		}
}
