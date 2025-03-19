package org.mock.persistence.entity.repository;

import org.mock.persistence.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerRepositoryImpl implements IPlayerRepository{

    private List<Player> playerDatabe = new ArrayList<>(List.of(
            new Player(1L, "Leonel Messi Uno", "Barcelona", "Medio"),
            new Player(2L, "Leonel Messi Dos", "Barcelona", "Medio"),
            new Player(3L, "Leonel Messi Tres", "Barcelona", "Medio"),
            new Player(4L, "Leonel Messi Cuatro", "Barcelona", "Medio"),
            new Player(5L, "Leonel Messi Cinco", "Barcelona", "Medio"),
            new Player(6L, "Leonel Messi Ceis", "Barcelona", "Medio")
    ));

    //private List<Player> playerDatabe = new ArrayList<>();

    @Override
    public List<Player> findAll() {
        System.out.println("---> Metodo findAll real !!!");
        return this.playerDatabe;
    }

    @Override
    public Player findById(Long id) {
        System.out.println("---> Metodo findById real !!!");
        return this.playerDatabe.stream()
                .filter(player -> player.getId() == id)
                .findFirst()
                .orElseThrow();
    }

    @Override
    public void save(Player player) {
        System.out.println("---> Metodo save real !!!");
        this.playerDatabe.add(player);
    }

    @Override
    public void delteById(Long id) {
        System.out.println("---> Metodo delteById real !!!");
        this.playerDatabe =  this.playerDatabe.stream()
                .filter(player -> player.getId() != id)
                .toList();
    }
}
