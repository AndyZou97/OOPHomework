
public class Apartment extends Building {
    public String apartmentNumber;
    public static int numberOfApartments = 0;

    public Apartment(){
        super("n/a",1, false);
        this.apartmentNumber = "n/a";
        numberOfApartments++;
    }
    public Apartment(String address, int nbrOfFloors, boolean garage, String apartmentNumber){
        super(address, nbrOfFloors, garage);
        this.apartmentNumber = apartmentNumber;
        numberOfApartments++;
    }
    public String getApartmentNumber(){
        return this.apartmentNumber;
    }
    public void setApartmentNumber(String apartmentNumber){
        this.apartmentNumber = apartmentNumber;
    }
    public static int numberOfApartments(){
        return numberOfApartments;
    }
    @Override
    public boolean equals(Object obj){
        Apartment apt = (Apartment) obj;
        if(this.apartmentNumber.equals(apt.apartmentNumber)){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public String toString(){
        return super.toString() + "\n Apartment Number: " + this.apartmentNumber;
    }
}
