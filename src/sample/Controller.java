package sample;

import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class Controller {
    @FXML private TextFlow terminal;

    @FXML void onActionHello(){
        Text text = new Text("Hello");
        text.setFill(Color.RED);
        terminal.getChildren().add(text);
    }

    @FXML void onActionBye(){
        Text text = new Text("Bye");
        text.setFill(Color.BLUE);
        terminal.getChildren().add(text);
    }
}
