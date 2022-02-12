package example.toaster;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to create the toaster and the objects.
 */

public class Toaster {
    List<Slot> slots;

    private Toaster(ToasterBuilder builder){
        this.slots = builder.slots;
    }

    public static class ToasterBuilder{
        private int numberOfSlots;
        private SlotType slotType;
        private List<Slot> slots;

        // Gets the number of Slots.
        public ToasterBuilder numberOfSlots(int slots){
            this.numberOfSlots = slots;
            return this;
        }

        // Gets the slot type.
        public ToasterBuilder slotType(SlotType slotType){
            this.slotType = slotType;
            return this;
        }
        //Returns finally constructed toaster object.
        public Toaster build(){
            slots = new ArrayList<>();

            for(int i = 0; i< numberOfSlots; i++){
                slots.add(new Slot(slotType));
            }
            Toaster t = new Toaster(this);
            System.out.println("Created toaster with "+ numberOfSlots +" slots, of slot type " + slotType + ".");
            return t;
        }
    }
}

