package org.ibandorta.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import org.ibandorta.java.jdbc.models.Producto;
import org.ibandorta.java.jdbc.repositorio.ProductoImpl;
import org.ibandorta.java.jdbc.repositorio.Repositorio;
import org.ibandorta.java.jdbc.util.ConexionBaseDatos;

public class EjemploJdbc {

	public static void main(String[] args) {



		try (Connection	conn = ConexionBaseDatos.getInstance()) {


		Repositorio<Producto>repositorio = new ProductoImpl();
		System.out.println("=============listar================");
		repositorio.listar().forEach(System.out::println);
		
		System.out.println("=============Obtener por id================");
		System.out.println(repositorio.porId(2L));
		
		
		System.out.println("=============Insertar nuevo producto================");
		Producto producto = new Producto();
		producto.setNombre("teclado mecánico");
		producto.setPrecio(500);
		producto.setFechaRegistro(new Date());
		repositorio.guardar(producto);		
		System.out.println("Producto guardado con éxito!!!!!!!");
		repositorio.listar().forEach(System.out::println);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
