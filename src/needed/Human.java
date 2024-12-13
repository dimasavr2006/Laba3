package needed;

import enums.*;

public abstract class Human {

    private Gender gender;
    private double age;
    private String name;

    Arm rArm = new Arm(OrientationOfPart.RIGHT);
    Arm lArm = new Arm(OrientationOfPart.LEFT);
    Leg rLeg = new Leg(OrientationOfPart.RIGHT);
    Leg lLeg = new Leg(OrientationOfPart.LEFT);
    Chest chest = new Chest();
    Head head = new Head();
    Bottom bottom = new Bottom();

    public abstract void moveHero (double startXCoord, double moveOnXAxis, double startYAxis , double moveOnYAxis);

    public void setAge(double age) {
        this.age = age;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Human(Gender gender, double age, String name) {
        this.gender = gender;
        this.age = age;
        this.name = name;
    }
    public Human(){
        this.gender = Gender.ZERO;
        this.age = 0;
        this.name = "Human";
    }


    class Leg{
        boolean isIn = true;
        OrientationOfPart orientation;
        TypeOfBodyPart typeOfBodyPart = TypeOfBodyPart.LEG;
        public Leg(OrientationOfPart orientation) {
            this.orientation = orientation;
        }
    }
    class Arm{
        boolean isIn = true;
        OrientationOfPart orientation;
        TypeOfBodyPart typeOfBodyPart = TypeOfBodyPart.ARM;
        public Arm(OrientationOfPart orientation) {
            this.orientation = orientation;
            this.typeOfBodyPart = TypeOfBodyPart.ARM;
            this.isIn = true;
        }
    }
    class Head{
        boolean isIn = true;
        TypeOfBodyPart typeOfBodyPart = TypeOfBodyPart.HEAD;
        OrientationOfPart orientation = OrientationOfPart.ZERO;
        public Head(){
            this.typeOfBodyPart = TypeOfBodyPart.HEAD;
            this.isIn = true;
        }
    }
    class Chest{
        boolean isIn = true;
        TypeOfBodyPart typeOfBodyPart = TypeOfBodyPart.CHEST;
        OrientationOfPart orientation = OrientationOfPart.ZERO;
        public Chest(){
            this.typeOfBodyPart = TypeOfBodyPart.CHEST;
            this.isIn = true;
        }
    }
    class Bottom{
        boolean isIn = true;
        TypeOfBodyPart typeOfBodyPart = TypeOfBodyPart.BOTTOM;
        OrientationOfPart orientation = OrientationOfPart.ZERO;
        public Bottom(){
            this.typeOfBodyPart = TypeOfBodyPart.BOTTOM;
            this.isIn = true;
        }
    }



}
