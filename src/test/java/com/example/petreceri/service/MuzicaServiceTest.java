package com.example.petreceri.service;

import com.example.petreceri.domain.Meniu;
import com.example.petreceri.domain.Muzica;
import com.example.petreceri.repository.MeniuRepository;
import com.example.petreceri.repository.MuzicaRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MuzicaServiceTest {
    @Mock
    private MuzicaRepository muzicaRepository;
    @Mock
    private EvenimentService evenimentService;
    @InjectMocks
    private MuzicaService muzicaService;

    @Test
    @DisplayName("Create muzica")
    void create(){

        Muzica muzica = new Muzica();
        muzica.setTip("rock");
        Muzica savedMuzica = new Muzica(1L,"rock","formatie",6);

        when(muzicaRepository.save(muzica)).thenReturn(savedMuzica);

        Muzica result = muzicaService.createMuzica(muzica);

        assertNotNull(result);
        assertEquals(savedMuzica.getId(), result.getId());

    }
    @Test
    @DisplayName("Arata Gen Muzica")
    void arata(){

        String tip="rock";
        List<Muzica> savedList=new ArrayList<Muzica>();
        savedList.add( new Muzica(1L,"rock","formatie",3));
        when(muzicaRepository.arataMuzicaDupaGen(tip)).thenReturn(savedList);

        List<Muzica> result = muzicaService.arataMuzicaDupaStil(tip);

        assertNotNull(result);
        assertEquals(savedList, result);

    }
}
