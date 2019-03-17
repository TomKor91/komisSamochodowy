package komisSamochodowy;

public class Samochód {

    private String colour;
    private int price;
    private int door;
    private String mark;
    private int yearbook;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getYearbook() {
        return yearbook;
    }

    public void setYearbook(int yearbook) {
        this.yearbook = yearbook;
    }

    @Override
    public String toString() {
        return "Samochód{" +
                "colour='" + colour + '\'' +
                ", price=" + price +
                ", door=" + door +
                ", mark='" + mark + '\'' +
                ", yearbook=" + yearbook +
                '}';
    }
}
