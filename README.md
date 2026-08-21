# Gestión sencilla de una cafetería en Java

Aplicación sencilla en Java para gestionar tickets de una cafetería, aplicando programación orientada a objetos, herencia, interfaces, arrays, strings, estructuras condicionales, bucles y buenas prácticas de código.

## Breve descripción funcional

Es una aplicación de consola desarrollada en Java que simula las ventas en una cafetería. 
Permite crear clientes, camareros y productos (genéricos, bebidas y comidas), generar tickets de compra, aplicar 
descuentos a productos individuales y mostrar el detalle completo de cada ticket, incluyendo precio original, 
descuentos aplicados y total final.

## Requisitos para compilar y ejecutar
EL proyecto fue creado utilizando "Maven" como build system y el JDK "open jdk 25.0.2"

## Instrucciones de uso

Al ejecutar la aplicación se mostrará en la consola un menú con las siguientes opciones:

```
==== CAFETERIA ====
1. Crear cliente
2. Crear camarero
3. Crear producto
4. Crear ticket
5. Añadir productos al ticket
6. Aplicar descuento
7. Mostrar ticket
0. Salir
```

El uso típico seria el siguiente:
1. Crear cliente (opción 1) y camarero (opción 2), si no existieran, ya que serán necesarios para la creación del ticket.
2. Crear productos (opción 3) que pueden ser genéricos, bebidas o comidas.
3. Crear ticket (opción 4) seleccionando un cliente y un camarero de los creados.
4. Añadir productos (opción 5) de los creados anteriormente para incluirlos en el ticket.
5. Aplicar descuento (opción 6) si deseamos aplicar algún tipo de descuento a alguno de los productos añadidos al ticket.
6. Mostrar ticket (opción 7) para ver todos los datos de la compra, incluidos los descuento si los hubiera.
7. Salir (opción 0) para terminar el programa

## Autor
Fabián Guerrero

## Licencia
El proyecto se encuentra bajo la licencia MIT, cuyos detalles se pueden consultar en el archivo LICENSE.