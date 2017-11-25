
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mensagem implements Serializable{

    private String emissor, texto;
    private int status;
    private LocalDateTime data;
    //formata a data para o formato desejado
    private static DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm dd-MM");

    public Mensagem(String emissor, String texto, LocalDateTime data) {
        this.emissor = emissor;
        this.texto = texto;
        this.data = data;
        status = 0;
    }

    public void validarStatus() {
        status++;
    }

    public String retornarMensagem(){
        return texto+"\n("+data.format(formato)+")\n";
                
    }
//getters
    public String getEmissor() {
        return emissor;
    }

    public String getTexto() {
        return texto;
    }

    public int getStatus() {
        return status;
    }

    public String getData() {
        return data.format(formato);
    }
    @Override
    public String toString(){
    return texto+"\n("+data.format(formato)+")\n";
}

}
