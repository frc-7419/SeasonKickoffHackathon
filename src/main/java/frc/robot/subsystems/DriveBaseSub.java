// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.Talon;
import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSub extends SubsystemBase {
  private TalonFX t1;
  private TalonFX t2;
  private TalonFX t3;
  private TalonFX t4;
  /** Creates a new ExampleSubsystem. */
  public DriveBaseSub() {
    this.t1 = new TalonFX(Constants.t1.CanID);
    this.t2 = new TalonFX(Constants.t2.CanID);
    this.t3 = new TalonFX(Constants.t3.CanID);
    this.t4 = new TalonFX(Constants.t4.CanID);
  }

  public TalonFX getLeftMast() {
    return t1;
  }
  public TalonFX getRightMast() {
    return t2;
  }
  public TalonFX getLeftFollow() {
    return t3;
  }
  public TalonFX getRightFollow() {
    return t4;
  }

  public void setPower(double power) {
    t1.set(ControlMode.PercentOutput, power);
    t2.set(ControlMode.PercentOutput, power);
    t3.set(ControlMode.PercentOutput, power);
    t4.set(ControlMode.PercentOutput, power);
  }

  public void setRightPower(double power) {
    t2.set(ControlMode.PercentOutput, power);
    t4.set(ControlMode.PercentOutput, power);
  }

  public void setLeftPower(double power) {
    t1.set(ControlMode.PercentOutput, power);
    t3.set(ControlMode.PercentOutput, power);
  }

  public void brake() {
    t1.setNeutralMode(NeutralMode.Brake);
    t2.setNeutralMode(NeutralMode.Brake);
    t3.setNeutralMode(NeutralMode.Brake);
    t4.setNeutralMode(NeutralMode.Brake);
  }

  public void coast() {
    t1.setNeutralMode(NeutralMode.Coast);
    t2.setNeutralMode(NeutralMode.Coast);
    t3.setNeutralMode(NeutralMode.Coast);
    t4.setNeutralMode(NeutralMode.Coast);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
