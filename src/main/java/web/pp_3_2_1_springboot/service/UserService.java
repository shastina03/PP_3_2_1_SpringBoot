package web.pp_3_2_1_springboot.service;

import web.pp_3_2_1_springboot.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(int id);
    public void deleteUser(int id);

}
