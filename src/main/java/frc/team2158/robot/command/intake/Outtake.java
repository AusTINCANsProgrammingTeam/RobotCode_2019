package frc.team2158.robot.command.intake;

import edu.wpi.first.wpilibj.command.Command;
import frc.team2158.robot.Robot;
import frc.team2158.robot.subsystem.intake.IntakeSubsystem;

import java.util.logging.Logger;

/**
 * @author William Blount
 * @version 0.0.1
 * Runs the intake wheels to eject the cube.
 */
public class Outtake extends Command {
    private static final Logger LOGGER = Logger.getLogger(Outtake.class.getName());

    /**
     * Instantiates the command
     */
    public Outtake() {
        requires(Robot.getIntakeSubsystem());
    }

    /**
     * Runs the command
     */
    @Override
    protected void initialize() {
        Robot.getIntakeSubsystem().runIntake(IntakeSubsystem.IntakeDirection.OUT);
        LOGGER.info("Outtake is initializing!");

    }

    @Override
    protected boolean isFinished() {
        return true;
    }
}
