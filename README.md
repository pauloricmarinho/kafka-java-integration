## Integra��o Java Apache Kafka

[![Java CI with Maven](https://github.com/pauloricmarinho/kafka-java-integration/actions/workflows/maven.yml/badge.svg)](https://github.com/pauloricmarinho/kafka-java-integration/actions/workflows/maven.yml)
[![Java CI with Maven](https://github.com/pauloricmarinho/kafka-java-integration/actions/workflows/maven.yml/badge.svg)](https://github.com/pauloricmarinho/kafka-java-integration/actions/workflows/maven.yml)

> **Configura��o Inicial do Ambiente Apache Kafka**

- Inicializa��o Apache Zookeeper

    `./zookeeper-server-start.sh ../config/zookeeper.properties`
  
- Inicializa��o Apache Kafka

	`./kafka-server-start.sh ../config/server.properties`

> **Nota:** Atualizar o Diret�rio de Gera��o dos Logs das Ferramentas **dataDir**.


**Comandos B�sicos :**

1. Criar T�pico
2. Listar T�picos
3. Excluir T�pico
4. Inserir Mensagens
5. Consumir Mensagens 

**Configurando o Ambiente no Docker**

- Arquivo docker compose dispon�vel em: *resources/docker/kafka-docker-single-node.yml*
- Inicializar os Servi�os do **Zookeeper** e **Kafka**


	`docker-compose -f kafka-docker-single-node.yml up -d`

-  Remover os Servi�os

	`docker-compose -f kafka-single-node.yml down`

- Acessar o Terminal do Servi�o do **kafka-broker**

	`docker exec -it kafka-broker /bin/bash`
	`cd /opt/bitnami/kafka/bin`


- Criar Novo T�pico  
  
        ./kafka-topics.sh \  
            --zookeeper zookeeper:2181 \  
            --create \  
            --topic MEU_TOPICO_TESTE \  
            --partitions 1 \  
            --replication-factor 1   
  
- Listando T�picos
  
        ./kafka-topics.sh \  
            --zookeeper zookeeper:2181 \  
            --list  
  
- Detalhes dos T�picos 
  
        ./kafka-topics.sh \  
            --zookeeper zookeeper:2181 \  
            --describe  
  
  
- Publicando Mensagens  
  
        ./kafka-console-producer.sh \  
            --bootstrap-server localhost:29092 \  
            --topic MEU_TOPICO_TESTE  
  
- Consumindo Mensagens   
  
        ./kafka-console-consumer.sh \  
            --bootstrap-server localhost:29092 \  
            --topic MEU_TOPICO_TESTE  \  
            --from-beginning  
        
- Deletando um Topico  
  
        ./kafka-topics.sh \  
            --zookeeper zookeeper:2181 \  
            --delete \  
            --topic MEU_TOPICO_TESTE 

