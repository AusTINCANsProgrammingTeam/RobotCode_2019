package frc.team2158.robot.command.intake;

import edu.wpi.first.wpilibj.command.Command;
import frc.team2158.robot.Robot;
import frc.team2158.robot.subsystem.intake.IntakeSubsystem;

import java.util.logging.Logger;
/**
 * @author William Blount
 * @version 0.0.1
 * Causes the Intake to eject the cube CounterClockwise
 */
public class CounterClockwise extends Command {
    private static final Logger LOGGER = Logger.getLogger(CounterClockwise.class.getName());

    /**
     * Instantiates the command.
     */
    public CounterClockwise() {
        requires(Robot.getIntakeSubsystem());
    }

    /**
     * Runs the command.
     */
    @Override
    protected void initialize() {
        Robot.getIntakeSubsystem().runIntake(IntakeSubsystem.IntakeDirection.COUNTERCLOCKWISE);
        LOGGER.info("Intake is rotating the cube counterclockwise!");
    }

    @Override
    protected boolean isFinished() {
        return true;
    }
}
