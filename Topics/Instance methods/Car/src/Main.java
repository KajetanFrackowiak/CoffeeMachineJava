class Car {

    int yearModel;
    String make;
    int speed;

    public void accelerate() {
        speed += 5;
    }

    public void brake() {
        if (speed > 4) {
            speed -= 5;
        } else {
            speed = 0;
        }
    }

//    public int getYearModel() {
//        return yearModel;
//    }
//
//    public String getMake() {
//        return make;
//    }

}