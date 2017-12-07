package fr.unilim.iut.visitorkebab.ingredients;

import java.util.List;
import fr.unilim.iut.visitorkebab.Kebab;
import fr.unilim.iut.visitorkebab.VisiteurDeRegimeVegetarien;

public abstract class Ingredient extends Kebab {

	protected String nom;
	protected Kebab kebab;

	public Ingredient(String nom, Kebab kebab) {
		this.nom = nom;
		this.kebab = kebab;
	}

	public List<Ingredient> getIngredients() {
		List<Ingredient> ingredients = kebab.getIngredients();
		ingredients.add(this);
		return ingredients;
	}

	public boolean isPescetarien() {
		return kebab.isPescetarien();
	}
	
	public abstract boolean accept(VisiteurDeRegimeVegetarien v);

}
