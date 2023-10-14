package example.Esercizio5.Dao;

import example.Esercizio5.Entity.Ingredient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class IngredientDao {

    private List<Ingredient> ingredienti = new ArrayList<>();

    public void addIngredient(Ingredient ingredient){
        this.ingredienti.add(ingredient);
    }

    public void deleteingredient(Ingredient ingredient) {
        this.ingredienti.removeIf(ingredient1 -> ingredient1.getName().equals(ingredient1));
    }

    public void editIngredient(Ingredient ingredients){
        this.ingredienti.removeIf(ingredient1 -> ingredient1.getName().equals(ingredients));
        this.ingredienti.add(ingredients);
    }

    public List<Ingredient> getIngredienti(){
        return this.ingredienti;
    }

}
