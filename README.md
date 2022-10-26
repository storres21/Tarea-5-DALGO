# Tarea-5-DALGO
IMPORTANTE: Lea este archivo en Visual Studio Code para evitar problemas de formato

Instrucciones para ejecutar el punto 1:

1. Descargue el archivo llamado "Tarea5 Dalgo.zip"

2. Descomprima la carpeta completa

3. Cree un archivo llamado "input.txt" y guarde este en el directorio ...\Tarea-5-DALGO\Puntos 1-3\Punto_1

4. Este archivo "input.txt" contiene la matriz de entrada y este tiene el siguiente formato:

   Los números están separados por un espacio sin cambio de linea

   Los dos primeros numéros especifican el tamano de la matriz 

   Por ejemplo, el archivo "input.txt" con la entrada 3 3 0 1 8 1 0 2 8 2 0 genera la siguiente matriz de tamano 3 x 3

      0 1 8
      1 0 2
      8 2 0

5. Abra una terminal, por ejemplo, desde la lupa busque cmd para windows 

6. Ejecute el siguiente comando: cd ...\Tarea-5-DALGO\Punto_1 (la ubicacion de la carpeta)

7. Recuerde que puede probar con tres algoritmos llamados exactamente asi: Dijkstra, BellmanFord o FloydWarshall

8. Ejecute el siguiente comando: javac Dijkstra.java (si quiere probar este algoritmo)

9. Ejecute el siguiente comando: java Dijkstra

10. Esto le generara un archivo llamado "output.txt" en la carpeta ...\Tarea-5-DALGO\Punto_1. Este contiene la matriz que representa el costo de camino minimo de cada vertice a todos los otros vertices del grafo

Instrucciones para ejecutar el punto 2:

Para ejecutar este algoritmo el usuario debe seguir las siguientes instrucciones:

1. Descargue el archivo llamado "Tarea5 Dalgo.zip" y desplacelo hasta la carpeta de su preferencia.

2. Descomprima el archivo.

3. Cree una nueva carpeta (afuera de la que acabó de descomprimir), copie y pegue el archivo titulado punto2.py desde la carpeta Tarea5 Dalgo hasta la nueva carpeta que creó.

4. Entre a Visual Studio Code y abra la nueva carpeta con el archivo "punto2.py".

5. En la lupa de busqueda de su computador escriba "block de notas", abra la aplicación con este nombre y en este nuevo archivo escriba su matriz de entrada siguiendo el siguiente formato:
(Recuerde que la matriz de entrada solo debería estra compuesta de los números "1", "-1" y "0")

si su matriz es:
   | 0   1   2   3
___|______________
0  | 0   1  -1  -1 
1  | 1   0  -1  -1 
2  |-1  -1   0   1
3  |-1  -1   1   0

escriba:
0	1	-1	-1
1	0	-1	-1
-1	-1	0	1
-1	-1	1	0

(Cada uno de los valores de las columnas de cada fila van separados por solo un espacio y cada cada una de las filas no está separada por un solo enter. No es necesario que escriba el número de cada fila ni de cada columna. Es necesario que la matriz de entrada esté escrita tal como se ve en el ejemplo)

6. Guarde este archivo que acabó de crear con la matriz de entrada en la misma carpeta que creó hace unos minutos con el archivo "punto2.py"

7. Ingrese a esta carpeta y cambie el nombre del archivo de entrada a: "matrix.in"

8. Abra una terminal en su computador, para esto puede escribir en la lupa de busqueda "Simbolo del sistema" y darle click a la aplicación con este nombre.

9. En el explorador de archivos de su compurador busque la carpeta que creó con el archivo "punto2.py" y "matriz.in" y copie la ruta a esta carpeta dando click y copiando la ruta que aparece en la barra superior de la ventana en donde se ve las carpetas que ha abierto para poder llegar hasta la carpeta en donde está trabajando.

10. En la terminal copie: cd +(la ruta que acabó de copiar) y oprima "enter". Luego de esto verá que su terminal está ubicada en la carpeta que seleccionó.

11. Luego de esto escriba en la terminal python o python3 (depende de su computador, puede probar con ambas opciones) y luego punto2.py  En este punto mi terminal tendría la siguiente instrucción: C:\Users\sofit\OneDrive - Universidad de los Andes\Documentos\Uni quinto semestre\DALGO\Tareas\Tarea 5\Tarea-5-DALGO>python punto2.py

12. Siguiente a lo que escribió en la terminal en el literal 11 escriba: "< matrix.in" y presione enter.
Siguiendo estos pasos en la terminal debería aparecer la respuesta.


Instrucciones para ejecutar el punto 3:

1. Descargue el archivo llamado "Tarea5 Dalgo.zip"

2. Descomprima la carpeta completa

3. Cree un archivo llamado "input.txt" y guarde este en el directorio ...\Tarea-5-DALGO\Puntos 1-3\Punto_3

4. Este archivo "input.txt" contiene la matriz de entrada y este tiene el siguiente formato:

   Los números están separados por un espacio sin cambio de linea

   Los dos primeros numéros especifican el tamano de la matriz 

   Por ejemplo, el archivo "input.txt" con la entrada 3 3 0 1 8 1 0 2 8 2 0 genera la siguiente matriz de tamano 3 x 3

      0 1 8
      1 0 2
      8 2 0

5. Abra una terminal, por ejemplo, desde la lupa busque cmd para windows 

6. Ejecute el siguiente comando: cd ...\Tarea-5-DALGO\Punto_1 (la ubicacion de la carpeta)

7. Ejecute el siguiente comando: javac DFS.java 

8. Esto le generara un archivo llamado "output.txt" en la carpeta ...\Tarea-5-DALGO\Punto_1. Este contiene la matriz que representa el costo de camino minimo de cada vertice a todos los otros vertices del grafo
