public class CadastroCSV {

    public String gerarCabecalho() {
        StringBuilder cabecalho = new StringBuilder();
        cabecalho.append("NOME | ");
        cabecalho.append("CPF | ");
        cabecalho.append("DATA NASCIMENTO | ");
        cabecalho.append("SEXO | ");
        cabecalho.append("LOGADOURO | ");
        cabecalho.append("NUMERO | ");
        cabecalho.append("COMPLEMENTO | ");
        cabecalho.append("BAIRRO | ");
        cabecalho.append("CIDADE | ");
        cabecalho.append("ESTADO | ");
        cabecalho.append("SIGLA | ");
        cabecalho.append("E-MAIL | ");
        cabecalho.append("TELEFONE | ");
        cabecalho.append("CELULAR | ");
        cabecalho.append("WHATSAPP | ");
        cabecalho.append("PROFISSAO | ");
        cabecalho.append("EMPRESA | ");
        cabecalho.append("SALARIO | ");
        cabecalho.append("EMPREGO ATUAL | ");
        cabecalho.append("PRETENSAO SALARIAL MINIMA | ");
        cabecalho.append("PRETENSAO SALARIAL MAXIMA | ");
        cabecalho.append("HABILIDADES").append("\n");

        return String.valueOf(cabecalho);
    }

    public String criarCadastro(CadastroExperiencia cadastroExperiencia) {
        StringBuilder cadastroCSV = new StringBuilder();
        cadastroCSV.append(cadastroExperiencia.getCadastro().getNome()).append(";");
        cadastroCSV.append(cadastroExperiencia.getCadastro().getCpf()).append(";");
        cadastroCSV.append(cadastroExperiencia.getCadastro().getDataNascimento()).append(";");
        cadastroCSV.append(cadastroExperiencia.getCadastro().getSexo()).append(";");
        cadastroCSV.append(cadastroExperiencia.getCadastro().getEndereco().getLogradouro()).append(";");
        cadastroCSV.append(cadastroExperiencia.getCadastro().getEndereco().getNumero()).append(";");
        cadastroCSV.append(cadastroExperiencia.getCadastro().getEndereco().getComplemento()).append(";");
        cadastroCSV.append(cadastroExperiencia.getCadastro().getEndereco().getBairro()).append(";");
        cadastroCSV.append(cadastroExperiencia.getCadastro().getEndereco().getCidade().getNome()).append(";");
        cadastroCSV.append(cadastroExperiencia.getCadastro().getEndereco().getCidade().getEstado()).append(";");
        cadastroCSV.append(cadastroExperiencia.getCadastro().getEndereco().getCidade().getSigla()).append(";");
        cadastroCSV.append(cadastroExperiencia.getCadastro().getEmail()).append(";");
        cadastroCSV.append(cadastroExperiencia.getCadastro().getTelefone()).append(";");
        cadastroCSV.append(cadastroExperiencia.getCadastro().getCelular().getNumero()).append(";");
        cadastroCSV.append(cadastroExperiencia.getCadastro().getCelular().isWhatsApp()).append(";");
        cadastroCSV.append(cadastroExperiencia.getCadastro().getProfissao().getNome()).append(";");
        cadastroCSV.append(cadastroExperiencia.getEmpresa().getNome()).append(";");
        cadastroCSV.append(cadastroExperiencia.getSalario()).append(";");
        cadastroCSV.append(cadastroExperiencia.isEmpregoAtual()).append(";");
        cadastroCSV.append(cadastroExperiencia.getCadastro().getPretencaoSalarial().getValorMinimo()).append(";");
        cadastroCSV.append(cadastroExperiencia.getCadastro().getPretencaoSalarial().getValorMaximo()).append(";");
        cadastroCSV.append(cadastroExperiencia.getCadastro().getHabilidade().getHabilidades()).append(";");

        return String.valueOf(cadastroCSV);

    }

}
