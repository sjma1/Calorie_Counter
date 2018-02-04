package com.example.jun.calorie_counter;

/**
 * Created by Jun on 12/27/2017.
 */
import java.util.ArrayList;
import java.util.Date;
/******************************************
 * This class represents the day's worth of
 * calories the user has consumed. Contains
 * its date information along with a list of
 * food items
 *****************************************/
public class Daily_Calories {
    private ArrayList<Food> all_food_for_day;
    private Date daily_date;


    Daily_Calories(Date d) {
        daily_date = d;
    }

    /**********************************************************
     *Get the total calories for the day by adding together
     *the calories of all consumed food
     *@param
     *@return Total Calories
     ***********************************************************/
    int Get_Total_Calories() {
        int sum = 0;
        for(Food f: all_food_for_day) {
            sum += f.Get_Calorie_Count();
        }
        return sum;
    }

    /**********************************************************
     *Adds a food to the list of consumed food for the day
     *@param
     *@return Total Calories
     ***********************************************************/
    void Add_Food(Food f) {
        this.all_food_for_day.add(f);
    }

    /**********************************************************
     *Returns the arraylist containing consumed foods
     *@param
     *@return Total Calories
     ***********************************************************/
    ArrayList<Food> Get_All_Food_For_Day() {
        return this.all_food_for_day;
    }
}
