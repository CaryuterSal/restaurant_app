# Sistema de Restaurante - JavaFX (MVC)

## Descripción General
Este proyecto implementa un **sistema de gestión para restaurante** desarrollado en **JavaFX** bajo el patrón de diseño **Modelo–Vista–Controlador (MVC)**.  
El sistema permite gestionar usuarios (meseros, jefe de meseros, administrador), menús, órdenes, asignación de mesas, notificaciones y reportes.

---

## Módulos del Sistema

| Módulo | Descripción |
|--------|--------------|
| **Autenticación** | Maneja login, logout y recuperación de contraseña. |
| **Usuarios** | Gestión de perfiles de meseros, jefe de meseros y administrador. |
| **Menú** | CRUD de platillos, categorías y precios. |
| **Toma de Órdenes** | Permite crear, actualizar y cerrar órdenes. |
| **Asignación de Mesas** | El jefe de meseros asigna mesas a los meseros por día. |
| **Reportes** | Genera estadísticas de ventas, desempeño y uso de mesas. |
| **Notificaciones** | Gestiona avisos entre cocina y meseros al completar pedidos. |

---

## 🏗Estructura del Proyecto (paquetes)


## ▶Ejecución

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/CaryuterSal/restaurante_app.git
   cd restaurante_app

2. Configurar conexión a base de datos en `resources/config.properties`:

````properties
db.url=jdbc:mysql://localhost:3306/restaurante
db.user=root
db.password=12345
````

3. Compilar y ejecutar con Maven:

```bash
mvn clean javafx:run
```

4. Alternativamente, desde IDE:

- Abrir el proyecto en IntelliJ IDEA o NetBeans.
- Ejecutar `Main.java`.

## Diseño y Arquitectura
- Patrón MVC para separar lógica de negocio, presentación y datos.
- Uso de DAO + Service para desacoplar persistencia y lógica.
- Interfaces como contratos entre capas para permitir simulaciones o cambios de implementación.
- JavaFX para vistas dinámicas y controladores conectados mediante FXML.