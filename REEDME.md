KATA TDD Robots Milk Cars
================
La compañía de lácteos "La Vaca Lechera" desea dar un giro tecnológico a su negocio y utilizar vehículos robots, con el objetivo de entregar leche puerta a puerta.

El ejercicio piloto desean hacerlo en Santiago tomando una porción rectangular del centro histórico con una cuadricula de referencia. Esta porción rectangular debe ser recorrida por los vehículos para que sus cámaras abordo puedan obtener una visión completa del terreno circundante y reconocer las casas donde deben realizar las distintas entregas.

La posición y orientación de un vehículo están representadas por una combinación de coordenadas **x** e **y**, además de una letra que representa uno de los cuatro puntos cardinales. Un ejemplo podría ser la posición 0, 0, N; lo que significa que el vehículo se encuentra en la esquina inferior de la cuadricula y mirando hacia el norte.

Con el fin de controlar las entregas, los lecheros pueden enviar una simple cadena de letras. Las letras posibles son **'I'**, **'D'** y **'M'**. Las letras 'I' y 'D' hacen que el vehículo gire 90 grados a la izquierda o derecha respectivamente, sin moverse de su lugar actual. En cambio la letra 'M' indica que avanzan un bloque de la cuadricula(una cuadra) manteniendo la misma dirección.

Asumamos que el cuadrante inmediatamente al Norte desde (x,y) es (x,y+1).

Entrada
-------
La primera linea de entrada contiene las coordenadas de la izquierda superior derecha de la cuadricula, las coordenadas de la esquina inferior izquierda se supone que son (0,0)
El resto de la entrada es la información relativa a los vehículos que se han desplegado. Cada vehículo tiene dos lineas de entrada. La primera linea es la posición del vehículo, la segunda linea es una serie de instrucciones que le indican como moverse en el centro histórico.
La posición se compone de dos enteros y una letra separados por espacios que corresponden a letras (x,y) coordenadas y orientación del vehículo.

Cada vehículo estará terminado secuencialmente, lo que significa que el segundo vehículo no comenzará a moverse hasta que el primero ha terminado de mover.

Salida
------
La salida de cada vehículo debe ser sus coordenadas y la dirección finales.

###Entrada de prueba####

    5 5
    1 2 N
    IMIMIMIMM
    3 3 E
    MMDMMDMDDM
    
###Salida esperada###

    1 3 NM
    5 1 E
