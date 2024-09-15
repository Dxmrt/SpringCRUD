Exercici CRUD amb H2

Aquest projecte és una aplicació Spring Boot que implementa un CRUD per gestionar una entitat "Fruita" utilitzant una base de dades H2 en memòria. El projecte segueix el patró MVC (Model-View-Controller) i està basat en Spring Data JPA.
Requisits

Abans de començar, assegura't de tenir instal·lat el següent:

    Java 11 o superior
    Maven o Gradle

Generació del projecte

Pots generar el projecte accedint a la pàgina de Spring Initializr amb les següents característiques:
Project Metadata

    Group: cat.itacademy.s04.t02.n01
    Artifact: S04T02N01
    Name: S04T02N01
    Description: S04T02N01GognomsNom
    Package name: cat.itacademy.s04.t02.n01
    Packaging: Jar
    Java: Mínim versió 11

Dependències

Afegeix les següents dependències:

    Spring Boot DevTools
    Spring Web
    Spring Data JPA
    H2 Database

Entitat "Fruita"

L'aplicació treballa amb una entitat anomenada Fruita que té les següents propietats:

java

public class Fruita {
    private int id;
    private String nom;
    private int quantitatQuilos;
}

Aquesta entitat serà emmagatzemada a una base de dades H2 utilitzant l'especificació JPA.
Estructura del Projecte

El projecte està organitzat seguint l'estructura de packages següent:

cat.itacademy.s04.t02.n01
├── controllers
├── model
├── services
└── repository

    controllers: Conté les classes per gestionar les sol·licituds HTTP.
    model: Conté les classes que defineixen les entitats JPA.
    services: Conté la lògica de negoci.
    repository: Conté les interfícies de persistència de dades utilitzant Spring Data JPA.

Rutes disponibles

El controlador serà capaç de gestionar les següents peticions HTTP per interactuar amb l'entitat Fruita:

    POST /fruita/add: Afegeix una nova fruita.
    PUT /fruita/update: Actualitza una fruita existent.
    DELETE /fruita/delete/{id}: Elimina una fruita pel seu ID.
    GET /fruita/getOne/{id}: Obté una fruita pel seu ID.
    GET /fruita/getAll: Obté totes les fruites.

Executar el projecte

Per executar el projecte, pots utilitzar Maven o Gradle. Per exemple, amb Maven:

bash

mvn spring-boot:run

Un cop el projecte estigui en funcionament, pots accedir a les rutes mitjançant http://localhost:8080.
Base de dades H2

L'aplicació utilitza una base de dades H2 en memòria. Pots accedir al console d'H2 a través de la següent URL:

bash

http://localhost:8080/h2-console

CRUD H2:

<a href="https://ibb.co/F5BCyFD"><img src="https://i.ibb.co/N9LbJMy/deletefruita-maduixa-id2.png" alt="deletefruita-maduixa-id2" border="0"></a>

<a href="https://ibb.co/HNXjgrF"><img src="https://i.ibb.co/M89mNR2/insertintofruita-maduixa.png" alt="insertintofruita-maduixa" border="0"></a>

<a href="https://ibb.co/ww2Ww19"><img src="https://i.ibb.co/Hx9zxQW/selectfruitaget.png" alt="selectfruitaget" border="0"></a>

<a href="https://ibb.co/T14VhyN"><img src="https://i.ibb.co/HCtWgZ9/updatepomatoplatan.png" alt="updatepomatoplatan" border="0"></a>
