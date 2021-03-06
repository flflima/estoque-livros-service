package com.knight.estoque.modelos;

import java.io.Serializable;
import java.util.List;

public class Livro implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 5788287581797335424L;

    private String nome;
    private List<String> autores;
    private String editora;
    private Integer anoDePublicacao;
    private String resumo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getAutores() {
        return autores;
    }

    public void setAutores(List<String> autores) {
        this.autores = autores;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Integer getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(Integer anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((anoDePublicacao == null) ? 0 : anoDePublicacao.hashCode());
        result = prime * result + ((autores == null) ? 0 : autores.hashCode());
        result = prime * result + ((editora == null) ? 0 : editora.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((resumo == null) ? 0 : resumo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (anoDePublicacao == null) {
            if (other.anoDePublicacao != null)
                return false;
        } else if (!anoDePublicacao.equals(other.anoDePublicacao))
            return false;
        if (autores == null) {
            if (other.autores != null)
                return false;
        } else if (!autores.equals(other.autores))
            return false;
        if (editora == null) {
            if (other.editora != null)
                return false;
        } else if (!editora.equals(other.editora))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (resumo == null) {
            return other.resumo == null;
        } else return resumo.equals(other.resumo);
    }

}