public class Vehicle {

    static double speed;

    public void setSpeed(double VSpeed) {
        speed = VSpeed;
    }

    public static double getSpeed(){
        return speed;
    }

    public void go(){
        System.out.println("Vehicle is moving at the speed of " + Vehicle.getSpeed());
    }

    public void stop(){
        System.out.println("Vehicle is stopped");
    }
}
