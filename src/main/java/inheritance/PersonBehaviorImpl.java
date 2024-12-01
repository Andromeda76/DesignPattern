package inheritance;

public class PersonBehaviorImpl implements PersonBehavior {

    @Override
    public void behave() {

    }

    @Override
    public void update() {
        behave();
    }
}
