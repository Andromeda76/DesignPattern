package inheritance;


public class BehaveRunner {


    public static void main(String[] args)  {
        Entity entity = new Entity();
        Mohammad mohammad = new Mohammad(entity);
        Ali ali = new Ali(entity);

        mohammad.setPersonBehavior(ali);
        ali.setPersonBehavior(mohammad);
        mohammad.behave();
    }

}
