

Start ZooKeeper service 

        zookeeper-server-start.bat config/zookeeper.properties

Start Kafka broker 

        kafka-server-start.bat config/server.properties

Read the events 

        kafka-console-consumer.bat --topic topic1 --from-beginning --bootstrap-server localhost:9092