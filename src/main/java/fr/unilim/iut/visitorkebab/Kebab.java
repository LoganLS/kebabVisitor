package fr.unilim.iut.visitorkebab;

import java.util.List;
import fr.unilim.iut.visitorkebab.ingredients.Ingredient;

public abstract class Kebab{
	public abstract List<Ingredient> getIngredients();
	public boolean isVegetarien(){
		for(Ingredient ingredient : this.getIngredients()){
			if(!ingredient.accept(new VisiteurDeRegimeVegetarien())){
				return false;
			}
		}
		return true;
	};
	public abstract boolean isPescetarien();
}
