package android.dkh.com.housingapp;

public enum PropertyType {
    APARTMENT("Apartment"),SERVICE_APARTMENT ("ServiceApartment"),VILLA ("Villa"),TOWNHOUSE ("Townhouse");

    private String type;

    PropertyType(String type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return type;
    }
}
