/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc151.DeepSpace2019.subsystems;

import org.usfirst.frc151.DeepSpace2019.Robot;
import edu.wpi.cscore.*;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class UsbCameraSubsystem extends Subsystem {

  @Override
  public void initDefaultCommand() {
  }

  public void switchCamera(UsbCamera cameraToSwitch) {
    Robot.cameraSwitchServer.setSource(cameraToSwitch);
  }
}
