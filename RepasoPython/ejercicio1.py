# Escriba un programa que pida al usuario ingresar 5 nombres y los almacene en una lista. Luego, muestre los nombres en orden inverso al que fueron ingresados.

from Apoyo import ingresar_n_textos, mostrar_mensaje

def main():
  nombres = ingresar_n_textos("Ingrese el nombre",5)
  mensaje = generar_mensaje(nombres)
  mostrar_mensaje(mensaje)

def generar_mensaje(nombres):
  mensaje = []
  for i in range(4, -1, -1):
    mensaje.append(nombres[i])
  return mensaje

main()