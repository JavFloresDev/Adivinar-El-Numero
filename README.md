# Adivinar el número

Juego interactivo en donde la computadora genera un número del 1 al 100 y el usuario
debe ingresar números hasta lograr adivinar en n intentos y ganar.
El jugador puede salir del programa en cualquier momento escribiendo 'salir'.

## Características

- Manejo de excepciones en ingreso de datos
- Bucle continuo para jugas varias veces,
- Opción clara para salir escribiendo `salir`

## Requisitos

- Java 11 o superior

## Tecnologías utilizadas

- Java

## Cómo ejecutar el proyecto

1. Clona el repositorio:
```bash
git clone https://github.com/JavFloresDev/Adivinar-El-Numero
```
2. Entrar a la carpeta del proyecto:
```bash
cd Adivinar-El-Numero
```
3. Compila el programa:
```bash
javac --release 11 src\AdivinaNumero.java
```
4. Ejecuta el programa: 
```bash
java -cp src AdivinaNumero
```

## Ejemplo de uso

********Adivina el número********\
ingresa el numero del (1-100) hasta ganar!\
escribe 'salir' para hacerlo.\
Generando numero...\
Numero Generado...\
Ingresar\
---> t\
Volver a intentar....\
---> 8\
es mayor\
---> 10\
es menor\
---> 9\
Ganaste!!\
Deseas volver a jugar s/n: "s"\
Generando numero...\
Numero Generado...\
Ingresar\
---> hola\
Volver a intentar....\
---> salir\
Adios...

## Estructura del proyecto

```
Adivina-El-Numero/
├── src/
│   └── AdivinaNumero.java
├── README.md
└── LICENSE
```

## Capturas de pantalla

![Calculadora en funcionamiento](images/calculadora.png)

## Autor

JavFloresDev — Jhonny Flores

## Licencia

Este proyecto está bajo la licencia MIT. Consulta el archivo LICENSE [blocked] para más detalles.
