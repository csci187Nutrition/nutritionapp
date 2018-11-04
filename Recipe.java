import javax.json.JsonArray;
import javax.json.JsonObject;

public class Recipe {

    Recipe(JsonObject recipe) {
        value = recipe;
    }

    private JsonObject value;

    public JsonArray ingredients() {
        JsonArray ingredients = value.getJsonArray("ingredients");
        return ingredients;
    }

    public String linkInAPI () { return value.getString("uri"); }

    public String imageUrl () { return value.getString("image"); }

    public String sourceName () { return value.getString("source"); }

    public String sourceUrl () { return value.getString("url"); }

    public String shareLink () { return value.getString("shareAs"); }



    public double timeToCook () {
        return (double) value.getJsonNumber("totalTime").doubleValue();
    }

    public int calories () {
        return (int) value.getJsonObject("totalNutrients").getJsonObject("ENERC_KCAL").getJsonNumber("quantity").doubleValue();
    }

    public int fat () {
        return (int) value.getJsonObject("totalNutrients").getJsonObject("FAT").getJsonNumber("quantity").doubleValue();
    }

    public int carbs () {
        return (int) value.getJsonObject("totalNutrients").getJsonObject("CHOCDF").getJsonNumber("quantity").doubleValue();
    }

    public int fiber () {
        return (int) value.getJsonObject("totalNutrients").getJsonObject("FIBTG").getJsonNumber("quantity").doubleValue();
    }

    public int sugar () {
        return (int) value.getJsonObject("totalNutrients").getJsonObject("SUGAR").getJsonNumber("quantity").doubleValue();
    }

    public int protein () {
        return (int) value.getJsonObject("totalNutrients").getJsonObject("PROCNT").getJsonNumber("quantity").doubleValue();
    }

    public int cholesterol () {
        return (int) value.getJsonObject("totalNutrients").getJsonObject("CHOLE").getJsonNumber("quantity").doubleValue();
    }

    public int sodium () {
        return (int) value.getJsonObject("totalNutrients").getJsonObject("NA").getJsonNumber("quantity").doubleValue();
    }

}
