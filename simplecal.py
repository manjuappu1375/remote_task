# Get user input
num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))

# Calculate and print the results
print("The sum is:", num1 + num2)
print("The difference is:", num1 - num2)
print("The product is:", num1 * num2)

# Check for division by zero
if num2 != 0:
    print("The quotient is:", num1 / num2)
else:
    print("Cannot divide by zero!")
