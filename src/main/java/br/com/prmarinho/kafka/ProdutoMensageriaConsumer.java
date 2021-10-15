package br.com.prmarinho.kafka;

import java.time.Duration;
import java.util.Arrays;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

public class ProdutoMensageriaConsumer extends ConfigProperties {

	private static KafkaConsumer<Integer, Produto> simpleConsumer;

	public static void main(String[] args) {

		simpleConsumer = new KafkaConsumer<Integer, Produto>(configurarConsumer());

		// Subscribe Topic
		simpleConsumer.subscribe(Arrays.asList(KFK_TOPIC));

		while (true) {

			// Timeout de 100 mls
			ConsumerRecords<Integer, Produto> messages = simpleConsumer.poll(Duration.ofMillis(100));

			// Print batch of records consumed
			for (ConsumerRecord<Integer, Produto> message : messages) {

				Produto p = message.value();
				System.err.println("Produto Recuperado : " + p.toString());
			}
		}

	}

}
