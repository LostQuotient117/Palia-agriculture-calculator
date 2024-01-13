import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    private final String validNumberInputs = "^[0-9]+$";
    private final String validTextInputs = "^[a-zA-Z]+$";
    public void app() {
        Scanner scanner = new Scanner(System.in);
        boolean stayInProgram = true;

        //region Labels
        final String descriptionProduct = "What is the description of the product?";
        final String howmuchFields = "How many fields should be populated with the product?";
        final String productionofFields = "How high is the production per field?";
        final String sellingPriceperField = "What is the selling price per product?";
        final String seedsperProduct = "How many seeds are produced per product in the seed machine?";
        final String howmuchTimeperMinuteSeeds = "How much time in minutes does it take to produce the seeds?";
        final String zeroToExit = "(Input 0 to exit the program)";
        final String exitToExit = "(Input exit to exit the program)";
        //endregion
        do {
            System.out.println(descriptionProduct);
            System.out.println(exitToExit);
            //get user input description
            String description = scanner.nextLine();
            //Check user input
            String operatingMode = getModeFromUserInput(description, validTextInputs);
            //Handle user input
            switch (operatingMode) {
                case "retry" -> {
                    continue;
                }
                case "exit" -> {
                    stayInProgram = exitMethod();
                }
                default -> {
                    System.out.println(howmuchFields);
                    System.out.println(zeroToExit);
                    int fields = scanner.nextInt();
                    operatingMode = getModeFromUserInput(fields, validNumberInputs);
                    switch (operatingMode) {
                        case "retry" -> {
                            continue;
                        }
                        case "0" -> {
                            stayInProgram = exitMethod();
                        }
                        default -> {
                            System.out.println(productionofFields);
                            System.out.println(zeroToExit);
                            int productionPerField = scanner.nextInt();
                            operatingMode = getModeFromUserInput(productionPerField, validNumberInputs);
                            switch (operatingMode){
                                case "retry" -> {
                                    continue;
                                }
                                case "0" -> {
                                    stayInProgram = exitMethod();
                                }
                                default -> {
                                    System.out.println(sellingPriceperField);
                                    System.out.println(zeroToExit);
                                    int pricePerProduct = scanner.nextInt();
                                    operatingMode = getModeFromUserInput(pricePerProduct, validNumberInputs);
                                    switch (operatingMode){
                                        case "retry" -> {
                                            continue;
                                        }
                                        case "0" -> {
                                            stayInProgram = exitMethod();
                                        }
                                        default -> {
                                            System.out.println(seedsperProduct);
                                            System.out.println(zeroToExit);
                                            int seedPerProduct = scanner.nextInt();
                                            operatingMode = getModeFromUserInput(seedPerProduct, validNumberInputs);
                                            switch (operatingMode){
                                                case "retry" -> {
                                                    continue;
                                                }
                                                case "0" -> {
                                                    stayInProgram = exitMethod();
                                                }
                                                default -> {
                                                    System.out.println(howmuchTimeperMinuteSeeds);
                                                    System.out.println(zeroToExit);
                                                    int seedTime = scanner.nextInt();
                                                    operatingMode = getModeFromUserInput(seedTime, validNumberInputs);
                                                    switch (operatingMode){
                                                        case "retry" -> {
                                                            continue;
                                                        }
                                                        case "0" -> {
                                                            stayInProgram = exitMethod();
                                                        }
                                                        default -> {
                                                            Calculation calculation = new Calculation();
                                                            calculation.calculation(description, fields, productionPerField, pricePerProduct, seedPerProduct, seedTime);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } while (stayInProgram);
    }
    private String getModeFromUserInput(String userInput, String modePattern){
        Pattern pattern = Pattern.compile(modePattern);
        Matcher matcher = pattern.matcher(userInput);
        if (matcher.matches())
            return userInput;
        else
            return "retry";
    }
    private String getModeFromUserInput(int userInput, String modePattern){
        String userInputasString = String.valueOf(userInput);
        if (userInputasString.matches(modePattern))
            return userInputasString;
        else
            return "retry";
    }
    private boolean exitMethod(){
        System.out.println("We shall meet again.\nFarewell stranger.");
        return false;
    }
}
