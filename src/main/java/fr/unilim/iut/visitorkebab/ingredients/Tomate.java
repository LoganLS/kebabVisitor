package fr.unilim.iut.visitorkebab.ingredients;

import fr.unilim.iut.visitorkebab.Kebab;
import fr.unilim.iut.visitorkebab.VisiteurDeRegimePescetarien;
import fr.unilim.iut.visitorkebab.VisiteurDeRegimeVegetarien;

public class Tomate extends Ingredient {

	public Tomate(String nom, Kebab kebab) {
		super(nom, kebab);
	}

	public boolean accept(VisiteurDeRegimeVegetarien v){
    	return v.visit(this);
    }
	
	public boolean accept(VisiteurDeRegimePescetarien v){
    	return v.visit(this);
    }
}
