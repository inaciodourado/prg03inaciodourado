import java.time.LocalDateTime;

public class Usuario {

    private Long id;
    private PerfilUsuario perfil;
    private String nome;
    private String email;
    private String senha;
    private LocalDateTime ultimoLogin;
    private Boolean ativo;

    public Usuario(Long id, PerfilUsuario perfil, String nome, String email, String senha, Boolean ativo) {
        this.id = id;
        this.perfil = perfil;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.ativo = ativo;
    }

    public void logar(String senhaDigitada) {
        if (this.senha.equals(senhaDigitada)) {
            this.ultimoLogin = LocalDateTime.now();

            LogAuditoria log = new LogAuditoria(
                    1L,
                    this,
                    "Login realizado",
                    LocalDateTime.now(),
                    "192.168.0.1"
            );

            System.out.println("\nLogin realizado com sucesso!");
            System.out.println(log);
        } else {
            System.out.println("\nSenha incorreta!");
        }
    }

    public Sessao criarSessao() {
        String token = "TOKEN_" + System.currentTimeMillis();

        Sessao sessao = new Sessao(1L, this, token);

        System.out.println("\nSessão criada com sucesso!");
        return sessao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "\nUsuario" +
               "\nId: " + id +
               "\nPerfil: " + perfil.getDescricao() +
               "\nNome: " + nome +
               "\nEmail: " + email +
               "\nUltimo Login: " + ultimoLogin +
               "\nAtivo: " + ativo;
    }
}