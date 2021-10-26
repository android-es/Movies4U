
# Reporte Movies4U
A continuación, se presenta un breve reporte, correspondiente a la aplicación desarrollada en el ejercicio técnico planteado.
Se describen las funcionalidades impementadas (done), las actividades que no se logró concluir (doing) y los módulos pendientes (to do) con su respectiva propuesta.

------------

## DONE
- ##### Consumo de datos de películas populares: 
En la Activity Movies, se presenta una lista de películas populares con su respectivo título e imagen provenientes de la API.

- ##### Vista MovieDetail: 
La interfaz está lista para recibir datos de la API.

- ##### Vista Splashscreen: 
Presenta el logotipo con el nombre de la aplicación (Movies For You).

- ##### Vista MainActivity: 
Carga una Toolbar con el logotipo reducido de la aplicación (Movies4U).
Aloja un BottomNavigationView con las 3 opciones del menú (Películas, Login, Info).

- ##### Vista Login:
Pantalla que muestra una imagen circular (dependencie CircleImageView) y campos para entrada de datos.

- ##### Vista About:
Explica brevemente información de la app y sus partners (themoviedb).

------------

## DOING
- ##### Funcionalidad Playing Now: 
Sólo se desarrollaron los botones para cambiar entre Playing Now y Most Popular Movies. Dicha funcionalidad se implementará a través del método getMoviesBy(), el cual recibe el argumento "now" o "popular" para realizar la consulta solicitada y presentar las películas en el mismo RecyclerView.

- ##### Módulos:
Se hicieron pruebas unitarias de dos diferentes módulos:
1) El módulo que consulta las películas (Activity) y
2) Un proyecto que incluye la arquitectura completa.
Queda pendiente unirlos, adaptando el módulo Movies a su respectivo Fragment.

------------

## TO DO
- ##### Presentación en Grid:
Actualmente se presentan las películas de manera vertical en el RecyclerView, se adaptará para que presente CardViews en forma de Grid.

- ##### Módulo Series:
Se agregará el FragmentSeries para presentarlas por popular y now.

- ##### Módulo de reproducción de video:
Sólo está maquetado.

- ##### Autenticación de usuarios y función crear lista
Método POST.

- ##### Almacenamiento local:
Con Bitmap, ContentUris, SQLite.

------------
------------

# Splashscreen
![Splashscreen](https://user-images.githubusercontent.com/86384918/138919947-1ac98879-4051-4d4c-91b9-0d73be5e1bed.png "Splashscreen")
------------
------------

# Movie
![Movie](https://user-images.githubusercontent.com/86384918/138921081-010c76a4-c965-40fc-85fb-dc562d064d3e.png)
------------
------------

# MovieDetail
![MovieDetail](https://user-images.githubusercontent.com/86384918/138921229-b553e714-4ba9-4a4d-b57b-010c5b121bed.png)
------------
------------

# Login
![Login](https://user-images.githubusercontent.com/86384918/138921311-5ef92d26-9ff5-4bef-be13-dc4ec249d46a.png)
------------
------------

# About
![About](https://user-images.githubusercontent.com/86384918/138921382-5a9d11d6-7dac-4567-a4e4-7b1e7da9d23a.png)
