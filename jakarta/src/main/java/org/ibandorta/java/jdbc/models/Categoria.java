package org.ibandorta.java.jdbc.models;

public class Categoria {
	
	  private Long id;
	    private String nombre;

	    public Long getId() {
	        return id;
	    }

	    public Categoria(String nombre) {
			super();
			this.nombre = nombre;
		}

		public Categoria() {
			super();
			// TODO Auto-generated constructor stub
		}

		public void setId(Long id) {
	        this.id = id;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	
	
	
}
