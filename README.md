Nombre: **Daniel Santiago Gómez Zabala**\
**David Eduardo Valencia Cardona**\

# Preguntas AeroDescuentos
1. Los casos en los que la expeción se efectuaria serian cuando ingresen dias negativos, valores de las tarifas de los vuelos negativas, edades negativas, edades que superen cierto estandar por ejemplo 200, valores no númericos al ingresar los valores en las variables tarifasBase, diasAntelacion y edad.
2.  
    |Número|Clase de Equivalencia|Resultado|
    |------|---------------------|---------|
    |  1   |Numeros negativos    |Incorrecto|
    |  2   |Valores no numericos |Incorrecto|
    |  3   |Valores dentro del estandar de edad|correcto|
    |  4   |Valores por encima del estandar|incorrecto|
    
3. El resultado en "shouldBeIncorrectForNegativesValues" al comparlo con lo esperado debe ser incorrecto y asi mismo en "shoulBeIncorrectForAboveValue".

``` 
@Test
public void shouldBeIncorrectForNegativesValues(){
    calculoTarifa (-10, -16, -18)
}

@Test
public void shoulBeIncorrectForAboveValue(){
    calculoTraifa (15, 78, 522222)
}
```
4. 
    |Número|Clase de Equivalencia|Frontera|
    |------|---------------------|---------|
    |  1   |Numeros negativos    | x <= 0 |
    |  2   |Valores no numericos | Letras de abecedario |
    |  3   |Valores dentro del estandar de edad|x <= 200|
    |  4   |Valores por encima del estandar|x > 200|

5.  Ya estan definidos en el punto numero 3.