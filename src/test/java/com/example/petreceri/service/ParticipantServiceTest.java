package com.example.petreceri.service;

import com.example.petreceri.domain.Muzica;
import com.example.petreceri.domain.Participant;
import com.example.petreceri.repository.MuzicaRepository;
import com.example.petreceri.repository.ParticipantRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ParticipantServiceTest {
    @Mock
    private ParticipantRepository participantRepository;
    @InjectMocks
    private ParticipantService participantService;

    @Test
    @DisplayName("Create participant")
    void create(){

        Participant participant = new Participant();
        participant.setNume("Catalin");
        Participant savedParticipant = new Participant(1L,"Zidaru","Catalin",52);

        when(participantRepository.save(participant)).thenReturn(savedParticipant);

        Participant result = participantService.createParticipant(participant);

        assertNotNull(result);
        assertEquals(savedParticipant.getId(), result.getId());

    }
}
