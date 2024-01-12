import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Wie ist die Beschreibung des Produkts?");
        String description = myObj.nextLine();
        System.out.println("Wie viele Felder des Produkts stehen zur Verfügung?");
        int fields = myObj.nextInt();
        System.out.println("Wie hoch ist die Produktion pro Feld?");
        int productionPerField = myObj.nextInt();
        System.out.println("Wie hoch ist der Verkaufspreis pro Produkt?");
        int pricePerProduct = myObj.nextInt();
        System.out.println("Wie viele Samen werden pro Produkt hergestellt?");
        int seedPerProduct = myObj.nextInt();
        System.out.println("Wie viel Zeit in Minuten benötigt die Produktion der Samen");
        int seedTime = myObj.nextInt();
        Calculation calculation = new Calculation();
        calculation.calculation(description, fields, productionPerField, pricePerProduct, seedPerProduct, seedTime);

    }
}
