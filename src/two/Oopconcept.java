package two;

/**
 * Created by ICE-015 on 2/8/2017.
 */
public abstract class Oopconcept {
    public abstract void start();
    public void stop(){
        System.out.println("Stopping Vehicle in abstract class");
    }
}
class TwoWheeler extends Oopconcept{
    @Override
    public void start() {
        System.out.println("Starting Two Wheeler");
        }
}
class FourWheeler extends Oopconcept{
    @Override
    public void start() {
        System.out.println("Starting Four Wheeler");
    }
}