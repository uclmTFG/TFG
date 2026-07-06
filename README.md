<h1 align="center"> GETTW </h1>
GETTW es una herramienta de desarrollo basada en modelos diseñada para generar automáticamente editores gráficos colaborativos y multiplataforma. Esta herramienta se desarrolla sobre el marco Eclipse Epsilon y el Graphical Modelling Framework (GMF), GETTW permite a los profesores diseñar visualmente un editor de diagramas mediante una interfaz de arrastrar y soltar, y generar un editor web basado en GoJS y TogetherJS.

<h2 align=> Estructura del código fuente </h2>
A continuación, se representa la estructura del código fuente de la herramienta GETTW:

GETTW/
├── gettw/model/                         # En este directorio se encuentra los archivos que van a generar el editor GMF
│   ├── gettw.emf                        # Se diseña y desarrolla los nodos y enlaces de la paleta
│   ├── Ecore2GMF.eol                    # Organiza la paleta del GMF generado, separando los objetos y las conexiones
│   ├── FixExternalLabelMargin.egl       # Ajusta la posición del texto de una figura
│   ├── FixGMFGen.eol                    # Vincula una dependencia de puglin en las figuras para que se puedan utilizar en el editor
│   └── GeneratePathes.egx               # Ejecuta las anteriores
│
├── gettw.validation/src/gett.evl        # Se definen las reglas y restricciones para validar un modelo
|
├── Diagram/                             # Modelos de ejemplo
│   ├── FIR_signals.gettw_diagram        # Modelo de señales
│   └── UseCases.gettw_diagram           # Modelo de casos de uso
│
├── GETTW_Base/template                  # Plantillas de generación de código
│   ├── gettw_main.egx                   # Ejecuta el EGL
│   └── gettw_template.egl               # Emplea plantillas de GoJS para que sean visibles en el index.html
│
└── GETTW_Base/                          # Es la base qeb estructurada sin generar los elementos
    ├── index.html                       # Es el editor web
    ├── css/                             # Se adaptar a diferentes plataformas
        ├── gettw_desktop.css            # Escritorio
        ├── gettw_large.css              # Pantallas grandes
        ├── getww_phone.css              # Telefóno
        └── gettw_tablet.css             # Tablet
