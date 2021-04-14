package nl.inholland.first.API.Model;

public class F1 {

    private int CarID;
    private String Carname;
    private String Cartype;
    private String Drivername;
    private int Topspeed;

    public F1(String carname, String cartype, String drivername, int topspeed) {
        Carname = carname;
        Cartype = cartype;
        Drivername = drivername;
        Topspeed = topspeed;
    }

    public int getCarID() {
        return CarID;
    }

    public String getCarname() {
        return Carname;
    }

    public void setCarname(String carname) {
        Carname = carname;
    }

    public String getCartype() {
        return Cartype;
    }

    public void setCartype(String cartype) {
        Cartype = cartype;
    }

    public String getDrivername() {
        return Drivername;
    }

    public void setDrivername(String drivername) {
        Drivername = drivername;
    }

    public int getTopspeed() {
        return Topspeed;
    }

    public void setTopspeed(int topspeed) {
        Topspeed = topspeed;
    }
}
