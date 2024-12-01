package inheritance;


import lombok.Setter;

public class Mohammad implements PersonBehavior{

    private final Entity entity;

    @Setter
    private PersonBehavior personBehavior;


    public Mohammad(Entity entity) {
        this.entity = entity;
    }

    @Override
    public void behave() {
        setEntityName();
        System.out.println("I am Mohammad");
        personBehavior.update();
    }

    private void setEntityName() {entity.setName("Mohammad");}

}
