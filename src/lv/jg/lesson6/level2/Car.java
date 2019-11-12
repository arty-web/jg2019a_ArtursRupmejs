package lv.jg.lesson6.level2;

import static java.lang.System.out;

public class Car {

    private String model, color;
    private int maxSpeed;
    private int currentSpeed = 0;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    //metodei accelaret ir jāsatur loģika tikai attiecībā uz to uzdevumu, kuru tā pilda
    //maksimums teksta izvadi par stāvokla maiņu
    //aprakstiemir jābūt ārus šīs klases
    public void accelerate(int targetSpeed) {
        out.println("The driver wants to accelerate to " + targetSpeed + " km/h. He pushes the gas pedal...");
        if (canAccelerate() == true) { //if (canAccelerate()) {
            if (currentSpeed < 0) {
                out.print("...(after switching the gear to 'D') and starts driving forward again! ");
            }
            out.print("Speed: " + currentSpeed);
            do {
                currentSpeed++;
                out.print(">" + currentSpeed);
            } while (currentSpeed < targetSpeed);
        } else {
            out.print("Speed: doesn't change because the car has already reached its max speed of " + currentSpeed
                    + " km/h.");
        }
        out.println("\n");
    }

    //skatīt ieprikšējos komentārus
    public void slowDown(int targetSpeed) {
        out.println("The driver wants to slow down to " + targetSpeed + " km/h. He pushes the brake pedal...");
        if (isDriving() == true) {
            if (targetSpeed < 0) {
                out.print("...switches the gear to 'R' and starts backing up! ");
            }
            out.print("Speed: " + currentSpeed);
            do {
                currentSpeed--;
                out.print(">" + currentSpeed);
            } while (currentSpeed > targetSpeed);
        } else {
            out.print("Speed: doesn't change, obviously. Is the driver drunk...?");
        }
        out.println("\n");
    }

    //skatīt ieprikšējos komentārus
    public void speedUp() {
        out.println("The driver wants to test the limits of the car. He puts the pedal to the metal...");
        if (canAccelerate() == true) {
            out.print("Speed: " + currentSpeed);
            do {
                currentSpeed++;
                out.print(">" + currentSpeed);
            } while (currentSpeed < maxSpeed);
            out.print(" ...and that's it - the car isn't able to go any faster!");
        } else {
            out.print("Speed: doesn't change because the car has already reached its max speed of " + currentSpeed
                    + " km/h.");
        }
        out.println("\n");
    }

    public boolean isDriving() {
//        return currentSpeed == 0  //šādi būs īsāk
        if (currentSpeed == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean canAccelerate() {
//        return currentSpeed <= maxSpeed  //šādi būs īsāk
        if (currentSpeed == maxSpeed) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "A troubled driver sits down in his " + color + " " + model + ", wondering if he can surpass the "
                + maxSpeed + " km/h speed limit installed by his parole officer.\n\n";
    }

}