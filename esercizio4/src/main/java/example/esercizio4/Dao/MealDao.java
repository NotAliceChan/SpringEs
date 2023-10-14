package example.esercizio4.Dao;

import example.esercizio4.Entity.Meal;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MealDao {
    private List<Meal> meals = new ArrayList<>();

    public void aggiungiPiatto(Meal meal) {
        this.meals.add(meal);
    }

    public void deletePiatto(Meal pasto) {
        this.meals.removeIf(meal -> meal.getNome().equals(pasto));
    }

    public void editPiatto(Meal editmeal) {
        this.meals.removeIf(meal -> meal.getNome().equals(editmeal);
        this.meals.add(editmeal);
    }

    public List<Meal> getMeals() {
        return this.meals;
    }


}
