package example.toaster;

public class Toaster {
    private int numberOfSlots;
    private String toasterType;

   public Toaster(){
      //  numberOfSlots = ;
      //  toasterType = ;
    }

    public Toaster(int slots, String type){
        this.numberOfSlots = slots;
        this.toasterType = type;
    }

    public int getNumberOfSlots(){
        return numberOfSlots;
    }

    public String toasterType(){
        return toasterType;
    }

    public void addSlots(){}

}