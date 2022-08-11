package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
//        userDaoHibernate.createUsersTable();
//       userDaoHibernate.saveUser("Name1", "LastName1", (byte) 20);
//       userDaoHibernate.saveUser("Name2", "LastName2", (byte) 25);
//        userDaoHibernate.removeUserById(1);
//        userDaoHibernate.getAllUsers();
//        userDaoHibernate.cleanUsersTable();
//        userDaoHibernate.dropUsersTable();
//        Util.getConnection();
//
        UserServiceImpl userService = new UserServiceImpl();
//
//       userService.saveUser("Name1", "LastName1", (byte) 20);
//        userService.saveUser("Name2", "LastName2", (byte) 25);
//        userService.saveUser("Name3", "LastName3", (byte) 31);
//        userService.saveUser("Name4", "LastName4", (byte) 38);
//
//        userService.getAllUsers();


//       userService.dropUsersTable();

    }
}
