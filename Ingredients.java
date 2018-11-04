import javax.json.JsonArray;

public class Ingredients {

    private JsonArray value;

    Ingredients(JsonArray in) {
        value = in;
    }

    public Ingredient getIngredientAtIndex(int index) {
        Ingredient ingredient = new Ingredient(value.getJsonObject(index));
        return ingredient;
    }
}
