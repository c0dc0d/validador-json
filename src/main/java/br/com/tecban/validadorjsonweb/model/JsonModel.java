package br.com.tecban.validadorjsonweb.model;

import java.util.List;

public class JsonModel {

    private String json;
    private String tipoArquivo;
    private List<String> erros;

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public List<String> getErros() {
        return erros;
    }

    public void setErros(List<String> erros) {
        this.erros = erros;
    }

    public String getTipoArquivo() {
        return tipoArquivo;
    }

    public void setTipoArquivo(String tipoArquivo) {
        this.tipoArquivo = tipoArquivo;
    }
}
