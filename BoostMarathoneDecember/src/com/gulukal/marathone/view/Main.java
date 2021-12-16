package com.gulukal.marathone.view;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

	public static Stage primaryStage;

	public static void main(String[] args) throws IOException {

		MainMethod mainMethod = new MainMethod();

		// LUTFEN TEST METHODDLARINI BELIRTILEN SIRA ILE ACIP KAPAYARAK DENEYINIZ.
		// TESEKKURLER
		
		
		mainMethod.adminLogin(); // test admin login with existing admin name and
		// password

		// mainMethod.createUserTest(); // test creating user in database with all
		// tables

		// mainMethod.loginUserTest(); // test the login User

		// mainMethod.loginAdminTest(); // test the login Admin

		// mainMethod.createRecordTest(); // test creating new record in database

		// mainMethod.createSingerTest(); // test creating new singer in database

		// mainMethod.createOrderTest(); // test creating new order in database

		// mainMethod.listSinger(); // test listing 5 singers if exist

		// mainMethod.listRecord(); // test listing 5 records which is on sale if exist
		// // large object hatasi
		// veriyor yukledigim fotograflari okumuyor. Lutfen yuklenen bloblari silerek
		// tekrar deneyiniz

		// mainMethod.listSaleRecord();// test listing 5 records which is on sale if exist
		// // large object hatasi
		// veriyor yukledigim fotograflari okumuyor. Lutfen yuklenen bloblari silerek
		// tekrar deneyiniz

		launch(args);
	}

	@Override

	public void start(Stage primary) throws Exception {

		try {
			Main.primaryStage = primary;
			BorderPane root  = (BorderPane) FXMLLoader.load(getClass().getResource("MainView.fxml"));
			Scene      scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primary.setScene(scene);
			primary.alwaysOnTopProperty();
			primary.centerOnScreen();
			primary.initStyle(StageStyle.UNDECORATED);
			primary.setResizable(false);
			primary.show();

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Stage getPrimaryStage() {
		return Main.primaryStage;
	}

}