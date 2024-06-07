package br.com.economiaazul.service;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import br.com.economiaazul.beans.Endereco;

public class ViaCepService {

    public Endereco getContatoUsuario(String cep) throws Exception {
  
        if (cep == null || cep.isEmpty()) {
            throw new IllegalArgumentException("CEP não pode ser nulo ou vazio");
        }


        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {

            String url = "https://viacep.com.br/ws/" + cep + "/json/";
            HttpGet request = new HttpGet(url);

            HttpResponse response = httpClient.execute(request);

            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode != 200) {
                throw new RuntimeException("Falha na solicitação HTTP: Código de status " + statusCode);
            }

            String jsonResponse = EntityUtils.toString(response.getEntity());

            JsonObject jsonObject = JsonParser.parseString(jsonResponse).getAsJsonObject();

            Endereco endereco = new Endereco();
            endereco.setCep(cep);
            endereco.setLougradouro(jsonObject.get("logradouro").getAsString());
            endereco.setComplemento(jsonObject.get("complemento").getAsString());
            endereco.setBairro(jsonObject.get("bairro").getAsString());
            endereco.setLocalidade(jsonObject.get("localidade").getAsString());
            endereco.setUf(jsonObject.get("uf").getAsString());
            return endereco;
        }
    }
}