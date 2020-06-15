public class Printer {

    private int sheets;
    private int toner;

    public Printer(int sheets, int toner){
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets(){
        return this.sheets;
    }

    public int getToner(){
        return this.toner;
    }

    public void print(int copies, int pages){
        if ((copies * pages) <= this.sheets) {
            this.sheets -= (copies * pages);
            this.toner -= (copies * pages);
        }
    }

}
