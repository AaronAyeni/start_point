public class Computer {
    private int storage;
    private String printer;

    public Computer(int storage) {
        this.storage = storage;
        this.printer = "";

    }

    public int getStorage() {
        return this.storage;
    }

    public int addStorage(int amount) {
        return storage  = storage + amount;
    }

    public void setPrinter(String printer) {
        this.printer = printer;
    }

    public String getPrinter() {
        return this.printer;
    }

    public void printMessage(String message) {
        if (printer != "") {
            System.out.println(message + " printer connected");
        }else{
            System.out.println("no printer") ;
        }


    }


}
