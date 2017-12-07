package fr.unilim.iut.visitorkebab.ingredients;

import fr.unilim.iut.visitorkebab.Kebab;
import fr.unilim.iut.visitorkebab.VisiteurDeRegimeVegetarien;

public class Boeuf extends Ingredient{
	
    public Boeuf(String nom, Kebab kebab) {
        super(nom,kebab);
    }

    @Override
    public boolean isPescetarien() {
        return false;
    }
    
    public boolean accept(VisiteurDeRegimeVegetarien v){
    	return v.visit(this);
    }

}
