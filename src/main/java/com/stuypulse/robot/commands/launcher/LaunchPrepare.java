package com.stuypulse.robot.commands.launcher;

import com.stuypulse.robot.constants.Settings;
import com.stuypulse.robot.subsystems.launcher.Launcher;

import edu.wpi.first.wpilibj2.command.InstantCommand;

/**
 * WARNING: DONT USE THIS COMMAND
 * PrepareLaunch sets the launcher to the launch speed, spins just the outside wheel of the launcher to allow it to get up to speed before launching
 */
public class LaunchPrepare extends InstantCommand {
    Launcher launcher;

    public LaunchPrepare() {
        launcher = Launcher.getInstance();
        addRequirements(launcher);
    }
    
    @Override
    public void initialize() {
        launcher.setLaunchSpeed(Settings.Launcher.LAUNCH_LAUNCHER_SPEED);
    } 
}
