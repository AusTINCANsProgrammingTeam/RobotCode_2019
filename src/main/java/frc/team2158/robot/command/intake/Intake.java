package frc.team2158.robot.command.intake;

import edu.wpi.first.wpilibj.command.Command;
import frc.team2158.robot.Robot;
import frc.team2158.robot.subsystem.intake.IntakeSubsystem;

import java.util.logging.Logger;

/**
 * @author William Blount
 * @version 0.0.1
 * Runs the intake into the slot.
 */
public class Intake extends Command {
    private static final Logger LOGGER = Logger.getLogger(Intake.class.getName());

    /**
     * Instantiates the command.
     */
    public Intake() {
        requires(Robot.getIntakeSubsystem());
        LOGGER.info("Intake Command Initialized.");
    }

    /**
     * Runs the command.
     */
    @Override
    protected void initialize() {
        Robot.getIntakeSubsystem().runIntake(IntakeSubsystem.IntakeDirection.IN);
    }

    @Override
    protected boolean isFinished() {
        return true;
    }
}
