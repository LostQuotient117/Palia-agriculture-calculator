public class Calculation {
    public void calculation(String description, int fields, int productionPerField, int pricePerProduct, int seedPerProduct, int seedTime){
        int one = fields * productionPerField; //Produktionsertrag der Felder
        int two = one - (fields / seedPerProduct); //Produktionsertrag der Felder abzüglich der für die Samen benötigten Produkte
        int three = two * pricePerProduct; //Gewinn aller Felder (Geld)
        int four = three / seedTime;
        output(description, one, two, three, four);
    }
    public void output(String description, int one, int two, int three, int four){

        final String resultProduktionsertrag = "Produktionsertrag der Felder: ";
        final String resultAbzueglich = "...abzüglich der für die Samenproduktion erforderlichen Produkte: ";
        final String resultGewinnFelder = "Gewinn aller Felder: ";
        final String resultGewinnMinute = "Gewinn pro Minute: ";


        System.out.println(description);
        System.out.println(resultProduktionsertrag + one);
        System.out.println(resultAbzueglich + two);
        System.out.println(resultGewinnFelder + three);
        System.out.println(resultGewinnMinute + four);
    }
}
