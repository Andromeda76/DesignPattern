package inheritance;

public interface PersonBehavior {

    void behave();

    default void update(){
    }

}
