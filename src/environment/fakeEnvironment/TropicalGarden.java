package environment.fakeEnvironment;

import exceptions.TreeDestroyingException;
import location.Locator;
import needed.ActionMaker;
import needed.Human;

import java.util.ArrayList;
import java.util.Random;

public class TropicalGarden {

    final Random random = new Random();

    static Locator locator = ActionMaker.locator;

    public final Tree tree = new Tree(5, 0.8);
    public final Branch.Liana liana = new Branch.Liana();

    int countOfBranches = random.nextInt(1, 5);

    public final Branch[] branches = new Branch[countOfBranches];

    private double startX = locator.getFakeEnvironmentXStartCoordinate();
    private double startY = locator.getFakeEnvironmentYStartCoordinate();
    private double endX = locator.getFakeEnvironmentXEndCoordinate();
    private double endY = locator.getFakeEnvironmentYEndCoordinate();

    double volume = (Math.abs(endX-startX)) * (Math.abs(endY-startY));

    public TropicalGarden() {

    }



    public class Tree {

        final double height;
        final double radius;

        double treeHP = 100;

        public Tree(double height, double radius) {
            this.height = height;
            this.radius = radius;

            branchesCreator();

        }

        public void setTreeHP(double treeHP) {
            this.treeHP = treeHP;
        }

        public double getTreeHP() {
            return treeHP;
        }
    }

    public Branch choseBranches(Branch[] branches) {

        int testNow;
        int testMax = 0;
        int count = 0;

        for (int i = 0; i < countOfBranches; i++) {
            testNow = branches[i].hashCode();
            if (testNow > testMax) {
                testMax = testNow;
                count = i;
            }
        }
        branches[count].onBranch.add(Branch.Liana);
        return branches[count];
    }

    public void usingOfTreeAndBranch(Branch branch, double deltaHP, boolean isDamage1OrHeal0) {

        if (isDamage1OrHeal0) {
            if (deltaHP <= 0){
                throw new IllegalArgumentException("Изменение параметра не связывается с параметрыми переданными в метод");
            }

            deltaHP = deltaHP * (-1);

        }
        else {
            if (deltaHP >= 0){
                throw new IllegalArgumentException("Изменение параметра не связывается с параметрыми переданными в метод");
            }
        }

        tree.setTreeHP(branch.getBranchHP() - deltaHP);
        branch.setBranchHP(branch.getBranchHP() - deltaHP);

        if (getTreeHP() <= 0 || branch.getBranchHP() <= 0) {
            throw new TreeDestroyingException("Дерево словалось, кажется что то на него подвесили");
        }

    }

    public double deltaHPCalculator(Human human) {
        return Math.abs(human.hashCode() * (0.01));
    }

    public double getTreeHP(){
        return tree.getTreeHP();
    }

    public class Branch {
        final ArrayList<Object> onBranch = new ArrayList<>();
        public static Branch.Liana Liana;
        final double length;
        double branchHP = 100 * tree.radius / tree.height;

        public Branch(double length) {
            this.length = length;
            countOfBranches--;
        }

        public void setBranchHP(double branchHP) {
            this.branchHP = branchHP;
        }

        public double getBranchHP() {
            return branchHP;
        }

        @Override
        public int hashCode() {
            return (int) ((int) (branchHP * length * countOfBranches) * (volume * 0.001));
        }

        public static class Liana {
            final ArrayList<Object> onLiana = new ArrayList<>();

            public Liana() {
            }

            public void putHumanInLiana(Human human){
                onLiana.add(human);
//                double test = human.bottom.getTurnAngleOfBody();
                double end = 180;
                human.bottom.setTurnAngleOfBody(end);

            }

        }
    }

    public void branchesCreator(){

        for (int i = 0; i < countOfBranches; i++) {
            branches[i] = new Branch(random.nextDouble());
        }
    }

    public void setEndX(double endX) {
        this.endX = endX;
    }
    public void setEndY(double endY) {
        this.endY = endY;
    }

    public void setStartX(double startX) {
        this.startX = startX;
    }
    public void setStartY(double startY) {
        this.startY = startY;
    }

    public double getStartX() {
        return startX;
    }

    public double getStartY() {
        return startY;
    }

    public double getEndX() {
        return endX;
    }

    public double getEndY() {
        return endY;
    }
}
