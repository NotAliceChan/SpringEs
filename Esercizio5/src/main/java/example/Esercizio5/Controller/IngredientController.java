package example.Esercizio5.Controller;

import example.Esercizio5.Entity.Ingredient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/ing")
public class IngredientController {

    private List<Ingredient> ing = new ArrayList<>();

    @GetMapping("/get/meals")
    public ResponseEntity<List<Ingredient>> getMeals() {
        return ResponseEntity.ok(ing);
    }

    @PostMapping("/post")
    public  ResponseEntity<String> addIngredient(@RequestBody Ingredient ingredient){
        this.ing.add(ingredient);
        return ResponseEntity.ok("Ingredient Added!");
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String>deleteingredient(@PathVariable String ingredientname){
    this.ing.removeIf(ingredient -> ingredient.getName().equals(ingredientname));
    return ResponseEntity.ok("Ingredient Delete!");
    }

    @PutMapping("/edit")
    public ResponseEntity<String>editIngredient(@RequestBody Ingredient ingredient){
    this.ing.removeIf(ingredient1 -> ingredient.getName().equals(ingredient));
    return ResponseEntity.ok("Ingrediend Edit");
    }

}
