// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.PaddedXbox;
import frc.robot.subsystems.ShooterSub;
import static frc.robot.Constants.SHOOTER_POWER;

public class RunShooter extends CommandBase {

  private ShooterSub shooter;
  private PaddedXbox xbox;
  /** Creates a new RunShooter. */
  public RunShooter(ShooterSub shooter, PaddedXbox xbox) {
    this.shooter = shooter;
    this.xbox = xbox;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(this.shooter);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (this.xbox.getAButton())
      this.shooter.setPower(SHOOTER_POWER);
    else
      this.shooter.setPower(0);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    this.shooter.setPower(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
