package frc.team2158.robot.command.lift;

import edu.wpi.first.wpilibj.command.Command;
import frc.team2158.robot.Robot;

import java.util.logging.Logger;
/**
 * @author William Blount
 * @version 0.0.1
 * Runs the command in order to stop the lift
 */
public class StopLift extends Command {
    private static final Logger LOGGER = Logger.getLogger(StopLift.class.getName());

    /**
     * Instantiates the command.
     */
    public StopLift() {
        requires(Robot.getLiftSubsystem());
    }
    /**
     * Runs the command.
     */
    @Override
    protected void initialize() {
        Robot.getLiftSubsystem().stopLift();
    }

    @Override
    protected boolean isFinished() {
        return true;
    }
}
