def mostrar_mensaje(mensaje):
    print (mensaje)

def ingresar_texto(mensaje):
    valor = input(mensaje)
    return valor

def ingresar_real(mensaje):
    repetir = True
    while repetir:
        try:
            valor = float(input(mensaje))
            repetir = False
        except:
            print("No es una entrada válida para un número real")
    return valor

def ingresar_entero(mensaje):
    repetir = True
    while repetir:
        try:
            valor = int(input(mensaje))
            repetir = False
        except:
            print("No es una entrada válida para un número entero")
    return valor

def ingresar_real_rango(mensaje, valor_minimo,valor_maximo):
    repetir = True
    while repetir:
        valor = ingresar_real(mensaje)
        if valor < valor_minimo or valor > valor_maximo:
            print(f"El valor no está entre {valor_minimo} y {valor_maximo}")
        else:
            repetir = False
    return valor

def ingresar_entero_rango(mensaje, valor_minimo,valor_maximo):
    repetir = True
    while repetir:
        valor = ingresar_entero(mensaje)
        if valor < valor_minimo or valor > valor_maximo:
            print(f"El valor no está entre {valor_minimo} y {valor_maximo}")
        else:
            repetir = False
    return valor

def ingresar_real_mayor_que(mensaje, valor_minimo):
    repetir = True
    while repetir:
        valor = ingresar_real(mensaje)
        if valor <= valor_minimo:
            print(f"El valor no es mayor que {valor_minimo}")
        else:
            repetir = False
    return valor

def ingresar_entero_mayor_que(mensaje, valor_minimo):
    repetir = True
    while repetir:
        valor = ingresar_entero(mensaje)
        if valor <= valor_minimo:
            print(f"El valor no es mayor que {valor_minimo}")
        else:
            repetir = False
    return valor

def ingresar_n_enteros (mensaje, cantidad):
    valores = [0]*cantidad
    i= 0
    while i < cantidad:
        valores[i] = ingresar_entero (f"{mensaje} ({i+1} de {cantidad}): ")
        i += 1
    return valores
def ingresar_n_real (mensaje, cantidad):
    valores = [0]*cantidad
    i= 0
    while i < cantidad:
        valores[i] = ingresar_real(f"{mensaje} ({i+1} de {cantidad}): ")
        i += 1
    return valores
def ingresar_n_enteros_mayores_que(mensaje, cantidad,MIN_CANT):
    valores = [0]*cantidad
    for i in range(0, cantidad):
        valores[i] = ingresar_entero_mayor_que(f"{mensaje}({i+1}de{cantidad}): ",MIN_CANT)
    return valores
def ingresar_n_reales_mayores_que(mensaje, cantidad,MIN_CANT):
    valores = [0.0]*cantidad
    for i in range(0, cantidad):
        valores[i] = ingresar_real_mayor_que(f"{mensaje}({i+1}de{cantidad}): ",MIN_CANT)
    return valores

def ingresar_n_entero_rango(mensaje, cantidad, lim_inferior, lim_superior):
    valores = [0.0]*cantidad
    for i in range(0, cantidad):
        valores[i] = ingresar_entero_rango(f"{mensaje} ({i+1} de {cantidad}): ",
        lim_inferior, lim_superior)
    return valores
def ingresar_n_real_rango(mensaje, cantidad, lim_inferior, lim_superior):
    valores = [0.0]*cantidad
    for i in range(0, cantidad):
        valores[i] = ingresar_real_rango(f"{mensaje} ({i+1} de {cantidad}): ",
    lim_inferior, lim_superior)
    return valores

def ingresar_n_textos (mensaje, cantidad):
    valores = []
    for i in range(0, cantidad):
        valores.append(ingresar_texto(f"{mensaje} ({i+1} de {cantidad}): "))
    return valores
