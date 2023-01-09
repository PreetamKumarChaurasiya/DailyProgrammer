# Create a program that will ask the users name, age, and reddit username. 
# Have it tell them the information back, in the format:
# 
# Your name is (blank), you are (blank) years old, and your username is (blank)
# 
# For extra credit, have the program log this information in a file to be accessed later.
# 

$Name = Read-Host -Prompt "Please enter your name"
$Age = Read-Host -Prompt "Please enter your age"
$Username = Read-Host -Prompt "Please enter your Reddit username"

Write-Host "Your name is $Name, you are $Age years old, and your username is $Username."

Write-Host "Name = $Name`nAge = $Age`nUsername = $Username" *> Challenge-Info.txt
