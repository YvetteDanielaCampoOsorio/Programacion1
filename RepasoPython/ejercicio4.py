#Encontrar cual es el numero que mas se repite en una lista de n números.

from Apoyo import ingresar_entero, ingresar_n_enteros, mostrar_mensaje

def main():
  cantidad = ingresar_entero("cuantos numeros va a ingresar ")
  numeros = ingresar_n_enteros("Ingrese el numero ", cantidad)
  mensaje = generar_mensaje(numeros, cantidad)
  mostrar_mensaje(mensaje)

def generar_mensaje(numeros, cantidad):
  mensaje = ""
  contador = [1] * cantidad
  max_repeticiones = 1
  indice_max = 0

 # Contar repeticiones de cada numero
  for i in range (cantidad):
    for j in range ( i + 1, cantidad):
      if numeros [i] == numeros[j]:
        contador[i] += 1

# Encontrar el número con más repeticiones
  for i in range(cantidad):
    if contador[i] > max_repeticiones:
        max_repeticiones = contador[i]
        indice_max = i

  mensaje = f"El número más repetido es {numeros[indice_max]} con {max_repeticiones} repeticiones."
  return mensaje

main()

