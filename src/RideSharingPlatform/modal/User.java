package RideSharingPlatform.modal;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {

    private UUID userid;

    private String name;
    private int age;
    private Gender gender;

    private List<Vehicals> vehicalsList;

    private Role userRole;

    public UUID getUserid() {
        return userid;
    }

    public void setUserid(UUID userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Vehicals> getVehicalsList() {
        return vehicalsList;
    }

    public void setVehicalsList(List<Vehicals> vehicalsList) {
        this.vehicalsList = vehicalsList;
    }

    public Role getUserRole() {
        return userRole;
    }

    public void setUserRole(Role userRole) {
        this.userRole = userRole;
    }

    public User(String name, int age, Gender gender) {
        this.userid = UUID.randomUUID();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.vehicalsList = new ArrayList<>();
//        this.userRole = userRole;
    }
}
// - role : Driver , consumer
////         - Name: String
////         - F/M :- enum;
////         - Integer Age;
////          Add User(name , enum , age)
////