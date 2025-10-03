#pegar uma função como input para outra função. isso se chama paradigma funcional

def anunciar(f):
    def wrapper():
        print("prestes a rodar a função")
        f()##passando uma funlçao por dentro de outra
        print("acabamos a funçãp")
    return wrapper ##a gente cria a função wrapper para poder passar ela inteira como return


@anunciar ## faz com que a função abaixo funcione por dentro da função iniciar
def hello():
    print("hello")

hello()

##digamos que eu queira fazer um p´rogama que possui varias funções que so estão permetidas funcionar se o usuario estiver logado
##se eu tiver um decorator @logado, eu posso checar varias vezes sem ter que repetir codigo. sem ter codigo mesmo.