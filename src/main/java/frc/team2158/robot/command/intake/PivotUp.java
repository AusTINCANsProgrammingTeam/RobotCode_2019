package frc.team2158.robot.command.intake;

import edu.wpi.first.wpilibj.command.Command;
import frc.team2158.robot.Robot;
import frc.team2158.robot.subsystem.intake.IntakeSubsystem;

import java.util.logging.Logger;

public class PivotUp extends Command{
    private static final Logger LOGGER = Logger.getLogger(PivotUp.class.getName());

    /**
     * Instantiates the command
     */
    public PivotUp() {
        requires(Robot.getIntakeSubsystem());
    }

    /**
     * Runs the command
     */
    @Override
    protected void initialize() {
        Robot.getIntakeSubsystem().pivotIntake(IntakeSubsystem.PivotDirection.UP);
        LOGGER.info("Intake is pivoting up!");
    }

    @Override
    protected boolean isFinished() {
        return true;
    }

}
