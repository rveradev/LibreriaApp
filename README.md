# **Libreria App**

## **1. Descripción del Proyecto**

Este proyecto es una **aplicación nativa para Android** que simula una biblioteca online. La aplicación se centra en la implementación de una **lista de libros**. Los usuarios pueden explorar una pantalla de inicio, una lista de libros con tarjetas interactivas y una sección de créditos.


## **2. Características Principales**

  * **Barra de Navegación (`NavigationView`)**: Permite una navegación entre las diferentes vistas de la aplicación.
  * **Pantalla de Inicio**: Muestra el logo de la aplicación centrado en la pantalla.
  * **Listado de Libros**: Un **`RecyclerView`** muestra una lista dinámica de libros, cada uno representado por una tarjeta (`CardView`) con su imagen y título.
  * **Vista de Detalles del Libro**: Al hacer clic en un libro, se navega a una nueva pantalla (`Fragment`) que muestra los detalles completos del libro, incluyendo la portada, el título y una descripción.
  * **Créditos**: Una sección dedicada a mostrar los nombres de los desarrolladores del proyecto.


## **3. Cómo Ejecutar el Proyecto**

1.  **Clonar el Repositorio**: Abre una terminal y clona el repositorio de GitHub usando el siguiente comando:
    ```bash
    git clone https://github.com/rveradev/LibreriaApp.git
    ```
2.  **Abrir en Android Studio**: Inicia Android Studio y selecciona `File -> Open`. Navega hasta la carpeta del proyecto que acabas de clonar.
3.  **Configurar un Dispositivo**: Asegúrate de tener un emulador de Android configurado o un dispositivo físico conectado y con la depuración USB activada.
4.  **Ejecutar la Aplicación**: Haz clic en el botón `Run` en la barra de herramientas de Android Studio. Selecciona tu emulador o dispositivo y espera a que la aplicación se instale y se ejecute.


## **4. Decisiones Técnicas y de Diseño**

### **Estructura y Navegación**
La navegación de la aplicación se gestiona mediante el componente **Navigation Component** de Android, utilizando **fragmentos** para cada vista (`inicio`, `libros`, `detalles`, `creditos`).

### **Manejo de Datos**
Para la visualización de la lista de libros, se optó por un **`RecyclerView`** en lugar de un `ListView`. El **`RecyclerView`** se utiliza por su **eficiencia** en el uso de memoria y su capacidad de manejar listas de gran tamaño.

### **Bibliotecas y Plugins**
  * **`Navigation Component`**: Para gestionar la navegación entre fragmentos.
  * **`Safe Args`**: Un plugin de Gradle que genera código sencillo y seguro para pasar datos entre fragmentos.
  * **`Parcelize`**: Un plugin de Kotlin que simplifica la serialización de objetos, lo que hace más fácil pasar datos complejos entre componentes de Android.


## *5. Gestión del Código Fuente*

Se utilizó una estrategia de ramificación para un desarrollo colaborativo y ordenado:

* *main*: La rama principal, estable y lista para consumir.
* *develop*: La rama de desarrollo principal, donde se fusionan todas las nuevas funcionalidades.
* **feat/***: Ramas de características (feat/navbar, feat/libros, feat/creditos, etc.) para desarrollar nuevas funcionalidades de forma aislada.

## *6. Enlace al Repositorio de GitHub*

[*Enlace al repositorio de GitHub del proyecto*](https://github.com/rveradev/LibreriaApp.git)