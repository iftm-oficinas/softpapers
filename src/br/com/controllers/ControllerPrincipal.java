package br.com.controllers;

import br.com.models.bo.AcessoBO;

public class ControllerPrincipal {
    private AcessoBO acessoBO;
    
    public void realizarAcesso(String email, String senha){
        acessoBO.verificarUsuario(email, senha);
    }
}
