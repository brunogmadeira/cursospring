package com.midas.api.util;

import java.text.Normalizer;

public class CaracterUtil {
	
	public static String buscaContexto(String busca) {
		String ret = busca;
		if (busca == null || (busca != null && busca.trim().isEmpty()) || busca.equalsIgnoreCase("undefined")) {
			ret = "";
		}
		return ret;
	}
	
	// TIRAR ACENTOS E COLOCAR TEXTO MAIUSCULO
	public static String remUpper(String info) {
		String texto = info;
		if (info != null && !info.equals("")) {
			texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
			texto = texto.replaceAll("[^\\p{ASCII}]", "");
			texto = texto.replaceAll("\\|+", " ");
			texto = texto.trim();
			texto = texto.toUpperCase();
		}
		return texto;
	}
}
