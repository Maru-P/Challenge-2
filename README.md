# MoniPIA

![Static Badge](https://img.shields.io/badge/java-orange?style=for-the-badge) 
![Static Badge](https://img.shields.io/badge/base--de--datos-blue?style=for-the-badge)

![Static Badge](https://img.shields.io/badge/'finalizado'-black?style=social)

## Índice

- [Descripción del proyecto](#descripción-del-proyecto)

- [Características de la aplicación y demostración](#características-de-la-aplicación-y-demostración)

- [Acceso al proyecto](#acceso-al-proyecto)

- [Tecnologías utilizadas](#tecnologías-utilizadas)

- [Conclusión](#conclusión)

# Descripción del proyecto

**MoniPIA** es un convertidor de monedas basado en lenguaje **Java** en el que se utilizaron distintas librerias para su funcionamiento y para tener una conversión más precisa se utilizo la API de [ExchangeRate API](https://www.exchangerate-api.com), es parte de la formación de Java y Spring Framework de [AluraLATAM](https://www.aluracursos.com) de la cual formo parte en el grupo **G7-ONE**.

# Características de la aplicación y demostración

**MoniPIA** es una aplicación que contiene una lista de monedas y la conversión disponible para cada una de ellas, permite al usario escoger una opción, ingresar el valor deseado y mostrar el resultado en la consola.

A continuación se dara un pequeño recorrido a la interfaz de MoniPIA:
  - ***lib***: Es la carpeta que contiene la libreria de [Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson), que permite la recepción y transformación de datos json.
  -  ***src***:
      - ***conversor***:
        
          -***CambioDeMoneda***: Record que recibe los datos utilizados del json.
        
          -***Conversor***:  Clase con un método **convierte** que recibe tres parametros (moneda1, moneda2, y monto) para convertir una cantidad de una moneda a otra utilizando la API. Se utilizan librerias de HTTP (HttpClient, HttpRequest, HttpResponse) y URI.
        
      - ***principal***:
        
          -***Moneda***: Super Clase que contiene los atributos de la aplicación, implementa un contructor que usa los datos de **CambioDeMoneda** para realizar la conversión con los datos de Moneda. Y devuelve una cadena con los resultados.
        
          -***MoniPIA***: Contiene el menú interactivo con el usario en el que permite ingreso de enteros para elegir una opción e ingresar el monto a convertir según la opción anterior.

# Acceso al proyecto
  + Para acceder al proyecto, descargue el archivo completo:

  + Y luego acceda a la carpeta ***principal***-->***MoniPIA***:
