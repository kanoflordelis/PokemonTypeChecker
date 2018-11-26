package sample;

import contoller.PokemonContoller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import model.Pokemon;

import java.io.IOException;

public class Main extends Application {
    Pokemon pokemon = new Pokemon();
    PokemonContoller pokemonContoller = new PokemonContoller();

    @Override
    public void start(Stage primaryStage) throws IOException {
//        Group root = new Group();
        FXMLLoader fxml = new FXMLLoader(getClass().getResource("test2.fxml"));
        Parent root = fxml.load();
        Scene scene = new Scene(root, 640, 480);
        primaryStage.setScene(scene);
        primaryStage.show();
        scene.getStylesheets().add(
                getClass().getResource("style.css").toExternalForm());


//        HBox hbox = new HBox();
//        hbox.setAlignment(Pos.CENTER);
//
//        Button button = new Button("Button");
//        Label label = new Label("Enter Pokemon Name");
//        TextField textField = new TextField();
//
//        button.setOnAction((event) -> {
//            label.setText("");
//            pokemon = pokemonContoller.serch(textField.getText());
//            label.setText(
//                    pokemon.getName() + "\n" +
//                    pokemon.getImage() + "\n" +
//                    pokemon.getType1() + "\n" +
//                    pokemon.getType2() + "\n" +
//                    pokemon.getRoar());
//        });
//
//        hbox.getChildren().add(button);
//        hbox.getChildren().add(textField);
//        hbox.getChildren().add(label);
//
//        ((Group) scene.getRoot()).getChildren().add(hbox);
//
//        primaryStage.setTitle("Button Test");
//        primaryStage.setScene(scene);
//        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
