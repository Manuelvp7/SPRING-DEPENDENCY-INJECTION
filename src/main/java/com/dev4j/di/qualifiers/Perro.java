/**
 * 
 */
package com.dev4j.di.qualifiers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author manuel
 *
 */

@Component

public class Perro extends Animal{

	public Perro(@Value("1") Integer edad, @Value("Rocky") String nombre) {
		super(edad, nombre);
		// TODO Auto-generated constructor stub
	}

}
