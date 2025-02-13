# Escriba un programa que solicite al usuario tres números enteros y determine cuál es el mayor. Si los tres números son iguales, muestre un mensaje indicandolo.

from Apoyo import ingresar_n_enteros, mostrar_mensaje

def main():
  numeros = ingresar_n_enteros("Ingrese un numero entero",3)
  mensaje = generar_mensaje(numeros)
  mostrar_mensaje(mensaje)

def generar_mensaje(numeros):
    mensaje = ""
    if (numeros[0] == numeros[1] and numeros[2] == numeros[0]):
        mensaje = "Los numeros son igusales."
    elif (numeros[0] > numeros[1] and numeros[0] > numeros[2]):
        mensaje = "El numero " + str(numeros[0]) + " es el mayor"
    elif (numeros[1] > numeros[0] and numeros[1] > numeros[2]):
        mensaje = "El numero " + str(numeros[1]) + " es el mayor"
    else:
        mensaje = "El numero " + str(numeros[2]) + " es el mayor"
    return mensaje
main()