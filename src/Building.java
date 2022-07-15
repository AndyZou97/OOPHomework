public class Building {
    private String address;
    private int nbrOfFloors;
    private boolean garage;

    public Building(String address, int nbrOfFloors, boolean garage){
        this.address = address;
        this.nbrOfFloors = nbrOfFloors;
        this.garage = garage;
    }

    @Override
    public String toString(){
        return "Address: " + this.address + "\nNumber of Floors: " + this.nbrOfFloors + "\nGarage: " + this.garage;
    }

}
