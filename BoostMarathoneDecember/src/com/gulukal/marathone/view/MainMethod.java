package com.gulukal.marathone.view;

import java.io.IOException;
import java.util.ArrayList;

import com.gulukal.marathone.controller.AdminController;
import com.gulukal.marathone.controller.CdEntityController;
import com.gulukal.marathone.controller.OrderController;
import com.gulukal.marathone.controller.RecordController;
import com.gulukal.marathone.controller.SingerController;
import com.gulukal.marathone.controller.UserController;
import com.gulukal.marathone.entity.record.CdEntity;
import com.gulukal.marathone.entity.record.SingerEntity;

public class MainMethod {

	UserController userController = new UserController();

	SingerController singerController = new SingerController();

	RecordController recordController = new RecordController();

	protected void createUserTest() {

		userController.createUser();

	}

	protected void loginUserTest() {

		userController.userLoginCheck();

	}

	protected void createRecordTest() throws IOException {

		recordController.createRecord();

	}

	protected void createSingerTest() {

		singerController.createSinger();

	}

	protected void createOrderTest() {

		OrderController orderController = new OrderController();

		orderController.creteOrder();
	}

	protected void listSinger() {

		ArrayList<SingerEntity> arrayList = new ArrayList<>();

		arrayList = singerController.list();

		for (int i = 0; i < arrayList.size(); i++) {

			System.out.println(arrayList.get(i));

		}

	}

	protected void adminLogin() {

		AdminController adminController = new AdminController();

		adminController.adminLogin();

	}

	protected void listRecord() {

		CdEntityController controller = new CdEntityController();

		ArrayList<CdEntity> arrayList = new ArrayList<>();

		arrayList = controller.list();

		for (int i = 0; i < arrayList.size(); i++) {

			System.out.println(arrayList.get(i));

		}

	}

	public void listSaleRecord() {

		CdEntityController controller = new CdEntityController();

		ArrayList<CdEntity> arrayList = new ArrayList<>();

		arrayList = controller.listSale();

		for (int i = 0; i < arrayList.size(); i++) {

			System.out.println(arrayList.get(i));

		}
	}
}
