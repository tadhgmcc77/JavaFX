package com.example.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;


public class Main extends Application {
    Registration validate = new Registration();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("User Registration");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Welcome");
        grid.add(scenetitle, 0, 0, 2, 1);

        Label email = new Label("email:");
        grid.add(email, 0, 1);

        TextField emailTextField = new TextField();
        grid.add(emailTextField, 1, 1);

        Label password = new Label("Password:");
        grid.add(password, 0, 2);

        PasswordField passBox = new PasswordField();
        grid.add(passBox, 1, 2);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                String email = emailTextField.getText();
                String password = passBox.getText();;
                String output_message = "";

                if (validate.emailValidate(email)) {
                    output_message += "Email Address Invalid ";
                }
                if (validate.passwordValidate(password)) {
                    output_message += " Password Invalid";
                }

                actiontarget.setText(output_message);
            }
        });

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);

        primaryStage.show();
    }



    public static void main(String[] args) {
        launch();
    }

}





