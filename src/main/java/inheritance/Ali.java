package inheritance;


import lombok.Setter;

import java.util.List;


public class Ali implements PersonBehavior{

    private final Entity entity;

    @Setter
    private PersonBehavior personBehavior;



    public Ali(Entity entity) {
        this.entity = entity;
    }


    @Override
    public void behave() {
        entity.getName();
        System.out.println("I am Ali");
        personBehavior.update();
    }

    @Override
    public void update() {
        behave();
    }
}
