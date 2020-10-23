package dad.nombre.app;

import dad.nombre.controller.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

	Controller controller=new Controller();
	@Override
	public void start(Stage primaryStage) throws Exception {

		Scene scene=new Scene(controller.getView(),320,200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Cambio de divisa MVC");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
