## Integração Java Apache Kafka

[![Java CI with Maven](https://github.com/pauloricmarinho/kafka-java-integration/actions/workflows/maven.yml/badge.svg)](https://github.com/pauloricmarinho/kafka-java-integration/actions/workflows/maven.yml)
[![Java CI with Maven](https://github.com/pauloricmarinho/kafka-java-integration/actions/workflows/maven.yml/badge.svg)](https://github.com/pauloricmarinho/kafka-java-integration/actions/workflows/maven.yml)

> **Configuração Inicial do Ambiente Apache Kafka**

- Inicialização Apache Zookeeper

    `./zookeeper-server-start.sh ../config/zookeeper.properties`
  
- Inicialização Apache Kafka

	`./kafka-server-start.sh ../config/server.properties`

> **Nota:** Atualizar o Diretório de Geração dos Logs das Ferramentas **dataDir**.


**Comandos Básicos :**

1. Criar Tópico
2. Listar Tópicos
3. Excluir Tópico
4. Inserir Mensagens
5. Consumir Mensagens 

**Configurando o Ambiente no Docker**

- Arquivo docker compose disponível em: *resources/docker/kafka-docker-single-node.yml*
- Inicializar os Serviços do **Zookeeper** e **Kafka**


	`docker-compose -f kafka-docker-single-node.yml up -d`

-  Remover os Serviços

	`docker-compose -f kafka-single-node.yml down`

- Acessar o Terminal do Serviço do **kafka-broker**

	`docker exec -it kafka-broker /bin/bash`
	`cd /opt/bitnami/kafka/bin`


- Criar Novo Tópico  
  
        ./kafka-topics.sh \  
            --zookeeper zookeeper:2181 \  
            --create \  
            --topic MEU_TOPICO_TESTE \  
            --partitions 1 \  
            --replication-factor 1   
  
- Listando Tópicos
  
        ./kafka-topics.sh \  
            --zookeeper zookeeper:2181 \  
            --list  
  
- Detalhes dos Tópicos 
  
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

