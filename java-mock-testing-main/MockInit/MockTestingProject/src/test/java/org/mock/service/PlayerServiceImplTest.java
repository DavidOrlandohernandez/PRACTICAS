package org.mock.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mock.persistence.entity.Player;
import org.mock.persistence.entity.repository.PlayerRepositoryImpl;
import org.mock.persistence.entity.service.PlayerServiceImpl;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.xml.crypto.Data;
import java.util.List;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class PlayerServiceImplTest {

   /* @Test
    public void testFindAll(){
        //Given
        PlayerRepositoryImpl playerRepository = new PlayerRepositoryImpl();
        PlayerServiceImpl  playerService = new PlayerServiceImpl(playerRepository);

        //When
        List<Player> result = playerService.findAll();

        //Then
        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals("Leonel Messi Uno", result.get(0).getName());
    }*/

    @Mock
    private PlayerRepositoryImpl playerRepository;
    @InjectMocks
    private PlayerServiceImpl  playerService;

    @BeforeEach //Es una forma de inicializar loos mocks
    void init(){
        //MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testFindAll(){
        //Given

        //When
        when(playerRepository.findAll()).thenReturn(DataProvider.playerListMock());
        List<Player> result = playerService.findAll();

        //Then
        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals("Leonel Messi Uno", result.get(0).getName());
        verify(this.playerRepository).findAll();
    }

    @Test
    public void testFinById(){

        //Given
        Long id = 1L;

        //When
        when(this.playerRepository.findById(anyLong())).thenReturn(DataProvider.playerMock());
        Player player = this.playerService.findById(id);

        //Then
        assertNotNull(player);
        assertEquals("Leonel Messi Uno", player.getName());
        verify(this.playerRepository, times(1)).findById(anyLong()); // El verify solo se utiliza con la dependencia
    }

    @Test
    public void testSave(){
        //Given
        Player player = DataProvider.newPlayerMock();
        //When
        this.playerService.save(player);
        //Then
        ArgumentCaptor<Player> playerArgumentCaptor = ArgumentCaptor.forClass(Player.class);
        verify(this.playerRepository).save(any(Player.class));
        verify(this.playerRepository).save(playerArgumentCaptor.capture());
        assertEquals(7L, playerArgumentCaptor.getValue().getId());
        assertEquals("Leonel Messi Ciete", playerArgumentCaptor.getValue().getName());
    }

    @Test
    public void testDeleteById(){
        //Given
        Long id = 1L;
        //When
        this.playerService.delteById(id);
        //Then
        ArgumentCaptor<Long> longArgumentCaptor = ArgumentCaptor.forClass(Long.class);
        verify(this.playerRepository).delteById(anyLong());
        verify(this.playerRepository).delteById(longArgumentCaptor.capture());
        assertEquals(1L, longArgumentCaptor.getValue());

    }

}
