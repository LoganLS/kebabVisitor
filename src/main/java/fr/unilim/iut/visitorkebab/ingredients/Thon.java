package fr.unilim.iut.visitorkebab.ingredients;

import fr.unilim.iut.visitorkebab.Kebab;
import fr.unilim.iut.visitorkebab.VisiteurDeRegimeVegetarien;

public class Thon extends Ingredient {

	public Thon(String nom, Kebab kebab) {
		super(nom, kebab);

	}

	@Override
	public boolean isPescetarien() {
		return super.isPescetarien();
	}

	public boolean accept(VisiteurDeRegimeVegetarien v){
    	return v.visit(this);
    }
}
