package org.vamdc.kida.tap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.vamdc.dictionary.Restrictable;

/*
 * Here we put all supported restrictables
 * VOSICapabilities gets them from here also!
 * */
@SuppressWarnings("serial")
public class Restrictables {

	public static Collection<Restrictable> Restricts = new ArrayList<Restrictable>() {
		{
			add(Restrictable.MoleculeIonCharge);
			add(Restrictable.MoleculeChemicalName);
			add(Restrictable.MoleculeInchi);
			add(Restrictable.MoleculeInchiKey);
			add(Restrictable.MoleculeIonCharge);
			add(Restrictable.MoleculeStoichiometricFormula);
			
			add(Restrictable.AtomSymbol);
			
			//add(Restrictable.CollisionIAEACode);
		}
	};

	/**
	 * Species paths
	 * */
	public final static Map<Restrictable, String> SpeciesPathSpec = new HashMap<Restrictable, String>() {
		{
			put(Restrictable.MoleculeIonCharge, "charge");
			//put(Restrictable.MoleculeChemicalName, "commonName");
			put(Restrictable.MoleculeChemicalName, "description");
			put(Restrictable.MoleculeInchi, "inchi");
			put(Restrictable.MoleculeInchiKey, "inchiKey");
			put(Restrictable.MoleculeIonCharge, "charge");
			put(Restrictable.MoleculeStoichiometricFormula, "formula"); // warning : C2H2 different of H2C2 OR CCHH
			
			put(Restrictable.AtomSymbol, "formula");
			put(Restrictable.AtomIonCharge, "charge");

		}
	};

	/**
	 * Channel paths
	 */
	public final static Map<Restrictable,String> ChannelPathSpec = new HashMap<Restrictable,String>(){{
		put(Restrictable.MoleculeIonCharge,"specieRel.charge");
		//put(Restrictable.MoleculeChemicalName,"specieRel.commonName");
		put(Restrictable.MoleculeChemicalName,"specieRel.description");
		put(Restrictable.MoleculeInchi,"specieRel.inchi");
		put(Restrictable.MoleculeInchiKey,"specieRel.inchiKey");
		put(Restrictable.MoleculeIonCharge,"specieRel.charge");
		put(Restrictable.MoleculeStoichiometricFormula,"formula");
		
		put(Restrictable.AtomSymbol,"specieRel.formula");
		put(Restrictable.AtomIonCharge,"specieRel.charge");
		
		//put(Restrictable.CollisionIAEACode,"toTypeChannel");
	}};
	
	public static Map<Restrictable,String> getAliasedChannelMap(String prefix){
		Map<Restrictable,String> cps = new HashMap<Restrictable,String>();
		if (prefix!=null){
			cps.put(Restrictable.MoleculeIonCharge, prefix+".specieRel.charge");
			//cps.put(Restrictable.MoleculeChemicalName, prefix+".specieRel.commonName");
			cps.put(Restrictable.MoleculeChemicalName, prefix+".specieRel.description");
			cps.put(Restrictable.MoleculeInchi, prefix+".specieRel.inchi");
			cps.put(Restrictable.MoleculeInchiKey, prefix+".specieRel.inchiKey");
			cps.put(Restrictable.MoleculeIonCharge, prefix+".specieRel.charge");
			cps.put(Restrictable.MoleculeStoichiometricFormula, prefix+".specieRel.formula");

			cps.put(Restrictable.AtomSymbol, prefix+".specieRel.formula");
			cps.put(Restrictable.AtomIonCharge, prefix+".specieRel.charge");
			
			cps.put(Restrictable.CollisionIAEACode, prefix+".toTypeChannel");
		}
		return cps;
	}
	
	public static Map<Restrictable,String> getAliasedSpeciesMap(String prefix){
		Map<Restrictable,String> cps = new HashMap<Restrictable,String>();
		if (prefix!=null){
			cps.put(Restrictable.MoleculeIonCharge, prefix+".charge");
			cps.put(Restrictable.MoleculeChemicalName, prefix+".description");
			cps.put(Restrictable.MoleculeInchi, prefix+".inchi");
			cps.put(Restrictable.MoleculeInchiKey, prefix+".inchiKey");
			cps.put(Restrictable.MoleculeIonCharge, prefix+".charge");
			cps.put(Restrictable.MoleculeStoichiometricFormula, prefix+".specieRel.formula");

			cps.put(Restrictable.AtomSymbol, prefix+".formula");
			cps.put(Restrictable.AtomIonCharge, prefix+".charge");
		}
		return cps;
	}
	
	
}
