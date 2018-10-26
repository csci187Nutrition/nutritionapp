import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;




class APIHandler {

    public APIHandler () {
        //Nothing to see here
    }


    // private URL url = new URL("https://api.edamam.com/search?q=chicken&app_id=b957081d&app_key=889e79d32df59ed1621b6247b075e26a&from=0&to=3&calories=591-722&health=alcohol-free");
    public void testAPICall() {

        String test = "https://api.edamam.com/search?q=chicken&app_id=b957081d&app_key=889e79d32df59ed1621b6247b075e26a&from=0&to=3&calories=591-722&health=alcohol-free";

        //Declare necessary variables for getting JSON from API based on search
        StringBuilder stringBuilder = new StringBuilder();
        JsonObject json = null;




        // Get JSON from API
        try {

            // Create the URL
            URL url = new URL(test);
            // System.out.println("YAY");

            // Access URL and save output to a buffer
            try (BufferedReader buffer = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {

                // Read every line of the buffer and put it into the string builder
                for (String line; (line = buffer.readLine()) != null;) {
                    stringBuilder.append(line);
                }

                // Create JSON using the string created using the StringBuilder
                JsonReader jsonReader = Json.createReader(new StringReader(stringBuilder.toString()));
                json = jsonReader.readObject();
                jsonReader.close();
            }
        } catch (MalformedURLException e) {
            System.out.println("Error = " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error with IO in URL accession");
        }

        // Get values. Currently a test to get recipe data:

        String resultsKeyword = "hits";
        JsonArray searchResults = json.getJsonArray(resultsKeyword);

        // Temporary proof of concept. Iterate through in actual version
        JsonObject recipe = searchResults.getJsonObject(0).getJsonObject("recipe");

        // Get ingredients. Proof of concept so only getting ingredients of first recipe
        JsonArray ingredients = recipe.getJsonArray("ingredients");

        if (ingredients == null) {
            System.out.println("NULLY NULL NULL");
        }
        // Get first ingredient from first meal ingredients list. Proof of concept so only doing one ingredient
        JsonObject ingredient = ingredients.getJsonObject(0);

        System.out.println(ingredient.getString("text"));

        System.out.println("YAY IT WORKED");
    }


}