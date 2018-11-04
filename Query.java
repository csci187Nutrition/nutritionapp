import javax.json.JsonArray;
import javax.json.JsonObject;

public class Query {

    private JsonArray value;

    Query (JsonArray resultsInput) {
        value = resultsInput;
    }

    public Recipe getRecipeAtIndex(int index, JsonArray searchResults) {
        JsonObject recipe = value.getJsonObject(index).getJsonObject("recipe");
        Recipe recipeToReturn = new Recipe(recipe)
        return recipeToReturn;
    }


}
