package interfaces;

public class UiObjectclase {

    private String contry;
    private String Location;
    public UiObjectclase(String contry) {
        this.contry = contry;
        this.Location = "new UiScrollable(new UiSelector()).scrollIntoView(text(\""+contry+"\""+"));";
    }
    public String getContry() {
        return contry;
    }

    public String getLocation() {
        return Location;
    }
}
