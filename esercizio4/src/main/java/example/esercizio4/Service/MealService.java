package example.esercizio4.Service;

import example.esercizio4.Dao.MealDao;
import example.esercizio4.Entity.Meal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService {
    private MealDao mealDao;

    @Autowired
    public MealService(MealDao mealDao) {

        this.mealDao = mealDao;
    }

    public void aggiungiPiatto(Meal meal) {
        if(meal == null) throw new IllegalArgumentException("Non puo essere nullo");
        if(meal.getNome() == null || meal.getNome().isEmpty()) throw new IllegalArgumentException("il nome non puo essere nullo");
        if(meal.getDescrizione() == null || meal.getDescrizione().isEmpty()) throw new IllegalArgumentException("La Descrizione non puo essere nulla");
        if(meal.getPrezzo() <= 0) throw new IllegalArgumentException("Il prezzo non può essere meno di 0 o uguale a 0");
        if(meal.getPrezzo() >= 100) throw new IllegalArgumentException("Il prezzo non può essere piu di 100 o uguale a 100");
        mealDao.aggiungiPiatto(meal);
    }

    public void deletePiatto(Meal mealName) {

        mealDao.deletePiatto(mealName);
    }

    public void editPiatto(Meal meal) {
        mealDao.editPiatto(meal);
    }

    public List<Meal> getMeals() {
        return mealDao.getMeals();
    }
}
