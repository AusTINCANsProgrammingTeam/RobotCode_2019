package frc.team2158.robot.command.intake;

import edu.wpi.first.wpilibj.command.Command;
import frc.team2158.robot.Robot;

import java.util.logging.Logger;

/**
 * @author William Blount
 * @version 0.0.1
 * Stops the intake
 */
public class StopIntake extends Command {
    private static final Logger LOGGER = Logger.getLogger(StopIntake.class.getName());

    /**
     * Instantiates the command
     */
    public StopIntake() {
        requires(Robot.getIntakeSubsystem());
    }

    /**
     * Runs the command
     */
    @Override
    protected void initialize() {
        Robot.getIntakeSubsystem().stopIntake();
    }

    @Override
    protected boolean isFinished() {
        return true;
    }
}
