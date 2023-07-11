package model.builder;

import interfaces.UiObjectclase;
import model.User;
import util.Builder;

public class UserBuilder implements Builder<User> {

    private String userName;
    private UiObjectclase location;
    private String gender;
    private UserBuilder(String userName) {
        this.userName = userName;
    }
    public static UserBuilder user(String userName){
        return new UserBuilder(userName);
    }
    public User withLocationAndGender(String location, String gender){

        this.location = new UiObjectclase(location);
        this.gender = gender;
        return build();
    }
    @Override
    public User build() {
        return new User(this);
    }

    public String getUserName() {
        return userName;
    }

    public UiObjectclase getLocation() {
        return location;
    }

    public String getGender() {
        return gender;
    }
}
