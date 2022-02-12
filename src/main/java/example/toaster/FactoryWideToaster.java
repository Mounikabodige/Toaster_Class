package example.toaster;
/**
 * Class implements the FactoryToaster interface and created the slots of wide type.
 */
public class FactoryWideToaster implements IFactoryToaster {

    @Override
    public Toaster buildToaster(int slots) {

        // Verifies the number of slots and throws an error if toaster cannot be created.
        if (slots == 2 || slots == 4) {
            Toaster.ToasterBuilder t = new Toaster.ToasterBuilder();

            return t.numberOfSlots(slots).slotType(SlotType.Wide)
                    .build();
        } else {
            throw new RuntimeException("Cannot create Toaster as slot are incorrect " + slots);
        }
    }
}
