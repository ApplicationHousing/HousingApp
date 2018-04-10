package android.dkh.com.housingapp;

public class Product {
    private String title;
    private String address;
    private int price;
    private String propertyType;
    private int bedroom;
    private int bathroom;
    private int usableArea;
    private int image;
    private android.dkh.com.housingapp.Location location;


    public Product(String title, String address, int price, String propertyType, int bedroom, int bathroom, int usableArea, int image, android.dkh.com.housingapp.Location location) {
        this.title = title;
        this.address = address;
        this.price = price;
        this.propertyType = propertyType;
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.usableArea = usableArea;
        this.image = image;
        this.location = location;
    }

    public Product() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    public int getBathroom() {
        return bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public int getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(int usableArea) {
        this.usableArea = usableArea;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public android.dkh.com.housingapp.Location getLocation() {
        return location;
    }

    public void setLocation(android.dkh.com.housingapp.Location location) {
        this.location = location;
    }
}
