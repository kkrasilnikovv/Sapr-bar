package kkrasilnikovv.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import kkrasilnikovv.preprocessor.model.SavingFile;
import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.IOException;

public class Main extends Application {
    private static Stage showsScene;
    private static Scene mainScene;
    @Setter
    @Getter
    private static File dataFile;
    @Setter
    @Getter
    private static SavingFile dataGSONFile;

    @Override
    public void start(Stage primaryStage) throws IOException {
        showsScene = primaryStage;
        Parent root = FXMLLoader.load(ClassLoader.getSystemResource("main.fxml"));
        showsScene.setTitle("САПР");
        mainScene = new Scene(root, 800, 600);
        showsScene.setScene(mainScene);
        showsScene.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void showScene(Scene scene) {
        showsScene.setScene(scene);
    }
    public static void showMainScene(){
        showsScene.setScene(mainScene);
    }
}