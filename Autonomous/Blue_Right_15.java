package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous


public class Blue_Right_15 extends org.firstinspires.ftc.teamcode.Auto_Base_15 {

    @Override
    public void runOpMode() throws InterruptedException {
        this.init_classes(false);


        waitForStart();
        this.sense_barcode_blue();
        imu_drive.setZero();


        imu_drive.strafeRight(1, 6);
        imu_drive.goToSpot(-11.5, 1);
        imu_drive.strafeLeft(1,1);
        auto_carousel.run_carousel_auto(telemetry, false);
        imu_drive.strafeRight(.75, 9);
        auto_motors.goToSpot(48,1);
//        imu_drive.strafeRight(1,8);
        arm.autoArmUp(2);
        turntable.turntable_auto(80,1);
        arm.autoArmUp(scorePosition);
        imu_drive.strafeRight(1,4);
        imu_drive.strafeRight(1,9.5);

        if (scorePosition==2) imu_drive.strafeRight(1,2);
        if (scorePosition==3) imu_drive.strafeRight(1,6.5);
        intake.autoEject();
        imu_drive.strafeLeft(1,7);
        if (scorePosition==2) imu_drive.strafeLeft(1,2);
        if (scorePosition==3) imu_drive.strafeLeft(1,6.5);
        arm.autoArmUp(2);
        turntable.turntable_auto(6,1);
        arm.autoArmDown();
        imu_drive.strafeLeft(1,4);
        auto_motors.goToSpot(-52,-1);
        imu_drive.strafeRight(1,18);


        telemetry.update();
    }
}

