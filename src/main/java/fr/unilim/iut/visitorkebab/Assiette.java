package fr.unilim.iut.visitorkebab;

import java.util.LinkedList;
import java.util.List;

import fr.unilim.iut.visitorkebab.ingredients.Ingredient;

public class Assiette extends Kebab {

	public List<Ingredient> getIngredients() {
		return new LinkedList<>();
	}
}
