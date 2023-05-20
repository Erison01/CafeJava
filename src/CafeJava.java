public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java,";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffePrice = 4.2;
        double lattePrice = 4.9;
        double cappucinoPrice = 5.2;

        // Customer name variables (add yours below)
        String customer1 = " Cindhuri";
        String customer2 = " Jimmy ";
        String customer3 = " Noah";
        String customer4 = " Sam";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        if(isReadyOrder3=true){
            System.out.println(readyMessage + customer3 + ",and " + displayTotalMessage + cappucinoPrice);
        }else
            System.out.println(pendingMessage + customer3);

        System.out.println(displayTotalMessage + (lattePrice * 2) + customer4);
        if (isReadyOrder4=true){
            System.out.println(readyMessage);
        }else
            System.out.println(pendingMessage);

        double tottal=lattePrice - dripCoffePrice;
        System.out.println(customer2 + displayTotalMessage + (dripCoffePrice+tottal));

        System.out.println(generalGreeting + customer1);
        System.out.println(pendingMessage + customer1);// Displays "Welcome to Cafe Java, Cindhuri"
        // ** Your customer interaction print statements will go here ** //
    }
}

