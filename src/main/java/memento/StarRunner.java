package memento;

import java.util.Stack;

public class StarRunner {

    public static void main(String[] args) {
        var states = new Stack<StarMemento>();

        Star star = new Star(StarType.SUPERNOVA, 1000000, 3000000);
        states.add(star.getMemento());
        star.timePasses();
        var s = ((StarMementoInternal) states.get(0));
        System.out.println("1 after timePasses :" + s.getStarType() + " , " + " , " + s.getAgeYears() + " , " + " , " + s.getMassTons());
        states.add(star.getMemento());
        s = ((StarMementoInternal) states.get(1));
        System.out.println("2 after add :" + s.getStarType() + " , " + " , " + s.getAgeYears() + " , " + " , " + s.getMassTons());
        star.timePasses();
        states.add(star.getMemento());
        s = ((StarMementoInternal) states.get(2));
        System.out.println("3 after add :" + s.getStarType() + " , " + " , " + s.getAgeYears() + " , " + " , " + s.getMassTons());
        star.setMemento(starMemento());
        System.out.println("4 after set :" + s.getStarType() + " , " + " , " + s.getAgeYears() + " , " + " , " + s.getMassTons());
        states.add(star.getMemento());
        s = ((StarMementoInternal) states.get(3));
        System.out.println("5 after add :" + s.getStarType() + " , " + " , " + s.getAgeYears() + " , " + " , " + s.getMassTons());
    }

    private static StarMemento starMemento(){
        StarMementoInternal starMementoInternal = new StarMementoInternal();
        starMementoInternal.setStarType(StarType.RED_GIANT);
        starMementoInternal.setMassTons(20000000);
        starMementoInternal.setAgeYears(2000000);
        return starMementoInternal;
    }
}
