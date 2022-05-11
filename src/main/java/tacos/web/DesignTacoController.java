package tacos.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.validation.Valid; 
import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model; 
import org.springframework.validation.Errors; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping; 
import lombok.extern.slf4j.Slf4j;
import tacos.Taco;
import tacos.Ingredient;
import tacos.Ingredient.Type;


@Slf4j
@Controller @RequestMapping("/design")
public class DesignTacoController {
     @ModelAttribute
     public void addIngredientsToModel(Model model) {
List<Ingredient> ingredients = Arrays.asList(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP),
new Ingredient("COTO", "Corn Tortilla", Type.WRAP), new Ingredient("GRBF", "Ground Beef",
Type.PROTEIN),
Type.PROTEIN),
new Ingredient("CARN", "Carnitas",
new Ingredient("TMTO", "Diced Tomatoes",
Type.VEGGIES), new Ingredient("LETC", "Lettuce",
Type.VEGGIES),
new Ingredient("CHED", "Cheddar", Type.CHEESE), new Ingredient("JACK", "Monterrey Jack",
Type.CHEESE),
new Ingredient("SRCR", "Sour Cream", Type.SAUCE));