package com.example.jun.calorie_counter;
/**
 * Created by Jun on 12/27/2017.
 */

/******************************************
 * This class represents a food item that
 * contains both a string name and an int
 * representing its calorie count
 *****************************************/
public class Food {
    private String name;
    private int calorie_count;

    //Constructors
    Food(String n) {
        this.name = n;
        this.calorie_count = 0;
    }

    Food(int c) {
        this.name = "";
        this.calorie_count = c;
    }

    Food(String n, int c) {
        this.name = n;
        this.calorie_count = c;
    }

    /**********************************************************
     *Sets the name of the food object
     *@param n, name to set
     *@return None
     ***********************************************************/
    public void Set_Name(String n) {
        this.name = n;
    }

    /**********************************************************
     *Sets the amount of calories
     *@param c, calories
     *@return None
     ***********************************************************/
    public void Set_Calories(int c) {
        this.calorie_count = c;
    }

    /**********************************************************
     *Gets the name of the food object
     *@param
     *@return name
     ***********************************************************/
    public String Get_Name() {
        return this.name;
    }

    /**********************************************************
     *Gets the amount of calories
     *@param
     *@return calorie_count
     ***********************************************************/
    public int Get_Calorie_Count() {
        return this.calorie_count;
    }
}
