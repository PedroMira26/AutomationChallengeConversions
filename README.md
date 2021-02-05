# Solución reto Conversiones
### Descripción y contexto
---
Se realiza la automatización dentro de una pagina que permita convertir tanto la longitud como la velocidad en dos escenarios de prueba distintos.

### Framework

## Gherkin
Se utiliza Gherkin como lenguaje específico de dominio para las funcionalidades dado que permite redactar de una manera simple y comprensible tanto para humanos como para ordenadores, con éste vamos a definir el comportamiento del aplicativo que vamos a automatizar.
Se trata de un lenguaje fácil de leer, entender y escribir. Utilizar Gherkin nos va a permitir crear una documentación mas clara y entendible a la hora de automatizar nuestros tests de cara al negocio.
Para hacer uso de Gherkin es necesario conocer 5 palabras solamente, con éstas se construyen las sentencias con las que se van a describir las funcionalidades:
- Feature: Indica el nombre de la funcionalidad que se probará. Debe ser un título claro y explícito. Se incluye aquí una descripción en forma de historia de usuario: “Como [rol] quiero [característica] para que [los beneficios]”. Sobre esta descripción ese empiezan a construir los escenarios de prueba.
- Scenario: Describe cada escenario que vamos a probar.
-	Given: Provee contexto para el escenario en que se va a ejecutar el test, tales como punto donde se ejecuta el test, o prerequisitos en los datos. Incluye los pasos necesarios para poner al sistema en el estado que se desea probar.
-	When: Especifica el conjunto de acciones que lanzan el test. La interacción del usuario que acciona la funcionalidad que deseamos testear.
-	Then: Especifica el resultado esperado en el test. Observamos los cambios en el sistema y vemos si son los deseados.
Lo ideal es probar distintos escenarios para comprobar una determinada funcionalidad. De esta forma vamos a pasar de nuestras historias de usuario a pruebas de comportamiento automatizables.

## Cucumber
Se utiliza cucumber como herramienta de software para automatizar las pruebas en BDD. Cucumber permite ejecutar descripciones funcionales en texto plano como pruebas de software automatizadas. Totalmente compatible con el lenguaje Gherkin.


### Herramientas de automatización utilizadas
---
Se utiliza el IDE de IntelliJ para el desarrollo de la automatización. IntelliJ es una plataforma de desarrollo, diseñada para ser extendida de forma indefinida a través de plug-ins. Fue concebida desde sus orígenes para convertirse en una plataforma de integración de herramientas de desarrollo. No tiene en mente un lenguaje específico, sino que es un IDE genérico, aunque goza de mucha popularidad entre la comunidad de desarrolladores del lenguaje Java usando el plug-in JDT que viene incluido en la distribución estándar del IDE.
Proporciona herramientas para la gestión de espacios de trabajo, escribir, desplegar, ejecutar y depurar aplicaciones.

### Navegador, herramientas y versión
---
La prueba se desarrolla en la siguiente pagina: https://www.digitaldutch.com/unitconverter

*	Se utiliza el navegador Chrome
*	Versión del navegador: Versión 88.0.4324.104
* 	Arquitectura del navegador: X64

