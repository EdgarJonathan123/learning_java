# Unit Tests

## Las tres leyes del DGP

- **Primera Ley**: No debe crear codigo de produccion hasta que haya creado una prueba de unidad que falle.

- **Segunda Ley**: No debe crear mas de una prueba de unidad que baste como fallida y no compilar se considera
un fallo.

- **Tercer Ley**: No debe crear mas codigo de produccion
que el necesario para susperar la prueba de fallo actual.

---
Cuanto menos limpias sean las pruebas, menos lo sera el 
codigo. En ultima instancia perdera las pruebas y el 
codigo se corrompera.

**Estandar Dual**
Hay cosas que nunca haria en un entorno de produccion totalmente
validas para un entorno de prueba. Suelen ser **problemas de memoria
o eficacia de la CPU, pero nunca problemas de limpieza**.

### Una afirmacion por prueba
Existe una escuela de pensamiento que afirma que todas las funciones
de prueba de Junit solo deben tener una instruccion de afrimacion

He cambiado los nombres de las funciones para usar la convencion 
dado-cuando-entonces.

### F.I.R.S.T
### (Fast,Isolated/Independent,Repeatable,Self-validating,thorough)

1. **Rapidez**: Las reglas deben ser rapidas y ejecutarse de forma
rapida. Si lo hacen lentamente, no las ejecutara  con frecuencia.
Al no hacerlo, no detectara los problemas con la suficiente antelación
como para solucionarlos. No se sentira con libertad para limpiar
el codigo, que acabara corrompiéndose.

2. **Independencia**: Las pruebas no deben depender entre ellas. Una 
prueba no debe establecer condiciones para la siguiente. Debe poder
cada prueba de forma independiente y en el orden que desee. Si las
pruebas dependen unas de otras, la primera que falle provocara una
suceccion de fallos, dificultara  el diagnostico y ocultara efectos
posteriores.
3. **Repeticion**: Las pruebas deben poder repetirse en cualquier entorno.
Debe poder ejecutarlas en el entorno de produccion, en el de 
calidad y en su portatil de camino a casa en un tren sin red.
Si no puede repetir las pruebas en cualquier entorno, siempre
tendra una excusa de su fallo. Tambien vera que no puede ejecutar
las pruebas si el entorno no esta disponible.

4. **Validacion automatica**: Las pruebas no deben tener un 
resultado booleano:o aciertan o fallan. No debe tener un extenso
archivo de registro para saber si una prueba ha acertado, ni 
comparar manualmente dos archivos de texto distintos para ello.
Si las pruebas no se validan automaticamente, el fallo puede ser
subjetivo y la ejecucion de las pruebas puede requerir una 
extensa evaluacion manual.

5. **Puntualidad**: Las pruebas deben crearse en el momento preciso:
antes el codigo de produccion que hace que acierten. Si se crea las 
pruebas despues del codigo de produccion, puede que resulte dificil
probarlo. Puede decidir que parte del codigo de produccion sea demasiado 
dificil de probar. No disene codigo de produccion que no se pueda
probar.
