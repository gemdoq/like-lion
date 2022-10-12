package week5.day2.babylion;

public class Hospital {
    private String id;
    private String address;
    private String district;
    private String category;
    private Integer emerRoom;
    private String name;
    private String subdivision;

    public Hospital(String id, String address, String category, Integer emerRoom, String name, String subdivision) {
        this.id = id;
        this.address = address;
        this.category = category;
        this.emerRoom = emerRoom;
        this.name = name;
        this.subdivision = subdivision;
        this.setDistrict();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict() {
        String[] splitted = this.address.split(" ");
        this.district = splitted[0] + " " + splitted[1];
    }
}
