import java.time.LocalDate;

public class CadastroExperiencia {
    private Integer id;
    private Double salario;
    private boolean empregoAtual;
    private LocalDate dataContratacao;
    private LocalDate dataDesligamento;
    private Empresa empresa = new Empresa();
    private RegimeContratacao regimeContratacao;
    private Profissao profissao = new Profissao();
    private Cadastro cadastro = new Cadastro();

    public CadastroExperiencia() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public boolean isEmpregoAtual() {
        return empregoAtual;
    }

    public void setEmpregoAtual(boolean empregoAtual) {
        this.empregoAtual = empregoAtual;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public LocalDate getDataDesligamento() {
        return dataDesligamento;
    }

    public void setDataDesligamento(LocalDate dataDesligamento) {
        this.dataDesligamento = dataDesligamento;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public RegimeContratacao getRegimeContratacao() {
        return regimeContratacao;
    }

    public void setRegimeContratacao(RegimeContratacao regimeContratacao) {
        this.regimeContratacao = regimeContratacao;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }

}
