package com.example.localstack.data.schema;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CPF {

    @Id
    private String cpf;

    private boolean isValido;

    public CPF(String cpf) {
        this.cpf = cpf;
    }
}
