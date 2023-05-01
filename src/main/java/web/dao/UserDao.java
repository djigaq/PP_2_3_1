package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    List<User> getUsers();

    void saveUsers(User user);

    User getUser(int Id);

    void updateUser(User user);

    void deleteUser(int Id);
}
