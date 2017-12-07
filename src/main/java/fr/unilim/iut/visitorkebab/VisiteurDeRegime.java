package fr.unilim.iut.visitorkebab;

import fr.unilim.iut.visitorkebab.ingredients.*;

public interface VisiteurDeRegime {
	public boolean visit(Agneau ingredientAgneau);
	
	public boolean visit(Boeuf ingredientBoeuf);
	
	public boolean visit(Crevette ingredientCrevette);
	
	public boolean visit(Fromage ingredientFromage);
	
	public boolean visit(Oignon ingredientOignon);
	
	public boolean visit(Pain ingredientPain);
	
	public boolean visit(Salade ingredientSalade);
	
	public boolean visit(Sauce ingredientSauce);
	
	public boolean visit(Thon ingredientThon);
	
	public boolean visit(Tomate ingredientTomate);
}
