# Simple Unit Converter
# Author: Mr. Selfish 😎
# Description: Console-based unit converter (km to m, kg to g)

def km_to_m(km):
    return km * 1000

def kg_to_g(kg):
    return kg * 1000

def show_menu():
    print("\n--- UNIT CONVERTER ---")
    print("1. Kilometer to Meter")
    print("2. Kilogram to Gram")
    print("3. Exit")

while True:
    show_menu()
    choice = input("Enter your choice (1-3): ")

    if choice == "1":
        km = float(input("Enter kilometers: "))
        print("Meters:", km_to_m(km))

    elif choice == "2":
        kg = float(input("Enter kilograms: "))
        print("Grams:", kg_to_g(kg))

    elif choice == "3":
        print("Goodbye! 👋")
        break

    else:
        print("Invalid choice. Try again.")
