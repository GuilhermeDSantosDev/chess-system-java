FROM eclipse-temurin:17

COPY . /usr/src/myapp

WORKDIR /usr/src/myapp/bin

CMD [ "java", "application/Program" ]
