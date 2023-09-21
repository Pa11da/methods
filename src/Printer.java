public class Printer {
    private String queue = "";
    private int pagesInQueue;
    private int printedPages;

    public void append(String text) {
        queue = queue + "\nДок без имени" + " - " + text;
        pagesInQueue += 1;
    }
    public void append(String text, String name) {
        queue = queue + "\n" + name + " - " + text;
        pagesInQueue += 1;
    }
    public void append(String text, int pagesCount) {
        queue = queue + "\nДокумент без имени" + " - " + text;
        pagesInQueue += pagesCount;
    }
    public void append(String text, String name, int pagesCount) {
        queue = queue + "\n" + name + " - " + text;
        pagesInQueue += pagesCount;
    }

    public void clear() {
        queue = "";
        pagesInQueue = 0;
    }
    public void print() {
        System.out.println(queue);
        printedPages += pagesInQueue;
        clear();
    }
    public int getPendingPagesCount() {
        return pagesInQueue;
    }
    public int getPrintedPagesCount() {
        return printedPages;
    }
}
