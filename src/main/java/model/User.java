package model;

import interfaces.InicialPag;
import interfaces.UiObjectclase;
import model.builder.UserBuilder;

public class User {

    private String nameUser;

    private String gender;
    private UiObjectclase originalContry;

    public User(UserBuilder builder) {

        this.nameUser = builder.getUserName();
        this.originalContry = builder.getLocation();
        this.gender = builder.getGender();
    }

    public String getNameUser() {
        return nameUser;
    }

    public UiObjectclase getOriginalContry() {
        return originalContry;
    }

    public String getGender(){
        return gender;
    }
}
