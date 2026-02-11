package SOLID;

// I -> Interface Segregation Principle
// Clients should not depend on methods they do not use.

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

interface Fax {
    void fax();
}

class OldPrinter implements Printer {

    @Override
    public void print() {
        System.out.println("Old Printer: Printing document...");
    }
}

class MultiPrinter implements Printer, Scanner, Fax {

    @Override
    public void print() {
        System.out.println("MultiPrinter: Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("MultiPrinter: Scanning document...");
    }

    @Override
    public void fax() {
        System.out.println("MultiPrinter: Sending fax...");
    }
}

// CLIENTS — This is where ISP is proven
class PrintManager {
    public void processPrint(Printer printer) {
        printer.print();
    }
}

class ScanManager {
    public void processScan(Scanner scanner) {
        scanner.scan();
    }
}

public class I {

    public static void main(String[] args) {

        Printer oldPrinter = new OldPrinter();
        Printer multiPrinter = new MultiPrinter();

        PrintManager printManager = new PrintManager();
        printManager.processPrint(oldPrinter);
        printManager.processPrint(multiPrinter);

        Scanner scanner = new MultiPrinter();
        ScanManager scanManager = new ScanManager();
        scanManager.processScan(scanner);
    }
}
