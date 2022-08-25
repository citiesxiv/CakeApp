
package App;


public class Order {
    private String fName;
    private String lName;
    private long phone;
    private boolean delivery;
    private CakeFlavors flavor;
    private CakeSize size;

    public Order(String fName, String lName, long phone, boolean delivery, CakeFlavors flavor, CakeSize size) {
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.delivery = delivery;
        this.flavor = flavor;
        this.size = size;
    }

    @Override
    public String toString() {
        return fName + " " + lName + " Flavor: " + flavor + " Size: "+size;
    }

    public long getPhone() {
        return phone;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public CakeFlavors getFlavor() {
        return flavor;
    }

    public void setFlavor(CakeFlavors flavor) {
        this.flavor = flavor;
    }

    public CakeSize getSize() {
        return size;
    }

    public void setSize(CakeSize size) {
        this.size = size;
    }
    
    
}
