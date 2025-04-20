import math

def calculate_primes_inefficient(n):
    primes = []
    num = 2
    while len(primes) < n:
        is_prime = True
        for i in range(2, num):
            if num % i == 0:
                is_prime = False
                break
        if is_prime:
            primes.append(num)
        num += 1
    return primes

def divide_numbers(a, b):
    resultado = a / b
    return resultado

if __name__ == "__main__":
    # Demostración de la función de primos (puede ser lenta)
    print(f"Primeros 10 primos: {calculate_primes_inefficient(10)}")

    # Demostración de la función de división
    num1 = 10
    num2 = 5
    # num2 = 0 # Descomentar esta línea para causar el Error Intencional 3
    print(f"{num1} / {num2} = {divide_numbers(num1, num2)}")

    print "Hola mundo"