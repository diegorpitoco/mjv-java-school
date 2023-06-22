import java.time.LocalDate;

public class Cadastro {

    private Integer id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String email;
    private Long telefone;
    private Sexo sexo;
    private Habilidade habilidade = new Habilidade();
    private Celular celular = new Celular();
    private PretencaoSalarial pretencaoSalarial = new PretencaoSalarial();
    private Profissao profissao = new Profissao();
    private Endereco endereco = new Endereco();

    public Cadastro() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Habilidade getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(Habilidade habilidade) {
        this.habilidade = habilidade;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public PretencaoSalarial getPretencaoSalarial() {
        return pretencaoSalarial;
    }

    public void setPretencaoSalarial(PretencaoSalarial pretencaoSalarial) {
        this.pretencaoSalarial = pretencaoSalarial;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}