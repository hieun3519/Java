public class genericC <T, V>{
    // <T> can be initialized to anything but T is generally use the most
    // bounded generic when extends class or interface
    // can have multiple bounds with T extends something & something

    T thingToPrint;
    V otherThing;
    public genericC(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}
