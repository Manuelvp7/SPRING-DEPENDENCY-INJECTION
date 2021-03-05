/**
 * 
 */
package com.dev4j.di.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author manuel
 *
 */

@Component
@Primary
public class Pajaro extends Animal implements Volador {

	private static final Logger log = LoggerFactory.getLogger(Pajaro.class);

	public Pajaro(@Value("1") Integer edad, @Value("Pajaro Loco")String nombre) {
		super(edad, nombre);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void volar() {

		log.info("Soy un pajaro y estoy volando");

	}

}
