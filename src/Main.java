import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        final String descriptionProduct = "What is the description of the product?";
        final String howmuchFields = "How many fields should be populated with the product?";
        final String productionofFields = "How high is the production per field?";
        final String sellingPriceperField = "What is the selling price per product?";
        final String seedsperProduct = "How many seeds are produced per product in the seed machine?";
        final String howmuchTimeperMinuteSeeds = "How much time in minutes does it take to produce the seeds?";

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
