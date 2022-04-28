public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count: " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed: " + pagesPrinted + " and total page count is: " + printer.getPagesPrinted());
    }
}