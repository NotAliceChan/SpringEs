package example.Esercizio5.Service;

import example.Esercizio5.Dao.IngredientDao;
import example.Esercizio5.Entity.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {

    private IngredientDao ingredientDao;

    @Autowired
    public IngredientService(IngredientDao ingredientDao){
        this.ingredientDao = ingredientDao;
    }

    public void addIngredient(Ingredient ingredient){
        ingredientDao.addIngredient(ingredient);
    }

    public void editIngredient(Ingredient ingredient){
        ingredientDao.editIngredient(ingredient);
    }

    public List<Ingredient> getIngredient(){
        return ingredientDao.getIngredienti();
    }

}
