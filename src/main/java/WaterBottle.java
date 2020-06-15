public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public int drink(){
        return this.volume - 10;
    }

    public int empty(){
        return this.volume - this.volume;
    }

    public int fill(){
        int remainder = 100 - this.volume;
        return this.volume + remainder;
    }


}
