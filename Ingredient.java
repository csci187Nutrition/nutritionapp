import javax.json.JsonObject;

public class Ingredient {

    Ingredient (JsonObject in) {
        value = in;
    }

    private JsonObject value;

    public String text () { return value.getString("text"); }

    public double quantity () { return value.getJsonNumber("quantity").doubleValue(); }

    public String measure () { return value.getString("measure"); }

    public String food () { return value.getString("food"); }

    public double weight () { return value.getJsonNumber("weight").doubleValue(); }

}
