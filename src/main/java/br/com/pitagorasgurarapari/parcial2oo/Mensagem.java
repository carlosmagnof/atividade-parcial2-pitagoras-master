/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pitagorasgurarapari.parcial2oo;

/**
 *
 * @author admin
 */
public class Mensagem {
    private String mensagem;
    private String usuario;

    public Mensagem() {
    }

    public Mensagem(String mensagem, String usuario) {
        this.mensagem = mensagem;
        this.usuario = usuario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }
    
}
