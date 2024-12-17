package environment.fakeEnvironment;

import needed.Human;

import java.util.ArrayList;

public class TropicalGarden {

    public Tree tree = new Tree(5, 0.8);
    public Branch branch = new Branch(0.8);
    public Branch.Liana liana = new Branch.Liana();

    public TropicalGarden() {

        this.tree = tree;
        this.branch = branch;
        this.liana = liana;

    }

    public class Tree {
        double height;
        double radius;

        public Tree(double height, double radius) {
            this.height = height;
            this.radius = radius;
        }

        public double getHeight() {
            return height;
        }

        public double getRadius() {
            return radius;
        }
    }
    public class Branch {
        public static Branch.Liana Liana;
        double length;

        public Branch(double length) {
            this.length = length;
        }


        public static class Liana {
            ArrayList<Object> onLiana = new ArrayList<Object>();

            static double test;

            public Liana() {
                this.onLiana = onLiana;
            }

            public void putObjectInLiana(Object object) {
                onLiana.add(object);
            }
            public void putHumanInLiana(Human human){
                onLiana.add(human);
                double start = human.bottom.getTurnAngleOfBody();
                test = start;
                double end = 180;
                human.bottom.setTurnAngleOfBody(end);
            }
            public void removeObjectFromLiana(Object object) {
                onLiana.remove(object);
            }
            public void removeHumanFromLiana(Human human){
                onLiana.remove(human);
                double start = human.bottom.getTurnAngleOfBody();
                double end = start;
                human.bottom.setTurnAngleOfBody(end);
            }
        }
    }
}
