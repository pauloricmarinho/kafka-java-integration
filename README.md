## Integração Java Apache Kafka

> **Configuração Inicial do Ambiente Apache Kafka**

- Inicialização Apache Zookeeper

    `./zookeeper-server-start.sh ../config/zookeeper.properties`
  
- Inicialização Apache Kafka

	`./kafka-server-start.sh ../config/server.properties`

> **Nota:** Atualizar o Diretório de Geração dos Logs das Ferramentas **dataDir**.


**Projeto :**

```mermaid
graph LR

A[Produto : Producer] -- msg --> C[Topic : kafka.topics.produtos]
B[Produto : Consumer] -- msg --> C

 ```

**Comandos Básicos :**

1. Criar Tópico
2. Listar Tópicos
3. Excluir Tópico
4. Inserir Mensagens
5. Consumir Mensagens 

**Configurando o Ambiente no Docker**

- Arquivo docker compose disponível em: resources/docker/
