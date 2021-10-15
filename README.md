## Integra��o Java Apache Kafka

> **Configura��o Inicial do Ambiente Apache Kafka**

- Inicializa��o Apache Zookeeper

    `./zookeeper-server-start.sh ../config/zookeeper.properties`
  
- Inicializa��o Apache Kafka

	`./kafka-server-start.sh ../config/server.properties`

> **Nota:** Atualizar o Diret�rio de Gera��o dos Logs das Ferramentas **dataDir**.


**Projeto :**

```mermaid
graph LR

A[Produto : Producer] -- msg --> C[Topic : kafka.topics.produtos]
B[Produto : Consumer] -- msg --> C

 ```

**Comandos B�sicos :**

1. Criar T�pico
2. Listar T�picos
3. Excluir T�pico
4. Inserir Mensagens
5. Consumir Mensagens 

**Configurando o Ambiente no Docker**

- Arquivo docker compose dispon�vel em: resources/docker/
