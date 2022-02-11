package example.toaster;

public class Slots {
    private int numberOfSlots;
    Slots(){

    }

    Slots(int num){
        if(num == 2 || num == 4){
            this.numberOfSlots = num;
        }
        else{
            System.out.println( num + " " + " is not a valid number of slots" +
                    "You can create a toaster with 2 or 4 slots only");
        }
    }

    public int addSlot(){
        retutn
    }

    public int getRemainingSlots(){
        return numberOfSlots;
    }

}
