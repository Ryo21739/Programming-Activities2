import sys


def validator(username,password):
    defaultUsername="Mikko"
    defaultPassword="1234"

    if username==defaultUsername and password==defaultPassword:
        return "success"
    else:
        return "failed"
    

attempt=0

while attempt<5:
    print(f"Number of attempt: {attempt}")
    username=input("Enter username: ")
    password=input("Enter password: ")
    status=validator(username,password)

    if status=="success":
        print ("Login successfully!")
        sys.close(0)
    elif status=="failed":
        print("Login failed! Please try again")
        attempt+=1

if attempt==5:
    print (f"You have reached 5 attempts! Please try again")
    sys.close(0)    