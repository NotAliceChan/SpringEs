package com.example.Esercizio2.Controller;

import com.example.Esercizio2.Core.Meal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/lista")
public class Controller {

    List<Meal> meals = new ArrayList<>();

    @GetMapping("/menu")
    public List<Meal> alllMealList() {
        return meals;
    }

    @PostMapping("/aggiungi")
    public String aggiungiMeals(@RequestBody Meal meal) {
        meals.add(meal);
        return "Piatto : " + meal.getNome() + " è stato aggiunto";

    }


    @GetMapping("/desc/{frase}")
    public List<Meal> ricercaPastiByFrase(@PathVariable String frase) {
        List<Meal> mealByDesc = new ArrayList<>();

        for (Meal meal : meals) {
            if (meal.getDescrizione().contains(frase)) {
                mealByDesc.add(meal);
            }
        }

        return mealByDesc;
    }

    @GetMapping("/byname/{nome}")
    public List<Meal> ricercaPastiByName(@PathVariable String nome) {
        List<Meal> mealByNome = new ArrayList<>();

        for (Meal meal : meals) {
            if (meal.getNome().contains(nome)) {
                mealByNome.add(meal);
            }
        }

        return mealByNome;
    }

    @GetMapping("/prezzo/{min}/{max}")
    public List<Meal> getPastiByPrezzo(
            @PathVariable("min") double minPrezzo,
            @PathVariable("max") double maxPrezzo) {

        List<Meal> mealMinMax = new ArrayList<>();

        for (Meal meal : meals) {
            if (meal.getPrezzo() >= minPrezzo && meal.getPrezzo() <= maxPrezzo) {
                mealMinMax.add(meal);
            }
        }
        return mealMinMax;
    }

}