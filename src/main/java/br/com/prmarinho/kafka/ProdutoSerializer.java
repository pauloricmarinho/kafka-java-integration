package br.com.prmarinho.kafka;

import org.apache.kafka.common.serialization.Serializer;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ProdutoSerializer<T> implements Serializer<T> {

	@Override
	public byte[] serialize(String topic, T data) {
		ObjectMapper objectMapper = new ObjectMapper();
		
		 byte[] retVal = null;
		 try {
		      retVal = objectMapper.writeValueAsString(data).getBytes();
		    } catch (Exception e) {
		      e.printStackTrace();
		    }
		    return retVal;
		
	}

}
