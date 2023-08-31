package Domen;

public class HotDrink extends Product {
    
    private double hotdrinkVolume;

    public HotDrink (String name, int price, double hotdrinkVolume) {
        super(name, price);
        this.hotdrinkVolume = hotdrinkVolume;      

    }

    public double getHotDrinkVolume() {
        return hotdrinkVolume;
    }

     public void setHotDrinkVolume(double hotdrinkVolume) {
        this.hotdrinkVolume = hotdrinkVolume;
    }

    @Override
    public String toString() {
        return super.toString() + " volume=" + this.hotdrinkVolume;
    }
           
}
