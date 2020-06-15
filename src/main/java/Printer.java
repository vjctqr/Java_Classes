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

    public boolean enoughPaper(int copies, int pages){
        if ((this.sheets - (copies * pages)) > 0) {
            return true;
        }
//        return this.sheets - (copies * pages);
        return false;
    }

}
