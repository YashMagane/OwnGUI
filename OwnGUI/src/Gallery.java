import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class Gallery extends Application{

    @Override
    public void start(Stage ps) {
        Label txt = new Label("Gallery");
        FlowPane root = new FlowPane();
        root.getChildren().add(txt);
        Scene scene = new Scene(root);
        ps.setTitle("Gallery");
        ps.setScene(scene);
        ps.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
