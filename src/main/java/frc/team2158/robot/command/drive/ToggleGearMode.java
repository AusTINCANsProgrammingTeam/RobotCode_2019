package frc.team2158.robot.command.drive;

import edu.wpi.first.wpilibj.command.Command;
import frc.team2158.robot.Robot;

import java.util.logging.Logger;
/**
 * @author William Blount
 * @version 0.0.1
 * Switches the gear mode of the robot
 */
public class ToggleGearMode extends Command {
    private static final Logger LOGGER = Logger.getLogger(ToggleGearMode.class.getName());

    /**
     * Runs the command
     */
    @Override
    protected void initialize() {
        Robot.getDriveSubsystem().toggleGearMode();
        LOGGER.info(String.format("GearMode has been toggled to %s!", Robot.getDriveSubsystem().getGearMode()));
    }

    @Override
    protected boolean isFinished() { return true; }
}
