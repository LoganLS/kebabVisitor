package fr.unilim.iut.visitorkebab;

import java.util.LinkedList;
import java.util.List;

import fr.unilim.iut.visitorkebab.ingredients.Ingredient;

public class Assiette implements Kebab {

	public List<Ingredient> getIngredients() {
		return new LinkedList<>();
	}

	public boolean isVegetarien() {
		return true;
	}

	public boolean isPescetarien() {
		return true;
	}

	public void accept(VisiteurDeRegimeVegetarien v){
    	v.visit(this);
    }
}
