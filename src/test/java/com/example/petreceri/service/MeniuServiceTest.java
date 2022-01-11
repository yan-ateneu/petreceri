package com.example.petreceri.service;

import com.example.petreceri.domain.Meniu;
import com.example.petreceri.repository.MeniuRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MeniuServiceTest {
    @Mock
    private MeniuRepository meniuRepository;
    @InjectMocks
    private MeniuService meniuService;

    @Test
    @DisplayName("Create meniu")
    void create(){

        Meniu meniu = new Meniu();
        meniu.setTip("vegan");
        Meniu savedMeniu = new Meniu(1L,"vegetarian",Boolean.FALSE,123);

        when(meniuRepository.save(meniu)).thenReturn(savedMeniu);

        Meniu result = meniuService.createMeniu(meniu);

        assertNotNull(result);
        assertEquals(savedMeniu.getId(), result.getId());

    }

}
