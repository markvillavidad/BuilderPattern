
public class BuilderPatternDemo {
    
    public static void main(String[] args) {
        
        MealBuilder mealBuilder = new MealBuilder();
        
        Meal vegMeal = mealBuilder.prepareNonVegMEal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost : " + vegMeal.getCost());
        
        Meal nonVegMeal = mealBuilder.prepareNonVegMEal();
        System.out.println("\n\n Non Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost : " + nonVegMeal.getCost());
    }   
}
