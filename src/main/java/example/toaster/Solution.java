package example.toaster;

public class Solution {

    public static void main(String[] args){
        IFactoryToaster ft1 = new FactoryWideToaster();
        IFactoryToaster ft2 = new FactoryRegularToaster();

        // Creates the instances of teh toasters with slots 2 and 4 for wide slot type toaster.
        ft1.buildToaster(2);
        ft1.buildToaster(4);

        // Creates the instances of teh toasters with slots 2 and 4 for regular slot type toaster.
        ft2.buildToaster(2);
        ft2.buildToaster(4);

        // Creates the instances of teh toasters with 1 slot for wide slot type.
        ft1.buildToaster(1);

        // Creates the instances of teh toasters with 3 slots for wide slot type.
        ft2.buildToaster(3);

    }
}
