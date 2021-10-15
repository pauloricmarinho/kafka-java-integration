package br.com.prmarinho.kafka;

import org.apache.kafka.common.serialization.Deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ProdutoDeserializer implements Deserializer<Produto> {

	@Override
	public Produto deserialize(String topic, byte[] data) {
		ObjectMapper mapper = new ObjectMapper();
	    Produto produto = null;
	    try {
	      produto = mapper.readValue(data, Produto.class);
	    } catch (Exception e) {

	      e.printStackTrace();
	    }
	    return produto;
	}

}
