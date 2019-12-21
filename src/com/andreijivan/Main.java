package com.andreijivan;

/**
 *Hello Filip. M-am rezumat sa rezolv ad literam tema de casa, chiar daca tehnic vorbind exista si alte moduri mai
 * detaliate si complete. De exemplu am inceput o alta varianta cu un meniu, in care adaugai in consola Sales Repr
 * si nr de vanzari, vedeai o lista cu toti, alegeai sa ii sorteze dupa vanzari, etc. Am ramas totusi la varianta
 * asta simpla. Sper sa fie ok. Mi-ar fi placut sa folosesc ArrayList deoarece cu Array simplu nu poti jongla cu marimea
 * listei.
 */
public class Main {

	public static void main(String[] args) {
		SalesRepresentative salesGuy1 = new SalesRepresentative("Sales guy 1", 8, 400);
		SalesRepresentative salesGuy2 = new SalesRepresentative("Sales guy 2", 4, 500);
		SalesRepresentative salesGuy3 = new SalesRepresentative("Sales guy 3", 2, 200);
		SalesRepresentative salesGuy4 = new SalesRepresentative("Sales guy 4", 12, 100);
		SalesRepresentative salesGuy5 = new SalesRepresentative("Sales guy 5", 6, 600);

		SalesRepresentative[] reps = {salesGuy1, salesGuy2, salesGuy3, salesGuy4, salesGuy5};
		for (SalesRepresentative rep : reps) {
			System.out.println(rep.toString() + " total: " + rep.totalSales());

		}
		SalesRepresentative [ ] sortedReps = reps.clone();
		Sort sorter = new Sort();
		sorter.sortReps(sortedReps);
		System.out.println();
		for (SalesRepresentative sortedRep : sortedReps) {
			System.out.println(sortedRep.toString() + " total: " + sortedRep.totalSales());

		}

	}


}


