package com.revature.beanz;

public class Tree {
	
	private String species;
	private int height;
	private int age;
	private Leaf fall;
	
	public Tree(){

	}
	
	public Tree(String species, int height, int age, Leaf fall) {
		this.species=species;
		this.height=height;
		this.age=age;
		this.fall=fall;
			
	}
	
	
	@Override
	public String toString() {
		return "Tree [species=" + species + ", height=" + height + ", age=" + age + ", fall=" + fall + "]";
	}

	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Leaf getFall() {
		return fall;
	}
	public void setFall(Leaf fall) {
		this.fall = fall;
	}
	
	
	
	
		
	

}
