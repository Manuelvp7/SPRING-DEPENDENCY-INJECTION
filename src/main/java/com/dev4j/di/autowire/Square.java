package com.dev4j.di.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Square implements Figure{
	@Value("${square.side}")
	private double side;
	@Override
	public double CalculateArea() {
		return side*side;
	}
}
