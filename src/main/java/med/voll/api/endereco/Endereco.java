package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String complemento;
    private String numero;

    public Endereco(DadosEndereco endereco) {
        this.logradouro = endereco.logradouro();
        this.bairro = endereco.bairro();
        this.cep = endereco.cep();
        this.cidade = endereco.cidade();
        this.uf = endereco.uf();
        this.complemento = endereco.complemento();
        this.numero = endereco.numero();
    }

    public void atualizarInformacoes(DadosEndereco endereco) {
        this.logradouro = endereco.logradouro() != null ? endereco.logradouro() : this.logradouro;
        this.bairro = endereco.bairro() != null ? endereco.bairro() : this.bairro;
        this.cep = endereco.cep() != null ? endereco.cep() : this.cep;
        this.cidade = endereco.cidade() != null ? endereco.cidade() : this.cidade;
        this.uf = endereco.uf() != null ? endereco.uf() : this.uf;
        this.complemento = endereco.complemento() != null ? endereco.complemento() : this.complemento;
        this.numero = endereco.numero() != null ? endereco.numero() : this.numero;
    }
}
