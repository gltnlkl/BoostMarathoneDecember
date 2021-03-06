package com.gulukal.marathone.controller;

import java.util.List;

import javax.persistence.TypedQuery;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.gulukal.marathone.entity.user.Name;
import com.gulukal.marathone.entity.user.UserEntity;

public class UserController implements Controllable<UserEntity>, Sessionable {

	private static final Logger logger = LogManager.getLogger(UserController.class);

	@Override
	public void create(UserEntity entity) {
		try {
			Session session = databaseConnectionHibernate();
			session.getTransaction().begin();
			session.persist(entity);
			session.getTransaction().commit();
			logger.info("ekleme tamamdir" + UserController.class);
		}
		catch (Exception e) {
			logger.error("ekleme aninda hata meydana geldi !!!!! " + UserController.class);
			e.printStackTrace();
		}

	}

	@Override
	public void delete(UserEntity entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(UserEntity entity) {
		// TODO Auto-generated method stub

	}

	public void checkUserLogin(UserEntity entity) {

		logger.info(" - LOGIN TRY NUMBER ONE -  ");

		Session session = databaseConnectionHibernate();

		String hql = "select t from UserEntity as t where t.mail =:key1 and t.password =:key2";

		TypedQuery<UserEntity> typedQuery = session.createQuery(hql, UserEntity.class);


		List<UserEntity> user = typedQuery.getResultList();

		logger.info("List: " + UserEntity.class);

		if (user.size() < 1) {

			logger.info(" - Login is Successful ");

		}
		else {

			logger.warn(" - Login failed");

		}

	}

	public void createUser() {

		UserEntity userEntity1 = new UserEntity("mail1@mail.com", new Name("Gulten", "Ulukal"), "123",
				"Kadikoy - Istanbul", 01234);

		UserEntity userEntity2 = new UserEntity("mail2@mail.com", new Name("Ozgur", "Yonkuc"), "123",
				"Kadikoy - Istanbul", 01234);

		UserEntity userEntity3 = new UserEntity("mail3@mail.com", new Name("Deniz", "Yonkuc"), "123",
				"Kadikoy - Istanbul", 01234);

		create(userEntity1);
		create(userEntity2);
		create(userEntity3);
	}

	public void userLoginCheck() {

		UserEntity user = new UserEntity("mail1@mail.com", "123");

		checkUserLogin(user);

	}

	
}
