import java.util.ArrayList;
import java.util.List;

public class TestRobot {


    public static void main(String[] args) {
        List<Robot> robots = new ArrayList<>();
        robots.add(new IndustrialRobot("Pero"));
        robots.add(new HomeAssistantRobot("Homer"));
        robots.add(new IndustrialRobot("Miki"));
        robots.add(new HomeAssistantRobot("Marge"));
        // robots.add(new SpecialRobot("SpecialK")); error, ne moze se handle i sustav se ne moze oporaviti
    }
}
