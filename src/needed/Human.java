package needed;

import environment.heroes.*;
import environment.orchestra.*;
import enums.*;
import exceptions.*;
import needed.utils.*;

import java.util.ArrayList;
import java.util.Random;

public abstract class Human {

    private Gender gender;
    private final double age;
    private String name;
    private double earHP = 100;
    private double height = 180;

    private double xCoord;
    private double yCoord;

    public Arm rArm;
    public Arm lArm;
    public Leg rLeg;
    public Leg lLeg;
    public Chest chest;
    public Head head;
    public Bottom bottom;

    final Random random = new Random();
    final Utils utils = new Utils();

    public abstract void moveHero (double moveOnXAxis, double moveOnYAxis);

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setEarHP(double earHP) {
        this.earHP = earHP;
    }

    public double getEarHP() {
        return earHP;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public double getXCoord() {
        return xCoord;
    }

    public double getYCoord() {
        return yCoord;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getAge() {
        return age;
    }

    public Human(Gender gender, double age, String name) {
        this.gender = gender;
        this.age = age;
        this.name = name;
    }
    public Human(){
        this.gender = Gender.MALE;
        this.age = 0;
        this.name = "Human";
        this.earHP = 100;

        this.rArm = new Arm(OrientationOfPart.RIGHT);
        this.lArm = new Arm(OrientationOfPart.LEFT);
        this.rLeg = new Leg(OrientationOfPart.RIGHT);
        this.lLeg = new Leg(OrientationOfPart.LEFT);
        this.chest = new Chest();
        this.head = new Head();
        this.bottom = new Bottom();

    }

    public void turnBody(Human human, double degrees) {

        human.bottom.turnAngleOfBody += degrees;

        int turner = (int) (Math.abs(human.bottom.turnAngleOfBody) / 360);

        double setter = 0;

        for (int i = 0; i < turner; i++) {
            if (human.bottom.turnAngleOfBody < 0) {
                human.bottom.turnAngleOfBody += 360;
                setter = human.bottom.turnAngleOfBody;

            } else if (human.bottom.turnAngleOfBody >= 360) {
                human.bottom.turnAngleOfBody -= 360;
                setter = human.bottom.turnAngleOfBody;
            }
        }

        human.bottom.setTurnAngleOfBody(setter);

    }

    public void slantBody(Human human, double degrees){

        double startDegree = human.bottom.getSlantAngleOfBody() + degrees;

        int turner = (int) (Math.abs(startDegree) / 360);

        for (int i = 0; i < turner; i++) {
            if (startDegree < 0){
                startDegree += 360;
            }
            else if (startDegree >= 360) {
                startDegree -= 360;
            }
        }
        human.bottom.setSlantAngleOfBody(startDegree);

    }
    public void moveFullArmForDegree(Human human,OrientationOfPart armOrientation, double degrees) throws WrongArmPositionException {

        if (human.lArm.getAngleOnBody() > 180 || human.lArm.getAngleOnBody() < 0 || human.rArm.getAngleOnBody() > 180 || human.rArm.getAngleOnBody() < 0) {

            throw new WrongArmPositionException("Рука стоит неестественно");

        }
        double startDegreeR = human.rArm.getAngleOnBody();
        double startDegreeL = human.rArm.getAngleOnBody();

        if (armOrientation == OrientationOfPart.RIGHT) {
            human.rArm.setAngleOnBody(startDegreeR + degrees);
        }
        else if (armOrientation == OrientationOfPart.LEFT) {
            human.lArm.setAngleOnBody(startDegreeL + degrees);
        }

        if (human.lArm.getAngleOnBody() > 180 || human.lArm.getAngleOnBody() < 0 || human.rArm.getAngleOnBody() > 180 || human.rArm.getAngleOnBody() < 0) {

            throw new WrongArmPositionException("Рука стоит неестественно");

        }

    }

    public void speak(double volume, String speakingText) throws BecomeDeafException {

        if (volume > 100){

            for (int i = 0; i < Margarita.visionListHuman.size(); i++) {

                Margarita.visionListHuman.get(i).setEarHP(getEarHP()-(volume * 0.3) * random.nextDouble(0.1, 0.3));
                utils.earHPChecker(Margarita.visionListHuman.get(i));

            }

        }
        System.out.println(speakingText);

    }

    public void changeSmileCondition(Human human){

        human.head.setSmiling(!human.head.getSmiling());

    }

    public void handOnArmSlanter (Human human, OrientationOfPart orientation, double degrees){

        int turner = 0;
        double start;
        double middle = 0;

        if (orientation == OrientationOfPart.RIGHT) {
            start = human.rArm.getHandAngleOnArm();
            middle = start + degrees;
            turner = (int) (Math.abs(middle) / 360);
        }
        else if (orientation == OrientationOfPart.LEFT) {
            start = human.lArm.getHandAngleOnArm();
            middle = start + degrees;
            turner = (int) (Math.abs(middle) / 360);
        }

        for (int i = 0; i < turner; i++){
            if (middle < 0){
                middle += 360;
            }
            else if (middle >= 360){
                middle -= 360;
            }
        }

        if (orientation == OrientationOfPart.RIGHT) {
            human.rArm.setHandAngleOnArm(middle);
            for (Object object : human.rArm.inHand) {
                if (object instanceof Conductor.Stick){
                    ((Conductor.Stick) object).setAngle(middle);
                }
            }
        }
        else if (orientation == OrientationOfPart.LEFT) {
            human.lArm.setHandAngleOnArm(middle);
            for (Object object : human.lArm.inHand) {
                if (object instanceof Conductor.Stick){
                    ((Conductor.Stick) object).setAngle(middle);
                }
            }
        }



    }

    public void turningHead(Human human, double degrees) throws WrongHeadAngleException {

        double start = human.head.getTurningAngle();
        double middle = start + degrees;
        if (middle >= 360 || middle < 0){

            throw new WrongHeadAngleException("Голова поворачивается неестественно");

        }
        human.head.setTurningAngle(middle);

    }

    public void noddingHead(Human human, double degrees) throws WrongHeadNodAngleException {

        double start = human.head.getTurningAngle();
        double middle = start + degrees;
        if (middle > 90 || middle < -90){
            throw new WrongHeadNodAngleException("Наклон головы неестственнен");
        }

    }

    public void setXCoord(double xCoord) {
        this.xCoord = xCoord;
    }

    public void setYCoord(double yCoord) {
        this.yCoord = yCoord;
    }

    public final class Leg{
        boolean isIn = true;
        final OrientationOfPart orientation;
        TypeOfBodyPart typeOfBodyPart = TypeOfBodyPart.LEG;
        public Leg(OrientationOfPart orientation) {
            this.orientation = orientation;
        }
    }
    public final class Arm{
        boolean isIn = true;
        final OrientationOfPart orientation;
        TypeOfBodyPart typeOfBodyPart = TypeOfBodyPart.ARM;

        private double coordX;
        private double coordY;

        private double angleOnBody;

        private double handAngleOnArm;

        public final ArrayList<Object> inHand = new ArrayList<>();

        public Arm(OrientationOfPart orientation) {
            this.orientation = orientation;

            this.coordX = 0;
            this.coordY = 0;

            this.angleOnBody = 0;
            this.handAngleOnArm = 0;

            if (orientation == OrientationOfPart.LEFT) {
                coordX = -1;
            }
            else if (orientation == OrientationOfPart.RIGHT) {
                coordX = 1;
            }

        }

        public double getCoordX() {
            return coordX;
        }

        public void setCoordX(double coordX) {
            this.coordX = coordX;
        }
        public double getCoordY() {
            return coordY;
        }
        public void setCoordY(double coordY) {
            this.coordY = coordY;
        }
        public double getAngleOnBody() {
            return angleOnBody;
        }
        public void setAngleOnBody(double angleOnBody) {
            this.angleOnBody = angleOnBody;
        }

        public double getHandAngleOnArm() {
            return handAngleOnArm;
        }
        public void setHandAngleOnArm(double handAngleOnArm) {
            this.handAngleOnArm = handAngleOnArm;
        }
    }
    public final class Head{
        boolean isIn = true;
        TypeOfBodyPart typeOfBodyPart = TypeOfBodyPart.HEAD;
        OrientationOfPart orientation = OrientationOfPart.ZERO;
        boolean isSmiling;
        final boolean isWhite;
        double turningAngle;
        double nodAngle;
        public Head(){
            this.isSmiling = false;
            this.isWhite = false;
            this.turningAngle = 0;
            this.nodAngle = 0;
        }

        public void setSmiling(boolean smiling) {
            isSmiling = smiling;
        }
        public boolean getSmiling() {
            return isSmiling;
        }

        public void setTurningAngle(double turningAngle) {
            this.turningAngle = turningAngle;
        }
        public double getTurningAngle() {
            return turningAngle;
        }

        public void setNodAngle(double nodAngle) {
            this.nodAngle = nodAngle;
        }

        public double getNodAngle() {
            return nodAngle;
        }
    }
    public final class Chest{
        boolean isIn = true;
        TypeOfBodyPart typeOfBodyPart = TypeOfBodyPart.CHEST;
        OrientationOfPart orientation = OrientationOfPart.ZERO;
        public Chest(){
        }
    }
    public final class Bottom{
        boolean isIn = true;
        TypeOfBodyPart typeOfBodyPart = TypeOfBodyPart.BOTTOM;
        OrientationOfPart orientation = OrientationOfPart.ZERO;
        double turnAngleOfBody;
        double slantAngleOfBody;
        public Bottom(){
            this.turnAngleOfBody = 0;
            this.slantAngleOfBody = 0;
        }

        public double getSlantAngleOfBody() {
            return slantAngleOfBody;
        }

        public void setSlantAngleOfBody(double slantAngleOfBody) {
            this.slantAngleOfBody = slantAngleOfBody;
        }

        public void setIn(boolean in) {
            isIn = in;
        }
        public boolean isIn() {
            return isIn;
        }

        public void setTurnAngleOfBody(double turnAngleOfBody) {
            this.turnAngleOfBody = turnAngleOfBody;
        }
        public double getTurnAngleOfBody() {
            return turnAngleOfBody;
        }
    }

    @Override
    public int hashCode() {
        return gender.hashCode() * (int) earHP * 52;
    }

    @Override
    public String toString() {
        return "Человек по имени " + name + "роста " + height;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Human human = (Human) obj;
        return age == human.age && gender == human.gender && earHP == human.earHP && name.equals(human.name);
    }
}
