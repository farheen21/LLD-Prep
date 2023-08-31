package RideSharingPlatform.modal;

public class Vehicals {

    private  User user;
    private  String vehicalName;
    private String  vehicalNumber;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getVehicalName() {
        return vehicalName;
    }

    public void setVehicalName(String vehicalName) {
        this.vehicalName = vehicalName;
    }

    public String getVehicalNumber() {
        return vehicalNumber;
    }

    public void setVehicalNumber(String vehicalNumber) {
        this.vehicalNumber = vehicalNumber;
    }

    public Vehicals(User user, String vehicalName, String vehicalNumber) {
        this.user = user;
        this.vehicalName = vehicalName;
        this.vehicalNumber = vehicalNumber;
    }

}
