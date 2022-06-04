package pl.betiuk.project.service;

import java.util.List;

public interface UserService <T> {

    T findByNick (String nick);

    List<T> findAll();
}
