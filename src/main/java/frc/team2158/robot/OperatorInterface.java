package frc.team2158.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * @version 0.0.1
 * @author William Blount
 * Manages and Initializes buttons used in the controller.
 */
public class OperatorInterface {
    private static final Logger LOGGER = Logger.getLogger(OperatorInterface.class.getName());
    public enum ButtonMode {WHEN_PRESSED, CANCEL_WHEN_PRESSED, TOGGLE_WHEN_PRESSED, WHEN_RELEASED, WHILE_HELD}

    private Joystick joystick;
    private Map<String, Button> buttonMap;
    /**
     * Initializes the joystick and button map.
     *
     */
    public OperatorInterface() {
        // Initialize the joystick and button map.
        //Stretch Goal: Custom maps for different controllers?
        this.joystick = new Joystick(RobotMap.JOYSTICK_PORT);
        this.buttonMap = new HashMap<String, Button>() {{
            put("buttonX", new JoystickButton(joystick, 1));
            put("buttonA", new JoystickButton(joystick, 2));
            put("buttonB", new JoystickButton(joystick, 3));
            put("buttonY", new JoystickButton(joystick, 4));
            put("buttonLB", new JoystickButton(joystick, 5));
            put("buttonRB", new JoystickButton(joystick, 6));
            put("buttonLT", new JoystickButton(joystick, 7));
            put("buttonRT", new JoystickButton(joystick, 8));
            put("buttonBack", new JoystickButton(joystick, 9));
            put("buttonStart", new JoystickButton(joystick, 10));
            put("buttonLeftJoystick", new JoystickButton(joystick, 11));
            put("buttonRightJoystick", new JoystickButton(joystick, 12));
        }};
    }

    /**
     * Easy way for us to bind buttons to a command.
     * @param button String representing a button that was registered by the Operator Interface
     * @param mode What state the button should be for command execution.
     * @param command What the button will trigger when the ButtonMode is triggered
     */
    public void bindButton(String button, ButtonMode mode, Command command) {
        switch(mode) {
            case WHEN_PRESSED:
                buttonMap.get(button).whenPressed(command);
                break;
            case CANCEL_WHEN_PRESSED:
                buttonMap.get(button).cancelWhenPressed(command);
                break;
            case TOGGLE_WHEN_PRESSED:
                buttonMap.get(button).toggleWhenPressed(command);
                break;
            case WHEN_RELEASED:
                buttonMap.get(button).whenReleased(command);
                break;
            case WHILE_HELD:
                buttonMap.get(button).whileHeld(command);
                break;
        }
    }

    /**
     * Returns the instance of the Joystick.
     * @return the instance of the Joystick.
     */
    public Joystick getJoystick() {
        return joystick;
    }

    /**
     * Returns the instance of the button named
     * @param name Name of the button
     * @return the instance of the button named
     */
    public Button getButtonByName(String name) {
        return buttonMap.get(name);
    }
}
