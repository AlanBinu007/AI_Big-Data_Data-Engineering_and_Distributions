
# AI, KAFKA, Big-Data Data-Engineering and Distributions


## Features

- <b>Kafka</b>
- <b>Kafka</b> sending data using REST API
- Kafka Consumer and Producer
- Data Cleaning
- Data Virtualization
- Machine Learing
- Simple AI project 

## Steps to run in your machine for Kafka

#### Kafka Quick Start : https://kafka.apache.org/quickstart

```
clone the repo
```

#### Run as following to Start the Kafka
Go to your Kafka dir
```
\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

\bin\windows\kafka-server-start.bat .\config\server.properties
```
#### Run the project
Open the project in any Ide, then run as spring boot appication
```
Try Chnage your Tpoic name as you wish. Here we used "alanbinu"
```

Try the following in any API builder
```
http://localhost:8081/api/v1/message
```
Body
```
{
	"message":"It works. Thanks Alan"
}
```
To see the Data from Kafka, follow the below steps

Go to the Kafka Dir, then the run the following command
```
bin\windows\kafka-console-consumer.sh --topic <ENTER_YOUR_TOPIC_NAME> --from-beginning --bootstrap-server localhost:<KAFKA_LOCALHOST_PORT>
```
<br><br><br>
## Steps to run in your machine for  Data Virtulization, Machine Learing or Data Cleaning
```
clone the repo
```

#### Follow the steps
Install Jupyter Notebook : https://jupyter.org/install
Open Jupyter Notebook and the open the file you need to run anf then Click on the "Run from Start"


#### Hope you liked this project, dont forget to ⭐ the repo.
