package org.mock;

import org.mock.persistence.entity.repository.PlayerRepositoryImpl;
import org.mock.persistence.entity.service.PlayerServiceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PlayerRepositoryImpl playerRepository = new PlayerRepositoryImpl();
        PlayerServiceImpl playerService = new PlayerServiceImpl(playerRepository);

        //System.out.println(playerService.findAll());
        //System.out.println(playerService.findById(1L));

        //playerService.delteById(1L);
        //System.out.println(playerService.findAll());

        //playerService.save(new Player(7L, "Leonel Messi ciete", "Barcelona", "Medio"));
        System.out.println(playerService.findAll());
    }

}