package com.dev4j.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.dev4j.di.aop.TargetObject;
import com.dev4j.di.atributo.Coche;
import com.dev4j.di.atributo.Motor;
import com.dev4j.di.autowire.AreaCalculatorService;
import com.dev4j.di.lifecycle.ExplicitBean;
import com.dev4j.di.lifecycle.LifeCycleBean;
import com.dev4j.di.profiles.EnvironmentService;
import com.dev4j.di.qualifiers.Animal;
import com.dev4j.di.qualifiers.Avion;
import com.dev4j.di.qualifiers.Nido;
import com.dev4j.di.qualifiers.Pajaro;
import com.dev4j.di.qualifiers.Perro;
import com.dev4j.di.scopes.EjemploScopeService;

@SpringBootApplication

public class DependencyInjectionApplication {

	
	private static final Logger log = LoggerFactory.getLogger(DependencyInjectionApplication.class);
	
	@Bean
	public String getApplicationName() 
	{
		return ("¡NBRONCKNROLL RULES!");
	}
	
//	@Bean(initMethod = "init", destroyMethod = "destroy")
//	public ExplicitBean getBean() {
//			return new ExplicitBean();
//	}

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
		
		
//		============================================================
		
//		SPRING CORE INYECCION DE DEPENDENCIAS QUALIFIERS Y PRIMARY
		
//		Nido bean = context.getBean(Nido.class);
//		bean.imprimir();
		
//		============================================================		
		
//		PERFILES
		
//		EnvironmentService bean2 = context.getBean(EnvironmentService.class);
//		log.info("Active Environment {}", bean2.getEnvironment());
		
//		SCOPES SINGLETON O PROTOTYPE
		
//		EjemploScopeService ejemploScopeService = context.getBean(EjemploScopeService.class);
//		EjemploScopeService ejemploScopeService1 = context.getBean(EjemploScopeService.class);
//		
//		log.info("Are beans equal {}", ejemploScopeService.equals(ejemploScopeService1));
//		log.info("Are beans equal {}", ejemploScopeService1 == ejemploScopeService);

//		DEFINICION DE BEANS DE FORMA EXPLICITA
		
//		String string = context.getBean(String.class);
//		log.info("Application name {}", string);

//		INYECCION DE MULTIPLES OBJETOS
		
//		AreaCalculatorService calculator = context.getBean(AreaCalculatorService.class);
//		log.info("Area total {}", calculator.calcAreas());
		
//  	@Lazy beans		
//		LifeCycleBean bean = context.getBean(LifeCycleBean.class);
		
		TargetObject targetObject = context.getBean(TargetObject.class);
		targetObject.hello("Hello WORLD CON ASPECTOS");
		

	}

}


