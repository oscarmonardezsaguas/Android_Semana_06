Resumen claro y sencillo de qué son las Activities y los Intent explícitos e implícitos en Android:

Activity
•	Una Activity es una pantalla de una aplicación en Android.
•	Cada vez que el usuario interactúa con una parte de la app (ejemplo: formulario, lista, detalles), normalmente lo hace a través de una Activity.
•	Se puede ver como una "ventana" o "interfaz" donde el usuario realiza una acción.

Intent
Un Intent es un mensaje que permite comunicar componentes en Android (por ejemplo, abrir otra Activity, llamar a un servicio, o lanzar otra aplicación).
Existen dos tipos:
1. Intent explícito
•	Se usa cuando queremos abrir una Activity específica dentro de nuestra aplicación.
•	Se indica directamente qué clase (Activity) se debe ejecutar.
•	Ejemplo: ir desde el menú principal a la pantalla de configuración.

Ejemplo en Java:
<img width="1099" height="117" alt="image" src="https://github.com/user-attachments/assets/a8eb73bc-717e-43fd-9ea0-543399911698" />


2. Intent implícito
•	Se usa cuando queremos que Android elija qué aplicación puede realizar la acción solicitada.
•	No se indica la clase exacta, solo la acción (ver una foto, abrir un enlace, compartir texto).
•	Android muestra al usuario las apps disponibles para completar la acción.

Ejemplo en Java:
<img width="911" height="165" alt="image" src="https://github.com/user-attachments/assets/11dc9f53-5972-4222-88fd-5389179cc505" />

En resumen:
•	Activity → Pantalla de la app.
•	Intent explícito → Indica qué Activity abrir en tu app.
•	Intent implícito → Android decide qué app externa o interna puede manejar la acción.



