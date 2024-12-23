# **Chat System - Patrón Mediator**
**by NahuLemes**

---

Sistema de chat que demuestra la implementación del **patrón Mediator**, un patrón de diseño conductual que centraliza la interacción entre múltiples objetos, haciendo el sistema más modular y fácil de mantener.

---

## **Descripción**

Este proyecto es un sistema de chat donde los usuarios interactúan a través de un **mediador central**, siguiendo el patrón de diseño **Mediator**. El Mediador actúa como intermediario entre los usuarios, distribuyendo los mensajes de manera eficiente y desacoplada.

---

## **Arquitectura**

El sistema está dividido en las siguientes capas:

- **Mediator**:
  - `IChatMediator`: Define la interfaz del mediador.
  - `ChatMediator`: Implementa la lógica para gestionar los usuarios y distribuir mensajes.

- **Colleagues**:
  - `User`: Clase abstracta que define la estructura básica de un usuario.
  - `ChatUser`: Implementación concreta de un usuario del chat.

- **Aplicación**:
  - `ChatApplication`: Gestiona la interacción entre los usuarios.

-**Controlador**
  - `ChatController`: Inicializa el sistema, registra los usuarios y controla el flujo del chat.

---

## **Diagrama de Clases**

```
               +--------------------+
               |    IChatMediator   |
               +--------------------+
               | + sendMessage()    |
               | + addUser()        |
               +--------------------+
                         ^
                         |
          +------------------------+
          |       ChatMediator      |
          +------------------------+
          | + users (List<User>)   |
          | + sendMessage()        |
          | + addUser()            |
          +------------------------+
                         ^
                         |
       +---------------------------+
       |           User            |
       +---------------------------+
       | - mediator: IChatMediator |
       | - name: String            |
       | + send()                  |
       | + receive()               |
       +---------------------------+
                         ^
                         |
       +---------------------------+
       |        ChatUser           |
       +---------------------------+
```

---

## **Tecnologías Usadas**

- **Java**: Lenguaje de programación principal.
- **Java Streams**: Para optimizar la lógica de distribución de mensajes.
- **IDE**: IntelliJ IDEA.

---

## **Cómo Funciona**

1. **Inicialización**:
   - `ChatController` crea un `ChatMediator` y registra a los usuarios en él.
   
2. **Interacción**:
   - Los usuarios envían mensajes al mediador usando el método `sendMessage`.
   - El mediador distribuye el mensaje a todos los demás usuarios registrados.

3. **Desacoplamiento**:
   - Los usuarios no interactúan directamente entre sí; solo conocen al mediador.

---

## **Ejemplo de Ejecución**

```
Nahuel, escribe tu mensaje:
> Hola a todos!
Nahuel envía: Hola a todos!
Lucía recibe de Nahuel: Hola a todos!
Carlos recibe de Nahuel: Hola a todos!

Lucía, escribe tu mensaje:
> Hola Nahuel, ¿cómo estás?
Lucía envía: Hola Nahuel, ¿cómo estás?
Nahuel recibe de Lucía: Hola Nahuel, ¿cómo estás?
Carlos recibe de Lucía: Hola Nahuel, ¿cómo estás?

Carlos, escribe tu mensaje:
> ¡Todo bien, gracias!
Carlos envía: ¡Todo bien, gracias!
Nahuel recibe de Carlos: ¡Todo bien, gracias!
Lucía recibe de Carlos: ¡Todo bien, gracias!
```


