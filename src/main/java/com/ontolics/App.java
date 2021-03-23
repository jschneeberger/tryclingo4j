package com.ontolics;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Clingo.init("src/main/clingo");

		try (Clingo control = Clingo.create()) {
			System.out.println(control.getVersion());
			control.add("base", "b :- not a. a :- not b.");
			control.ground("base");

			try (SolveHandle handle = control.solve()) {
				for (Model model : handle) {
					System.out.println("Model type: " + model.getType());
					for (Symbol atom : model.getSymbols()) {
						System.out.println(atom);
					}
				}
			}
		} catch (ClingoException ex) {
			System.err.println(ex.getMessage());
		}
	}
}
