# Trabajo de Patrones de diseño
## Integrantes:
-	Carlos Farouk Abdalá Rincón
-	César Felipe Giraldo Mora
-	Juan Diego García Escobar
## Objetivos del trabajo:
- Adquirir conocimiento sobre la implementación de patrones de diseño y principios de diseño en un contexto real.
## Caso 1:
Se enfrentó el desafío de desarrollar un sistema de procesamiento de pedidos en línea que abarcara múltiples pasos y adaptara la lógica de procesamiento según el tipo de producto. Para resolverlo, se optó por aplicar el patrón de diseño Template Method. Este patrón permitió definir una estructura general de procesamiento de pedidos con pasos comunes para todos los tipos de productos, mientras que permitía a cada tipo de producto implementar pasos específicos según sus requisitos únicos.
![UML PatronesDiseño-Template Method ~ SPPL drawio (2)](https://github.com/Farouk212022/actividad2Software/assets/88839008/57d735b3-1e2f-4d0b-895d-dd65aa9cd561)

## Caso 2:
En este escenario, se buscaba integrar un nuevo sistema de pago externo en una plataforma de comercio electrónico que tenía interfaces incompatibles. Para superar este desafío, se implementó el patrón de diseño Adapter. Este patrón posibilitó la creación de un adaptador que fungía como intermediario entre el sistema de pago incompatible y la plataforma de comercio electrónico, permitiendo una integración fluida sin cambiar la lógica interna del s
![UML PatronesDiseño-Adapter drawio](https://github.com/Farouk212022/actividad2Software/assets/88839008/60ce74d6-527c-4a56-b302-41cf68f687f8)

## Caso 3:
El objetivo en este caso era desarrollar un sistema que permitiera a los clientes crear pizzas personalizadas con ingredientes, tamaños y opciones de cobertura específicas. Para abordar esta situación, se aplicó el patrón de diseño Builder. El patrón Builder facilitó la creación paso a paso de objetos complejos, como las órdenes de pizza personalizadas, permitiendo a los clientes seleccionar tamaños, ingredientes y opciones de cobertura según sus preferencias.
![UML PatronesDiseño-Builder](https://github.com/Farouk212022/actividad2Software/assets/63802742/534ed8ff-2626-49c1-a3c4-38107440dbf2)
