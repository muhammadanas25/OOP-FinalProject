package GUIPackage;

public class customer {
    private String name;
    private String id;
    private double totalAmmount;
    private boolean isAdmin;
    
    public customer(String Name){
        name=Name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTotalAmmount() {
        return totalAmmount;
    }

    public void setTotalAmmount(double totalAmmount) {
        this.totalAmmount = totalAmmount;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public customer(String name, String id, double totalAmmount, boolean isAdmin) {
        this.name = name;
        this.id = id;
        this.totalAmmount = totalAmmount;
        this.isAdmin = isAdmin;
    }
}
