package org.formacio.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// aquesta classe ha de ser detectada com un component
@Component
public class ServeiConsultaEmpreses {

	@Autowired(required = false)
	private IntegradorCotitzacions clientWS;
	// aquest servei necessita d'un integrador de cotitzacions per retornar la
	// informacio
	// declarau la dependencia i feis que spring la resolgui

	// modifiqueu aquest metode per canviar el 0 per el valor obtingut del
	// clientCotitzacionsWS
	public String infoEmpresa(String empresa) {
//		ClientCotitzacionsWS client  = (ClientCotitzacionsWS) clientWS;

		return "La empresa " + empresa + " cotitza a " + clientWS.obteCotitzacio(empresa);
	}

	// modifiqueu aquest metode per canviar el 0 per el valor obtingut del
	// clientCotitzacionsWS
	// aquest es, segurament, l'exercici mes xungo !
	// com farieu per fer que el metode infoDiari de obteMitjanaDiariaCotitzacions
	// nomes se crides una vegada?
	// pista (si nomes s'ha de cridar una vegada ... haurem de guardar el resultat a
	// alguna banda ... )
	public String infoDiari() {
		ClientCotitzacionsWS client = (ClientCotitzacionsWS) clientWS;
		if (client.nombreInvocacions < 1) {
			return "La cotitzacio mitjana diaria es " + client.obteMitjanaDiariaCotitzacions();
		}
		return "La cotizacio mitjana diaria es 0";
	}

}
