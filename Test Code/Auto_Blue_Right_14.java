package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

//Runs carousel program and parks

@Autonomous

@Disabled
public class Auto_Blue_Right_14 extends org.firstinspires.ftc.teamcode.Auto_Base_14 {

    @Override
    public void runOpMode() throws InterruptedException {

        this.init_classes(true);

        waitForStart();

        // this.sense_barcode(); stuff


        auto_motors.strafeRight(.8, 6);
        auto_motors.goToSpot((int) (inchToTicks * -25), .75);

        auto_carousel.run_carousel_auto(telemetry,false);

        auto_motors.strafeRight(.75, 20);



        auto_motors.goToSpot((int) (inchToTicks * -9), .75);

        Thread.sleep(10000);
    }
}