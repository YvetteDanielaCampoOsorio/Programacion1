#Cree un programa que genere y muestre la tabla de multiplicar del número ingresado por el usuario, desde el 1 hasta el 10.

from Apoyo import ingresar_entero, mostrar_mensaje

def main():
  numero = ingresar_entero("Ingrese el numero")
  mensaje = generar_mensaje(numero)
  mostrar_mensaje(mensaje)

def generar_mensaje(numero):
  mensaje = []
  for i in range(1, 11):
    mensaje.append(numero * i)
  return mensaje

main()