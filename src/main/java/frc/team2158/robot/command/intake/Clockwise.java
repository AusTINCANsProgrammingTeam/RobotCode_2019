package frc.team2158.robot.command.intake;

import edu.wpi.first.wpilibj.command.Command;
import frc.team2158.robot.Robot;
import frc.team2158.robot.subsystem.intake.IntakeSubsystem;

import java.util.logging.Logger;
/**
 * @author William Blount
 * @version 0.0.1
 * This command causes the Intake to eject the cube Clockwise
 */
public class Clockwise extends Command {
    private static final Logger LOGGER = Logger.getLogger(Clockwise.class.getName());

    /**
     * Instantiates the command.
     */
    public Clockwise() {
        requires(Robot.getIntakeSubsystem());
    }

    /**
     * Runs the command.
     */
    @Override
    protected void initialize() {
        Robot.getIntakeSubsystem().runIntake(IntakeSubsystem.IntakeDirection.CLOCKWISE);
        LOGGER.info("Intake is rotating the cube clockwise!");
    }

    @Override
    protected boolean isFinished() {
        return true;
    }
}
