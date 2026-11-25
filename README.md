# LAB 14 Android — App Widget con Jetpack Glance

Proyecto de Android Studio en Kotlin y Jetpack Compose. Integra un widget de pantalla de inicio con `GlanceAppWidget`, registrado en el manifiesto mediante `GlanceAppWidgetReceiver`.

## Widget incluido

El widget muestra la marca **LAB 14 · ACCESOS RÁPIDOS**, el nombre **Dante Gonzales**, una indicación breve y dos accesos directos:

- **Inicio** abre `MainActivity`.
- **Trabajo** abre `WorkActivity`, una vista independiente con la opción de volver al inicio.

Ambos destinos se conectan mediante `actionStartActivity` de Glance. La pantalla principal incluye una vista previa con los mismos dos destinos. El widget puede cambiar de tamaño horizontal y verticalmente desde el launcher.

## Diseño del widget

El diseño sigue el patrón de barra de acciones recomendado para widgets Android: identidad del laboratorio, nombre del usuario, una instrucción breve y dos acciones principales. Mantiene una jerarquía de lectura sencilla y utiliza los colores de `GlanceTheme` para integrarse con el launcher. La altura mínima de 160 dp deja espacio para el contenido y los botones.

Referencias: [Android UI Kit de widgets en Figma](https://www.figma.com/community/file/1237551184114564748/android-ui-kit) y [guías oficiales de diseño de widgets Android](https://developer.android.com/design/ui/widget).

## Probarlo en un emulador o dispositivo

1. Abre la carpeta `D:\LAB 14-ANDROID` en Android Studio y espera la sincronización de Gradle.
2. Ejecuta la configuración `app` para instalar la aplicación.
3. Regresa a la pantalla de inicio, mantén presionado un espacio vacío y abre **Widgets**.
4. Busca **Lab 14 - Glance**, arrastra el widget a la pantalla y prueba **Inicio** y **Trabajo**.

## Configuración técnica

- Glance AppWidget y las bibliotecas de interoperabilidad Material 2/3 usan la versión `1.1.0` solicitada en el laboratorio.
- El proyecto usa Kotlin `2.0.21` y el plugin oficial `org.jetbrains.kotlin.plugin.compose`; por ello no declara `kotlinCompilerExtensionVersion`, que pertenece al flujo anterior del compilador Compose.
- `simple_widget_info.xml` se encuentra en `res/xml` y apunta a `@layout/simple_widget_layout`. El layout inicial debe estar en `res/layout`, porque `android:initialLayout` referencia un recurso de tipo layout.

## Compilación

En Windows, desde esta carpeta:

```powershell
.
gradlew.bat assembleDebug
```

La última compilación local terminó correctamente con `BUILD SUCCESSFUL`.
