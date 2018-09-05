package frc.team2158.robot.command.intake;

import edu.wpi.first.wpilibj.command.Command;
import frc.team2158.robot.Robot;
import frc.team2158.robot.subsystem.intake.IntakeSubsystem;

import java.util.logging.Logger;

public class PivotDown extends Command {
    private static final Logger LOGGER = Logger.getLogger(PivotUp.class.getName());

    /**
     * Instantiates the command
     */
    public PivotDown() {
        requires(Robot.getIntakeSubsystem());
    }

    /**
     * Runs the command
     */
    @Override
    protected void initialize() {
        Robot.getIntakeSubsystem().pivotIntake(IntakeSubsystem.PivotDirection.DOWN);
        LOGGER.info("Intake is pivoting down!");
    }

    @Override
    protected boolean isFinished() {
        return true;
    }
}
