# rabbitmqclustermessageprovider
A rabbitmq message sender that publish messages to a cluster of rabbitmq running on a docker environment

rabbitmqclustermessageprovider is a simple RabbitMQ message producer for any Spring Boot applications that sends messages to a cluster of RabbitMQ nodes living on docker environment. The application relies on docker to host the RabbitMQ clusters that contains queues, vhost, configurations that can be set up and ready to go at runtime.

By relying on docker to host both the rabbitmq nodes and the spring boot application, we can apply automated creation and deployment of the RabbitMQ resources via the ```docker compose``` command. 

## Requirement and Installation

- To run the application, Docker Desktop and Docker CLI will need to be installed. 

To install docker for mac: 

```https://docs.docker.com/desktop/mac/install/```

To install docker for pc: 

```https://docs.docker.com/desktop/windows/install/```

To install docker of linux: 

```https://docs.docker.com/engine/install/```

- In addition, RabbitMQ would also needed to be installed, but we can rely on the docker to install the RabbitMQ image for us. 

To install RabbitMQ, open up your terminal and type in this command

```docker pull rabbitmq```


## Set up

- After all necessary softwars and dependencies have been installed, we will need to run our applications.

- First, we need to establish and deploy the RabbitMQ cluster on the current system. To do this, navigate to the ```script``` folder of the project and run 

```docker-compose .```

- The script will run and automatically create a cluster of 2 rabbitmq nodes running on port

```15772:15672, 5772:5672 ``` and  ``` 15872:15672, 5872:5672```

- After the script ran successfully, we turns to run the actual application. The application is also dockerize and run via docker, so we will navigate back to the main folder and run 

```docker-compose .```


## API

- POST /publish/message
    + Publish a message to the cluster. 



