package frc.team2158.robot.command.drive;

import edu.wpi.first.wpilibj.command.Command;
import frc.team2158.robot.Robot;
import frc.team2158.robot.subsystem.drive.GearMode;

import java.util.logging.Logger;

/**
 * @author William Blount
 * @version 0.0.1
 * Changes the Gear mode either to LOW or HIGH
 */
public class SetGearMode extends Command {
    private static final Logger LOGGER = Logger.getLogger(SetGearMode.class.getName());

    private GearMode gearMode;
    
    public SetGearMode(GearMode gearMode) {
        this.gearMode = gearMode;
    }

    /**
     * Runs the command
     */
    @Override
    protected void initialize() {
        Robot.getDriveSubsystem().setGearMode(gearMode);
        LOGGER.info(String.format("Set the gear mode to %s.", gearMode));
    }

    @Override
    protected boolean isFinished() {
        return true;
    }
}
