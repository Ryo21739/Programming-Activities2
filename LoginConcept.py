correctUsername="Mikko"
correctPassword="Hao"
loop=True

while loop:
    typeUsername=input("Enter Username: ")
    typePassword=input("ENter Password: ")

    if (typeUsername==correctUsername) and (typePassword==correctPassword):
        print("Login successfully")
        loop=False

    else:
        print("Login Failed. Please Try again")