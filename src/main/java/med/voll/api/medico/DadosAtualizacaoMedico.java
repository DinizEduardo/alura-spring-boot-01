package med.voll.api.medico;

import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        String telefone,
        String nome,
        DadosEndereco endereco
) {
}
