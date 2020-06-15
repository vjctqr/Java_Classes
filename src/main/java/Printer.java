public class Printer {

    private int sheets;

    public Printer(int sheets){
        this.sheets = sheets;
    }

    public int getSheets(){
        return this.sheets;
    }

    public boolean print(int copies, int pages){
        if ((this.sheets - (copies * pages)) > 0)
        return true;
//        return this.sheets - (copies * pages);
        else return false;
    }

}
