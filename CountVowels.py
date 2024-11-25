def countVowels (String):
    count=0
    for char in String.lower():
        if char in "aeiou":
            count +=1
    return count
print (countVowels("hello"))
