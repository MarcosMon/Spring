package org.formacio.component;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServeiAlumnat {

	/**
	 * ha de donar d'alta a la base de dades d'alumnes l'alumne indicat amb el
	 * corresponent codi. Si el nom de l'alumne es null, no l'ha de donar d'alta
	 * Retorna true si l'alumne s'ha inserit, false si no.
	 */

	@Autowired(required = false)
	private RepositoriAlumnes repositori;


	@PostConstruct
	public void iniciador() {
		repositori.altaAlumne(1, "Antonia");
		repositori.altaAlumne(2, "Joan");
	}

	public boolean matricula(int id, String alumne) {

		if (alumne != null) {
			repositori.altaAlumne(id, alumne);
			return true;
		}
		return false;

	}
}
