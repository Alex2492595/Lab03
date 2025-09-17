//https://github.com/Alex2492595/Lab03

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab03;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Alexander Nikopoulos
 * Lab 03
 * 17/09/2025
 */
public class Lab03 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        GridPane gp = new GridPane();
        
        gp.setHgap(10);
        gp.setVgap(10);
        gp.setPadding(new Insets(25, 0, 0, 25));
        root.setCenter(gp);
        
        Label firstName = new Label("First Name: ");
        TextField firstTF = new TextField();
        gp.add(firstName, 0, 0);
        gp.add(firstTF, 1, 0);
        
        Label lastName = new Label("Last Name: ");
        TextField lastTF = new TextField();
        gp.add(lastName, 0, 1);
        gp.add(lastTF, 1, 1);
        
        Label email = new Label("Email: ");
        TextField emailTF = new TextField();
        gp.add(email, 0, 2);
        gp.add(emailTF, 1, 2);
        
        Label password = new Label("Password: ");
        PasswordField passwordTF = new PasswordField();
        gp.add(password, 0, 3);
        gp.add(passwordTF, 1, 3);
        
        Button registerBtn = new Button("Register");
        Button clearBtn = new Button("Clear");
        gp.add(registerBtn, 0, 4);
        gp.add(clearBtn, 1, 4);
        
        registerBtn.setDisable(true);
        
        Scene scene = new Scene(root, 400, 300);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("User Registration Form");
        primaryStage.show();
    }
    
}
