# Create a program that will ask the users name, age, and reddit username. 
# Have it tell them the information back, in the format:
# 
# Your name is (blank), you are (blank) years old, and your username is (blank)
# 
# For extra credit, have the program log this information in a file to be accessed later.
# 

name = input("What is your name? ")
age = input("How old are you? ")
reddit = input("What is your reddit username? ")

print("Your name is " + name + ", you are " + age + " years old, and your username is " + reddit)

f = open('data', 'w')
f.write("name = " + name + "\n")
f.write("age = " + age + "\n")
f.write("reddit = " + reddit + "\n")
f.close()
