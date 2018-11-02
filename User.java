package com.example.peter_w.nutrition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class User {

    private int id;
    private string name;
    private int height;
    private int weight;

    public List<String> shoppingList = new ArrayList<String>();
    public UserPreferences userPreferences;
    public Calendar userCalendar;
    public History userHistory;
    public SocialManager userSocialManager;
    public APIManager apiManager;

    public int getID(){
        return id;
    }

    public string getName(){
        return name;
    }

    public int getHeight(){
        return height;
    }

    public int getWeight(){
        return weight;
    }

    public void updateWeight(int Weight) {
        weight = Weight;
    }

    public void removeFromShoppingList(string ingredient){
        for (int i = 0; i < shoppingList.size(); i++){
            if (shoppingList[i] == ingredient)
                shoppingList.remove(i);
        }
    }

    public ShoppingList getShoppingList(){
        return shoppingList;
    }

    public void addToShoppingList(string ingredient){
        shoppingList.add(ingredient);
    }

    public void checkIfInShoppingList(string ingredient){
        // TODO
    }

    public Meal getMeal(string meal){
        // TODO
    }
}
