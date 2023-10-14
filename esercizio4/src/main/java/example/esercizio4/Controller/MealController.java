package example.esercizio4.Controller;

import example.esercizio4.Entity.Meal;
import example.esercizio4.Service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/meal")
public class MealController {

    private List<Meal> meals = new ArrayList<>();
    @GetMapping(value = "/get")
    public ResponseEntity<List<Meal>> getMeals() {
        return ResponseEntity.ok(meals);
    }

    @PostMapping(value = "/post")
        public ResponseEntity<String>aggiungiPiatto(@RequestBody Meal meal) {
        this.meals.add(meal);
        return ResponseEntity.ok("Meal added!");

    }
    @DeleteMapping(value = "/delete/{mealName}")
        public ResponseEntity<String>deletePiatto(@PathVariable String mealName) {
        this.meals.removeIf (meal -> meal.getNome().equals(mealName));
        return ResponseEntity.ok("Meal deleted!");

        }
    @PutMapping(value = "/edit")
        public ResponseEntity<String>editPiatto(@RequestBody Meal meal) {
        this.meals.removeIf(m -> m.getNome().equals(meal.getNome()));
        this.meals.add(meal);
        return ResponseEntity.ok("Meal updated!");

    }
}