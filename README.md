# Campo de batalla

Escribe una función que acepte cadenas de campo de batalla y devuelva letras que sobrevivieron al ataque nuclear.

La cadena del campo de batalla consta solo de letras minúsculas, # y corchetes. 

- El refugio nuclear está representado por corchetes. Las letras dentro de los corchetes representan letras dentro del refugio.
- El lugar donde cae una bomba se representa mediante #. 

Si cae al menos un bomba en el campo de batalla, todas las letras fuera del refugio mueren. Cuando no cae ninguna bomba en el campo de batalla, todas las letras sobreviven.

Los refugios tienen cierta resistencia. Cuando 2 o más bombas golpean directamente al refugio, el refugio se destruye y todas las letras del interior se mueren. 


## Casos
Todas las letras sobreviven porque no hay bombas
``` abde [fgh] ijk => "abdefghijk" ```

Todas las letras fuera del refugio mueren
``` ab # de [fgh] ijk => "fgh" ```

Todas las letras mueren, hay 2 bombas que golpean el refugio
```
ab # de [fgh] ij # k => ""
a ## bde [fgh] ijk => ""
```

Las letras del segundo refugio sobreviven
```
a ## bde [fgh] ijk [mn] op => "mn" 
a # bde [fgh] i # jk [mn] op => "mn" 
```