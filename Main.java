import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CadastroExperiencia cadastroExperiencia = new CadastroExperiencia();

        cadastroExperiencia.getCadastro().setNome("Diego Reis");
        cadastroExperiencia.getCadastro().setCpf("111.222.333-44");
        cadastroExperiencia.getCadastro().setDataNascimento(LocalDate.of(1987, 8, 17));
        cadastroExperiencia.getCadastro().setSexo(Sexo.MASCULINO);
        cadastroExperiencia.getCadastro().getEndereco().setLogradouro("Rua Cel Âncora");
        cadastroExperiencia.getCadastro().getEndereco().setNumero(20L);
        cadastroExperiencia.getCadastro().getEndereco().setComplemento("Lote 7, Quadra D");
        cadastroExperiencia.getCadastro().getEndereco().setBairro("Campo Grande");
        cadastroExperiencia.getCadastro().getEndereco().getCidade().setNome("Maravilhosa");
        cadastroExperiencia.getCadastro().getEndereco().getCidade().setEstado("Rio de Janeiro");
        cadastroExperiencia.getCadastro().getEndereco().getCidade().setSigla("RJ");
        cadastroExperiencia.getCadastro().setEmail("diegoreis@click21.com.br");
        cadastroExperiencia.getCadastro().setTelefone(123456789L);
        cadastroExperiencia.getCadastro().getCelular().setNumero(987654321L);
        cadastroExperiencia.getCadastro().getCelular().setWhatsApp(true);
        cadastroExperiencia.getProfissao().setNome("Desenvolvedor de Software");
        cadastroExperiencia.getEmpresa().setNome("MJV");
        cadastroExperiencia.setSalario(5200.00);
        cadastroExperiencia.setEmpregoAtual(true);
        cadastroExperiencia.getCadastro().getPretencaoSalarial().setValorMinimo(5210.00);
        cadastroExperiencia.getCadastro().getPretencaoSalarial().setValorMaximo(15000.00);
        List<String> listaHabilidades = new ArrayList();
        listaHabilidades.add("Desenvolvedor");
        listaHabilidades.add("Comunicação");
        cadastroExperiencia.getCadastro().getHabilidade().setHabilidades(String.valueOf(listaHabilidades));

        System.out.println();

        CadastroCSV criar = new CadastroCSV();
        String path = "C:\\Users\\Diego Pitoco\\Documents\\ProjetoJava\\ProjetoMJV\\ProjetoContaBancaria";
        Path localArquivo = Paths.get(path, "cadastro.csv");
        try {
            String cabecalho = criar.gerarCabecalho();
            String conteudo = criar.criarCadastro(cadastroExperiencia);
            Files.write(localArquivo, cabecalho.getBytes(StandardCharsets.UTF_8),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
            Files.write(localArquivo, conteudo.getBytes(StandardCharsets.UTF_8),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);

        } catch (Exception e) {
            System.err.println("Erro encontrado*: " + e);
        }

    }
}
