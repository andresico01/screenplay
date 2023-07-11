package interfaces;

public enum InicialPag {

    SHOW_CONTRY("com.androidsample.generalstore:id/spinnerCountry"),

    SET_NAME("//android.widget.EditText[@text='Enter name here']"),

    SELECT_FEMALE("//android.widget.RadioButton[@text='Female']"),

    SELECT_MALE("/android.widget.RadioButton[@text='Male']"),

    GO_SHOP("com.androidsample.generalstore:id/btnLetsShop"),


        ;
    private String appElement;

    public void setAppElement(String appElement) {
        this.appElement = appElement;
    }

    InicialPag(String appElement) {
        this.appElement = appElement;
    }

    public String getAppElement() {
        return appElement;
    }
}
