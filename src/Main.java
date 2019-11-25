public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run(){

        Prisoner jack_the_ripper = new Prisoner("jack the ripper", "Murder", 38, 40, "yes");
        Prisoner justin_bieber = new Prisoner("justin_bieber ", "Singing", 16, 7, "yes");
        Prisoner Neptunus = new Prisoner("Neptunus", "Killing the dead sea", 53, 80, "yes");
        Prisoner Harry_poter = new Prisoner("Harry_poter", "killing voldemort", 18, 3, "yes");
        Prisoner Demo_dog = new Prisoner("Demo_dog", "attempted to kill eleven", 2, 2, "yes");
        Prisoner nathan = new Prisoner("nathan", "attempted to kill deez nuts", 18, 2, "false");
    }
}
