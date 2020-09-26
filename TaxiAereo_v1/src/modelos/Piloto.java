/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author mazer
 */
public class Piloto {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String cpf;
    private Long breve;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Long getBreve() {
        return breve;
    }

    public boolean setBreve(Long breve) {        
        if (breve.toString().length() < 10) {
            return false;
        }
        
        this.breve = breve;
        
        return true;
    }
    
    
}
