package br.com.prmarinho.kafka;

import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;

public class ConfigProperties {

	//Propriedades Kafka
    static Properties kafkaProperties = new Properties();
    
    static final String KFK_HOST = "localhost:9092";
    static final String KFK_TOPIC = "kafka.topics.produtos";

	public static Properties configurarProducer() {
		// Brokes
    	kafkaProperties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, KFK_HOST);
       
        // Serializer class used to convert Keys to Byte Arrays
    	kafkaProperties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.IntegerSerializer");

        //Serializer class used to convert Messages to Byte Arrays
    	kafkaProperties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "br.com.prmarinho.kafka.ProdutoSerializer");

    	
		return kafkaProperties;
	}
	
	public static Properties configurarConsumer() {
		// Brokes
    	kafkaProperties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
       
    	//Deserializer class to convert Keys from Byte Array to String
    	kafkaProperties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.IntegerDeserializer");

        //Deserializer class to convert Messages from Byte Array to String
    	kafkaProperties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,"br.com.prmarinho.kafka.ProdutoDeserializer");

        //Consumer Group ID for this consumer
    	kafkaProperties.put(ConsumerConfig.GROUP_ID_CONFIG, "kafka-java-consumer");

        //Set to consume from the earliest message, on start when no offset is available in Kafka
    	kafkaProperties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,"earliest");
    	
		return kafkaProperties;
	}
	
}
