/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pitagorasgurarapari.parcial2oo;

import com.pusher.client.PusherOptions;
import com.pusher.client.channel.Channel;
import com.pusher.rest.Pusher;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alunos
 */
public class ControleChat {
    
    private Pusher pusher;
    private Channel channel;
    com.pusher.client.Pusher pusherCliente;
    
    private static final String APP_ID ="//TODO COLOCAR ID DO SEU APP";
    private static final String KEY = "//TODO COLOCAR A SUA CHAVE";
    private static final String SECRET = "//TODO COLOCAR O SEU SEGREDO";
    
    public void inicializaPusher(){
        pusher = new Pusher(APP_ID, KEY, SECRET);
        pusher.setCluster("us2");
        pusher.setEncrypted(true);
        
        PusherOptions options = new PusherOptions();
        options.setCluster("us2");
        pusherCliente = new com.pusher.client.Pusher(KEY, options);
        channel = pusherCliente.subscribe("pitagoras-guarapari");
        //TODO CONECTAR O pusherClient para poder receber as mensagens
        
    }
    
    public void enviarMenssagem(Usuario user, String mensagem){
        Map<String,String> conteudo = new HashMap<>();
        conteudo.put("usuario", user.getNome());
        conteudo.put("mensagem", mensagem);
        //TODO FAZER O ENVIO DA MENSAGEM USANDO O OBJETO pusher
    }

    public Channel getChannel() {
        return channel;
    }
    
    
    
    
}
