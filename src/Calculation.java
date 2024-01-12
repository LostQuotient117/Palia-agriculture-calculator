public class Calculation {
    public void calculation(String description, int fields, int productionPerField, int pricePerProduct, int seedPerProduct, int seedTime){
        int one = fields * productionPerField; //Produktionsertrag der Felder
        int two = one - (fields / seedPerProduct); //Produktionsertrag der Felder abzüglich der für die Samen benötigten Produkte
        int three = two * pricePerProduct; //Gewinn aller Felder (Geld)
        int four = three / seedTime;
        output(description, one, two, three, four);
    }
    public void output(String description, int one, int two, int three, int four){
        System.out.println(description);
        System.out.println("Produktionsertrag der Felder: " + one);
        System.out.println("...abzüglich der für die Samenproduktion erforderlichen Produkte: " + two);
        System.out.println("Gewinn aller Felder: " + three);
        System.out.println("Gewinn pro Minute " + four);
    }
}
