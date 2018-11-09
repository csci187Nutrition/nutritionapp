# nutritionapp
Code for the nutrition app


People who worked on this project:

Amit Nagdev
Andrew Chang
Nick Sousa
Peter Woodworth

## *class* APIHandler

#### Execute Query of API

Note: that this is currently in testing phase and 
only handles a default query. Update incoming closer
to launch to fix this bug

```
getMealsFromQuery()
```
Executes Query (notice note above) and RETURNS a Query Object.

## *class* Query

#### Private variables

```
private JsonArray value
```
Holds the value of the Query Object. Do not access manually.

#### Getting a Recipe

```
Recipe getRecipeAtIndex(int index)
```
Retrieves the recipe at the given index.

## *class* Recipe

#### Private Variables
```
private JsonObject value
```

Holds the recipe itself for use by the member functions

#### Ingredient Accession
```
JsonArray ingredients()
```
Returns Ingredients Object that contains all the ingredients in the Recipe.

#### Recipe Data Accession
```
String linkInAPI ()
```
Returns the link to the recipe IN the API's records. This does not return the link to the recipe's original location

```
String imageUrl ()
```
Returns link to the image of the recipe's URL

```
String sourceName ()
```
Returns name of soruce website

```
String sourceUrl ()
```
Returns URL to the article the API got its data from


```
String shareLink ()
```
Returns the link used to share the recipe

```
double timeToCook ()
```
Returns the time it takes to cook in minutes as a double


```
int calories ()
``` 
Returns the calories of the recipe rounded to a whole number

```
int fat ()
```
Returns the fat of the recipe rounded to a whole number

```
int carbs ()
```
Returns carbs of the recipe rounded to a whole number

```
int fiber ()
```
Returns fiber of the recipe rounded to a whole number

```
int sugar ()
```
Returns sugar of the recipe rounded to a whoel number

```
int protein ()
```
Returns protein of the recipe rouneded to a whole number

```
int cholesterol ()
```
Returns cholesterol of the recipe rounded to a whole number

```
int sodium ()
```
Returns sodium of the recipe rounded to a whole number

## *class* Ingredients

#### private variables
```
private JsonArray value
```
Stores the ingredients list

#### Accessing an individual ingredient
```
Ingredient getIngredientAtIndex(int index)
```
Gets the ingredient at the specified index in the ingredients array.

## *class* Ingredient

#### private variables
```
private JsonObject value
```
Stores the ingredient's value

#### Ingredient data accession
```
String text ()
```
Returns the description of the ingredient

```
double quantity ()
```
Returns how much of the ingredient the recipe calls for.

```
String measure ()
```
Returns the unit of the quantity

```
String food ()
```
Returns simplified version of the ingredient text

```
double weight ()
```
Returns the weight of the quantity of the ingredient the recipe calls for in grams.
