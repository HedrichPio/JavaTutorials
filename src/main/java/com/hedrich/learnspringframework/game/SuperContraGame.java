package com.hedrich.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole{
	public void up() {
		System.out.println("walk forward");
	}
	
	public void down() {
		System.out.println("walk back");
	}
	
	public void left() {
		System.out.println("run");
	}
	
	public void right() {
		System.out.println("shoot");
	}
}
