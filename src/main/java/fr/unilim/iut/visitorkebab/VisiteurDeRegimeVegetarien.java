package fr.unilim.iut.visitorkebab;

import fr.unilim.iut.visitorkebab.ingredients.*;

public class VisiteurDeRegimeVegetarien implements VisiteurDeRegime{
	public boolean visit(Agneau ingredientAgneau){
		return false;
	}
	
	public boolean visit(Boeuf ingredientBoeuf){
		return false;
	}
	
	public boolean visit(Crevette ingredientCrevette){
		return false;
	}
	
	public boolean visit(Fromage ingredientFromage){
		return true;
	}
	
	public boolean visit(Oignon ingredientOignon){
		return true;
	}
	
	public boolean visit(Pain ingredientPain){
		return true;
	}
	
	public boolean visit(Salade ingredientSalade){
		return true;
	}
	
	public boolean visit(Sauce ingredientSauce){
		return true;
	}
	
	public boolean visit(Thon ingredientThon){
		return false;
	}
	
	public boolean visit(Tomate ingredientTomate){
		return true;
	}
}
