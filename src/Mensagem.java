
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Diony
 */
public class Mensagem {

    private String emissor, texto;
    private int status;
    private LocalDateTime data;
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm dd-MM");

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

    public String getEmissor() {
        return emissor;
    }

    public String getTexto() {
        return texto;
    }

    public int getStatus() {
        return status;
    }

    public LocalDateTime getData() {
        return data;
    }

//    public DateTimeFormatter getFormato() {
//        return formato;
//    }

}
