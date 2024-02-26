import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FXDriver extends Application {
	public static void main(String[] args) {
		launch(args);   
	}
		   
	@Override
	public void start(Stage stage) throws IOException {
		FXMainPane root = new FXMainPane();
		stage.setScene(new Scene(root, 500, 400));
		stage.setTitle("Hello World GUI");
		//display the stage
		stage.show();

	}
}
