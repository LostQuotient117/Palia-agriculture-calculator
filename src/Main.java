import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        final String descriptionProduct = "Wie ist die Beschreibung des Produkts?";
        final String howmuchFields = "Wie viele Felder des Produkts stehen zur Verfügung?";
        final String productionofFields = "Wie hoch ist die Produktion pro Feld?";
        final String sellingPriceperField = "Wie hoch ist der Verkaufspreis pro Produkt?";
        final String seedsperProduct = "Wie viele Samen werden pro Produkt hergestellt?";
        final String howmuchTimeperMinuteSeeds = "Wie viel Zeit in Minuten benötigt die Produktion der Samen";

        Scanner myObj = new Scanner(System.in);
        System.out.println(descriptionProduct);
        String description = myObj.nextLine();
        System.out.println(howmuchFields);
        int fields = myObj.nextInt();
        System.out.println(productionofFields);
        int productionPerField = myObj.nextInt();
        System.out.println(sellingPriceperField);
        int pricePerProduct = myObj.nextInt();
        System.out.println(seedsperProduct);
        int seedPerProduct = myObj.nextInt();
        System.out.println(howmuchTimeperMinuteSeeds);
        int seedTime = myObj.nextInt();
        Calculation calculation = new Calculation();
        calculation.calculation(description, fields, productionPerField, pricePerProduct, seedPerProduct, seedTime);

    }
}
