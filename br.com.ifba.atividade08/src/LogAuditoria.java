import java.time.LocalDateTime;

public class LogAuditoria {
    
        private Long id;
        private Usuario usuario;
        private String acao;
        private LocalDateTime dataHora;
        private String ip;
        
        public LogAuditoria(Long id, Usuario usuario, String acao, LocalDateTime dataHora, String ip){
            this.id = id;
            this.usuario = usuario;
            this.acao = acao;
            this.dataHora = dataHora;
            this.ip = ip;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Usuario getUsuario() {
            return usuario;
        }

        public void setUsuario(Usuario usuario) {
            this.usuario = usuario;
        }

        public String getAcao() {
            return acao;
        }

        public void setAcao(String acao) {
            this.acao = acao;
        }

        public LocalDateTime getDataHora() {
            return dataHora;
        }

        public void setDataHora(LocalDateTime dataHora) {
            this.dataHora = dataHora;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }
        
        public String toString(){
            return "Log Auditoria" + 
                    "\nId" + id +
                    "\nUsuario" + usuario +
                    "\nAcao" + acao +
                    "\nData e hora" + dataHora + 
                    "\nIp" + ip;
        }
    }

