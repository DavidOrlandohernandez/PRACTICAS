package org.mock.persistence.entity.service;

import org.mock.persistence.entity.Player;

import java.util.List;

public interface IPlayerService {

    List<Player> findAll();
    Player findById(Long id);
    void save(Player player);
    void delteById(Long id);
}
