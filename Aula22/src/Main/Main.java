package Main;

import Classes.Automovel;
import Classes.Chevrolet;
import Classes.Ford;
import Classes.Tesla;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("=-=-== Automovel 1 =-=-=-=");
		Automovel c = new Ford();
		c.setMarca("Ford");
		c.setModelo("Fiesta 2001");
		c.setValor(15000d);
		System.out.println(" Som do carro: "+c.Som());
		System.out.println(" Som da buzina: "+c.buzina());
		System.out.println(" Modelo do pneu: "+c.pneu());
		System.out.println(" Modelo do carro: "+c.getModelo());
		
		
		System.out.println(" ");
		
		System.out.println("=-=-== Automovel 2 =-=-=-=");
		
		Automovel x = new Chevrolet();
		x.setMarca("Chevrolet");
		x.setModelo("Onix 2010");
		x.setValor(10000d);
		System.out.println(" Som do carro: "+x.Som());
		System.out.println(" Som da buzina: "+x.buzina());
		System.out.println(" Modelo do pneu: "+x.pneu());
		System.out.println(" Modelo do carro: "+x.getModelo());
		
		
		System.out.println(" ");
		
		System.out.println("=-=-== Automovel 3 =-=-=-=");
		
		Automovel t = new Tesla();
		t.setMarca("Tesla");
		t.setModelo("Model S");
		t.setValor(150000d);
		System.out.println(" Som da buzina: "+t.buzina());
		System.out.println(" Som do carro: "+t.Som());
		System.out.println(" Modelo do pneu: "+t.pneu());
		System.out.println(" Modelo do carro: "+t.getModelo());
		
		

	}

}
