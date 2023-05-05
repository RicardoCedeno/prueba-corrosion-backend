# Proyecto
El proyecto está construido en spring boot, se trata de un crud que permite ingresar datos a una tabla en postgres

# Capas
El proyecto se trabajó en capas, específicamente en 4:
* model: En esta capa se creó la clase de cursos con todos sus atributos y se mapeo a postgresql usando la anotación entity
*repository: En esta capa se usó la intefaz JPArepository para usar los métodos asociados al crud. Adicionalmente, se agregaron métodos de filtrado, de los cuales, en angular solo se implemetó el filtrado por categorías de curso por cuestiones de tiempo
* Services: En esta capa se realizó la inyección de dependencia del repositorio y se implementaron los métodos para cada petición
* Controller: En esta capa se definieron las url de cada método y se realizó la inyección de dependencia del servicio.



# Pruebas
Para probar que el servicio funcionara bien se realizaron pruebas usando postman

# Demostración
En el siguiente link se deja un video de demostración de la aplicación: https://www.youtube.com/watch?v=-1fyINoBXsw
