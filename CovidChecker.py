loop="Yes"
while loop.lower()=="yes":
    fever=input("Do you have a fever? (yes/no): ")
    cough=input("Do you have a cough? (yes/no): ")
    breathing=input("Do you have a difficulty in breathing? (yes/no): ")

    if fever=="yes" or cough=="yes" or breathing=="yes":
        print("You may have Covid 19 symptoms. Please consult a professional healthcare.")

    else:
        print("You do not exhibit any significant Covid 19 symptoms. Staysafe!")

    loop=input("Do you want to check again? (yes/no): ")
    