//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Controlador;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Operaciones extends Application {
    public Operaciones() {
    }

    public void start(Stage stage) {
        try {
            Parent root = (Parent)FXMLLoader.load(Operaciones.class.getResource("/Vista/vistaOperaciones.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException var4) {
            System.out.println(var4);
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}

