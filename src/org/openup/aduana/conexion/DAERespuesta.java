package org.openup.aduana.conexion;

import java.util.ArrayList;

public class DAERespuesta {

	public enum RespuestaTipo {
		Conocimientos,
		Imagenes,
		Lineas,
		Asociaciones
	}
	
	public DAERespuesta() {
		this.setRespuestas(new ArrayList<DAERespuesta.Respuesta>());
	}

	private ArrayList<Respuesta> respuestas;
	
	public ArrayList<Respuesta> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(ArrayList<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}

	
	
	/*
	 * Obtiene la respuesta para el manifiesto
	 */
	public Respuesta getRespuestaManifiesto(){
		Respuesta respRet = null;
		
		for(Respuesta respActual : this.getRespuestas()){
			if (respActual.getReferencia("RespuestaTipo") != null
					&& respActual.getReferencia("RespuestaTipo").getValor() != null
					&& respActual.getReferencia("RespuestaTipo").getValor().equalsIgnoreCase("M")){
				respRet = respActual;
			}
		}
		
		return respRet;
	}
	
	/*
	 * Obtiene las respuesta de los conocimientos
	 */
	public ArrayList<Respuesta> getRespuestasConocimientos(RespuestaTipo filtro){
		ArrayList<Respuesta> ret = new ArrayList<DAERespuesta.Respuesta>();
		String filtroStr = "";
		switch(filtro){
		case Conocimientos:
			filtroStr = "C";
			break;
		case Imagenes:
			filtroStr = "I";
			break;
		case Lineas:
			filtroStr = "L";
			break;
		case Asociaciones:
			filtroStr = "A";
			break;
		}
		for (Respuesta respActual : this.getRespuestas()){
			if (respActual.getReferencia("RespuestaTipo").getValor().equalsIgnoreCase(filtroStr)){
				ret.add(respActual);
			}
		}
		return ret;
	}
	
	public static class Respuesta {
		private String tipo;
		private String codigo;
		private String descripcion;
		private String ayuda;
		private ArrayList<Referencia> referencias;
		
		public Respuesta(){
			this.referencias = new ArrayList<DAERespuesta.Respuesta.Referencia>();
		}
		
		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public String getAyuda() {
			return ayuda;
		}

		public void setAyuda(String ayuda) {
			this.ayuda = ayuda;
		}

		public ArrayList<Referencia> getReferencias() {
			return referencias;
		}
		
		public Referencia getReferencia(String codigo){
			Referencia ret = null;
			for (Referencia ref : this.getReferencias()){
				if (ref.getCodigo() != null && ref.getCodigo().equalsIgnoreCase(codigo)){
					ret = ref;
				}
			}
			return ret;
		}

		public void setReferencias(ArrayList<Referencia> referencias) {
			this.referencias = referencias;
		}

		public static class Referencia {
			private String codigo;
			private String valor;
			
			public String getCodigo() {
				return codigo;
			}
			public void setCodigo(String codigo) {
				this.codigo = codigo;
			}
			public String getValor() {
				return valor;
			}
			public void setValor(String valor) {
				this.valor = valor;
			}
			
			
		}
	}

}
