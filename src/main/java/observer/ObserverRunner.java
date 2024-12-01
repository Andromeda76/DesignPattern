package observer;


import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Timer;

public class ObserverRunner {


    public static void main(String[] args) {
        SubjectImpl subject = new SubjectImpl();
        Observer observerOne = null;
        Observer observerTwo = null;
        Observer observerThree = null;
        Timestamp timestamp = Timestamp.from(Instant.now());
        for (int i =0; i<= 400000; i++) {
            observerOne = new ObserverImpl("observerOne");
            observerTwo = new ObserverImpl("observerTwo");
            observerThree = new ObserverImpl("observerThree");

            subject.register(observerOne);
            subject.register(observerTwo);
            subject.register(observerThree);

            observerOne.setSubject(subject);
            observerTwo.setSubject(subject);
            observerThree.setSubject(subject);
        }

        observerOne.update();
        observerTwo.update();
        observerThree.update();

        subject.postMessage("HelloWorld");

        Long time = Timestamp.from(Instant.now()).getTime() - timestamp.getTime();
        System.out.println(time);
    }
}
