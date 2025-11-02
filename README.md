# 💻 Deber de POO unidad 2

## 1. 🎯 Propósito del Sistema

Este proyecto es una **Prueba de Concepto (PoC)** que valida la aplicación práctica de los principios de la Programación Orientada a Objetos (POO) en Java. El objetivo es diseñar una arquitectura modular para el manejo y clasificación jerárquica de contenidos multimedia diversos.

### Características Clave:
* **Jerarquía de Contenido:** Utilización de una clase abstracta para la estandarización de entidades.
* **Separación de Responsabilidades:** Distribución de la lógica en múltiples clases y paquetes (`poo`, `uni1a`).
* **Modelado de Dependencias:** Implementación de Agregación y Composición para representar relaciones reales entre objetos.

***

## 2. 🧱 Arquitectura del Proyecto y Estructura Lógica

La arquitectura del sistema se basa en una jerarquía de herencia única y se organiza en dos paquetes funcionales dentro del directorio fuente (`src`).

### 2.1. Estructura de Directorios

El repositorio sigue la siguiente convención:


Poo_unidad1

    ├── poo/  
    │   └── PruebaAudioVisual.java (Módulo de Ejecución/Testing)
    └── uni1a/
        ├── ContenidoAudiovisual.java (Clase Abstracta)
        ├── Pelicula.java, SerieDeTV.java, Documental.java, Cortometraje.java, VideoYoutube.java (Entidades Principales)
        └── Actor.java, Temporada.java, Investigador.java (Módulos de Soporte)


### 2.2. Diseño de Clases (Patrones POO)

El diseño del modelo se enfoca en la extensibilidad y el encapsulamiento:

| Entidad | Principio POO Aplicado | Relación Modelada |
| :--- | :--- | :--- |
| **\`ContenidoAudiovisual\`** | **Abstracción** | Define la interfaz (`abstract void mostrarDetalles();`). |
| **\`Pelicula\`** / **\`SerieDeTV\`** | **Agregación** (Asociación Débil) | Utiliza colecciones (`List<Actor>`, `List<Temporada>`) para componentes externos. |
| **\`Documental\`** | **Composición** (Asociación Fuerte) | Dependencia estricta en el ciclo de vida del objeto \`Investigador\`. |
| **Extensión de Catálogo** | **Herencia / Polimorfismo** | Inclusión de \`Cortometraje\` y \`VideoYoutube\` sin modificar la clase base. |

***

## 3. 🚀 Guía de Instalación y Ejecución

Para clonar y ejecutar la aplicación, se requiere tener **Java Development Kit (JDK)** y **Eclipse IDE** (o cualquier IDE con soporte Git) instalados.

### Paso 1: Clonación del Repositorio

Utilice el siguiente comando en su terminal o Git Bash para obtener una copia local del proyecto:

\`\`\`bash
git clone (https://github.com/dami84579-hue/Poo_Unidad1.git)
cd Poo_unidad1
\`\`\`

### Paso 2: Configuración en el IDE

1.  En Eclipse, utilice **`File`** $\rightarrow$ **`Import...`** $\rightarrow$ **`General`** $\rightarrow$ **`Existing Projects into Workspace`** y seleccione la carpeta clonada.
2.  El proyecto se cargará automáticamente, reconociendo la estructura de paquetes **`poo`** y **`uni1a`**.

### Paso 3: Ejecución y Validación

1.  Abra la clase **\`PruebaAudioVisual.java\`** (ubicada en `src/poo/`).
2.  Ejecute la clase. La aplicación demostrará el **Polimorfismo** al iterar sobre el array de la superclase (`ContenidoAudiovisual[]`) y mostrar los detalles únicos de cada tipo de medio en la consola.

