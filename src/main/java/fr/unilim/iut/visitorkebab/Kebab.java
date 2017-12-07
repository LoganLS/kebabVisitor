package fr.unilim.iut.visitorkebab;

import java.util.List;
import fr.unilim.iut.visitorkebab.ingredients.Ingredient;

public interface Kebab {
	List<Ingredient> getIngredients();
	boolean isVegetarien();
	boolean isPescetarien();
}
