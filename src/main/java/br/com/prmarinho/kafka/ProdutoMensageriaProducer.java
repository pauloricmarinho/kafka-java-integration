package br.com.prmarinho.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class ProdutoMensageriaProducer extends ConfigProperties {

	public static void main(String[] args) {

        //Create a Kafka producer from configuration
        KafkaProducer<Integer, Produto> simpleProducer = new KafkaProducer<Integer, Produto>(configurarProducer());

        try{
        	
            new Produto();
            
            Produto.produtos.forEach(prd -> {
            	
            	 ProducerRecord<Integer,Produto> kafkaRecord =
                          new ProducerRecord<Integer,Produto>(
                                  KFK_TOPIC,      // Topic name
                                  prd.getId(),    // Chave da Mensagem
                                  prd         	  // Mensagem
                          );
            	 
            	 System.out.println("Sending Message : "+ kafkaRecord.value());
            	 simpleProducer.send(kafkaRecord);
            	
            });

        }
        catch(Exception e) {
        	System.err.println("Erro > "+ e.getMessage());
        }
        finally {
            simpleProducer.close();
            System.err.println("- Final do Processamento -");
        }

    }
	
	
}
