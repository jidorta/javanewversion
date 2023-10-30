package org.ibandorta.java.jdbc;

import java.sql.Connection;

import java.sql.SQLException;



import org.ibandorta.java.jdbc.models.Producto;
import org.ibandorta.java.jdbc.repositorio.ProductoImpl;
import org.ibandorta.java.jdbc.repositorio.Repositorio;
import org.ibandorta.java.jdbc.util.ConexionBaseDatos;

public class EjemploJdbcDelete {

	public static void main(String[] args) {



		try (Connection	conn = ConexionBaseDatos.getInstance()) {


		Repositorio<Producto>repositorio = new ProductoImpl();
		System.out.println("=============listar================");
		repositorio.listar().forEach(System.out::println);
		
		System.out.println("=============Obtener por id================");
		System.out.println(repositorio.porId(2L));
		
		
		System.out.println("=============Editar nuevo producto================");
		Producto producto = new Producto();
		producto.setId(3L);
		producto.setNombre("teclado Razer");
		producto.setPrecio(700);
		repositorio.guardar(producto);		
		System.out.println("Producto editado con éxito!!!!!!!");
		repositorio.listar().forEach(System.out::println);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
