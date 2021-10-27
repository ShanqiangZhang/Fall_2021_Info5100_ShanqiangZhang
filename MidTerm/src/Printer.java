public class Printer {
    public String getConnection = "default";

    private Printer() {
    }

    private static Printer instance;

    public static Printer getInstance() {
        if (instance == null) {
            synchronized (Printer.class) {
                if (instance == null) {
                    instance = new Printer();
                }
            }
        }
        return instance;
    }


    //test
    public static void main(String[] args) {
        Printer p1 = getInstance();
        p1.getConnection = "Your Printer is working";
        System.out.println(p1.getConnection);

    //follow up test
        Printer p2 = getInstance();
        p2.getConnection = "Your Printer is working!!!";

        System.out.println(p1.getConnection);
        System.out.println(p2.getConnection);

    }

}
