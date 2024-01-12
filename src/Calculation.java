public class Calculation {
    public void calculation(String description, int fields, int productionPerField, int pricePerProduct, int seedPerProduct, int seedTime){
        int one = fields * productionPerField;
        int two = one - (fields / seedPerProduct);
        int three = two * pricePerProduct;
        int four = three / seedTime;
        output(description, one, two, three, four);
    }
    public void output(String description, int one, int two, int three, int four){

        final String resultProductionYield = "Production yield of the fields: ";
        final String resultMinus = "Minus the products required for seed production: ";
        final String resultProfitallFields = "Monetary profit from all fields: ";
        final String resultProfitPerMinute = "Monetary profit per minute: ";


        System.out.println(description);
        System.out.println(resultProductionYield + one);
        System.out.println(resultMinus + two);
        System.out.println(resultProfitallFields + three);
        System.out.println(resultProfitPerMinute + four);
    }
}
