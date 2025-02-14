# Proyecto Final :) <3
La empresa netec requiere una implementación en microservicios para controlar el sistema de articulos y los trabajadores.
Para netec es importante el buen diseño de las  aplicaciones, porque se piensa agregar más en un futuro. Y también la carga de trabajo es variable.




## Características de microservicio articulo
El microservicio articulos debe permitir:

- El **insert** y **getall** de la entidad
- La entidad articulo debería tener los siguientes atributos:
    - **id:long**
    - **name:String**
    - **description:String**
    - **price:double**


## Características del microservicio worker
Por cuestiones de seguridad se debe proteger este microservicio porque tiene información sensible de los trabajadores de la empresa. <br>
Se debe de implementar el **insert** y **get all**

La entidad trabajador debe de tener los siguientes atributos:
- **id:long**
- **name:String**
- **position:String**
- **salary:double**

 

## Características de implementación

- Los microservicios almacenarán la información en **MySQL** (cómo el microservicio realizado en clase)

- La configuración de los microservicios debe estar externalizada usando **Spring Cloud Config**

- Usar el servicio de **descubrimiento eureka**, para el registro de los microservicios. 

- Debes de generar las imágenes de docker de tus microservicios usando **Github Actions**

- Guardar todos tus entregables en una carpeta **entregables** dentro de tu repositorio. 

## Diagrama Propuesto

![diagrama](./diagrama.png)

## Entregable

- Se debe enviar un correo a **edgardo.velasco@netec.com** con el url de tu repositorio.
> **IMPORTANTE**: **para la revisión tu repositorio este debe estar público, si no esta publico no se califica proyecto**

- Dentro de tu repositorio debes de crear una carpeta llamada **entregables** con 4 carpetas 1 llamada **producto**, otra llamada **trabajador**,  otra llamada **config** y la última **eureka**

    - En la carpeta **producto** añadir las siguientes capturas:
        - 2 capturas de pantalla una del funcionamiento del método **insert** y otra del método **getall**
    
    - En la carpeta **trabajador** añadir las siguientes capturas:
        - 1 captura de la función **ver todos los productos**
        - 1 captura de la función **insertar producto**
        

    
    - En la carpeta **config** añadir las siguientes capturas:
        - 1 captura obteniendo la configuración de **micro-product**
        - 1 captura obteniendo la configuración de **micro-worker**
    
    - En la carpeta **eureka** añadir las siguientes capturas:
        - 1 captura del **dashboard eureka** donde se muestren ambos microservicios registrados


> **IMPORTANTE**: Si falta alguna de las capturas o proyectos afecta en tu calificación final. 