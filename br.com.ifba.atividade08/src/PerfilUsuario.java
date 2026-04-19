import java.util.List;

public class PerfilUsuario {
    
    private Long id;
    private String descricao;
    private List<String> permissoes;
    
    public PerfilUsuario(Long id, String descricao, List<String> permissoes){
        this.id = id;
        this.descricao = descricao;
        this.permissoes = permissoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<String> permissoes) {
        this.permissoes = permissoes;
    }
    
    @Override
    public String toString(){
        return "\nPerfilUsuario: " + 
                "nId" + id +
                "nDescricao" + descricao +
                "\nPermissoes" + permissoes;
    }
}
