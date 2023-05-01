package web.service;

import org.springframework.stereotype.Component;
import web.dao.UserDao;
import web.dao.UserDaoImp;
import web.model.User;

import java.util.List;

@Component
public class UserServiceImp implements UserService {

    private UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    public void saveUsers(User user) {
        userDao.saveUsers(user);
    }

    @Override
    public User getUser(int id) {
        return userDao.getUser(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }
}
