package com.edcuacionit.digitalers.eutilidades;

import com.google.gson.GsonBuilder;

public final class UtilidadesCadena {
	private UtilidadesCadena() {
	}

	public static String converitObjetoJson(Object obj,boolean pretty) {
		GsonBuilder builder = new GsonBuilder();
		if (pretty) {
			builder.setPrettyPrinting();
		}
		return builder.create().toJson(obj);
	}
}
