#Ordenar una lista de n números de forma ascendente.
from Apoyo import ingresar_entero, ingresar_n_enteros, mostrar_mensaje

def main():
  cantidad = ingresar_entero("cuantos numeros va a ingresar ")
  numeros = ingresar_n_enteros("Ingrese el numero ",cantidad)
  mensaje = generar_mensaje(numeros, cantidad)
  mostrar_mensaje(mensaje)

def generar_mensaje(numeros, cantidad):
  # metodo lista.sort() para organisar la lista ascendentes, 
  # lista = sorted(numeros) 
  # para guardar la organisacion de la lista en una variable
  #  metodo lista.sort(reverse=True) para organisar la lista descendente

  lista = numeros [:]

  for i in range(cantidad - 1):
        for j in range(cantidad - 1 - i):
            if lista[j] > lista[j + 1]:  # Si el elemento actual es mayor que el siguiente, intercambiamos
                lista[j], lista[j + 1] = lista[j + 1], lista[j]

  mensaje = f"los numeros ordenados ascendentemente son: {lista} " 
  return mensaje

main()