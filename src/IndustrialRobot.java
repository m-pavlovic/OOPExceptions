public class IndustrialRobot extends Robot {
    protected IndustrialRobot(String name) {
        super(name);
    }

    @Override
    protected void performSomeAction() {
        System.out.println(getClass().getSimpleName() + " is performing some special action");

    }
}
