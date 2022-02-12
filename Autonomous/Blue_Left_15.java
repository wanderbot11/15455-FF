package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous


public class Blue_Left_15 extends org.firstinspires.ftc.teamcode.Auto_Base_15 {


    @Override
    public void runOpMode() throws InterruptedException {
        this.init_classes(false);

        waitForStart();
        this.sense_barcode_blue();
        imu_drive.setZero();



        imu_drive.goToSpot(-8, 1);
        imu_drive.strafeRight(1, 19);
        arm.autoArmUp(2);
        turntable.turntable_auto(90, .5);

        arm.autoArmUp(scorePosition);

        if(scorePosition==1){
            imu_drive.strafeRight(.75,5.5);
        }else if (scorePosition==2) {
            imu_drive.strafeRight(.75,7);
        }else{
            imu_drive.strafeRight(.75, 12);
        }
        intake.autoEject();
        if(scorePosition==1){
            imu_drive.strafeLeft(.75,5.5);
        }else if (scorePosition==2) {
            imu_drive.strafeLeft(.75,7);
        }else{
            imu_drive.strafeLeft(.75, 12);
        }
        arm.autoArmUp(2);
        turntable.turntable_auto(5, .5);
        arm.autoArmDown();
        imu_drive.strafeLeft(1,22);
        intake.autoIntakeStart();
        imu_drive.goToSpot(67,1);
        intake.autoIntakeStop();



    }
}