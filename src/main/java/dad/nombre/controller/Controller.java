package dad.nombre.controller;

import dad.nombre.model.Model;
import dad.nombre.view.View;

public class Controller {

	Model model=new Model();
	View view=new View();
	
	public Controller() {
		
	}
	
	public View getView() {
		return this.view;
	}
}
