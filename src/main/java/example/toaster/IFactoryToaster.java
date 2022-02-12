package example.toaster;

/**
 * Interface for all the toaster methods.
 * Any further methods that of new functionality can be added here.
 * Any number of new features can be added.
 */

public interface IFactoryToaster {
    Toaster buildToaster(int numberOfSlots);
}
