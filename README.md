# demo-004-spring-boot-groovy-jpa-postgresql
Example Spring Boot Aplication using Groovy and JPA with PostgreSql running on Docker

This project contains a simple Spring Boot application with dependences to PostgreSQL running on Docker container.
For running this example, just execute these commands on terminal:
</br></br>
`$ gradle buildDocker`
</br></br>
This command will generate a hash to image docker. Copy this hash and paste replaced [hash_docker_image] on this command:
</br></br>
`$ docker run -it -p 8888:8080 [hash_docker_image] /bin/bash`
</br></br>
After this, your application is running on port 8888.
</br>
If you wanted to name the image Docker, follow this steps:</br>
![alt tag](https://docs.docker.com/engine/getstarted/tutimg/tagger.png)
