package org.mock.service;

import org.mock.persistence.entity.Player;

import java.util.List;

public class DataProvider {

    public static List<Player> playerListMock() {
        System.out.println("-> Obteniendo listado Player / Mock");

        return List.of(
                new Player(1L, "Leonel Messi Uno", "Barcelona", "Medio"),
                new Player(2L, "Leonel Messi Dos", "Barcelona", "Medio"),
                new Player(3L, "Leonel Messi Tres", "Barcelona", "Medio"),
                new Player(4L, "Leonel Messi Cuatro", "Barcelona", "Medio"),
                new Player(5L, "Leonel Messi Cinco", "Barcelona", "Medio"),
                new Player(6L, "Leonel Messi Ceis", "Barcelona", "Medio")
        );
    }

    public static Player playerMock(){
        System.out.println("-> Obteniendo un Player / Mock");
            return  new Player(1L, "Leonel Messi Uno", "Barcelona", "Medio");
    }

    public static  Player newPlayerMock(){
        return  new Player(7L, "Leonel Messi Ciete", "Barcelona", "Medio");
    }
}
