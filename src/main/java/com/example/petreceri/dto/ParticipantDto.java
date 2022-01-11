package com.example.petreceri.dto;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.Size;

public class ParticipantDto {
    @NotNull
    private String nume;

    @NotNull
    private String prenume;

    @Size(min = 16, max = 100)
    private Integer varsta;

    public ParticipantDto(){

    }
    public ParticipantDto(String nume, String prenume, @Size(min = 16, max = 100) Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }
}
