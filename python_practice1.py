print("My advising is on 27th Jan \n and I have to go there")
if True:  # Condition is always true  
    print("I will go to the advising center.")
    
    print("I need to carry", 6, 7, sep=", ", end="009 \n") # Custom separator and end
    print("I need to carry my ID card and my student card.")
    id_card = "ID12345" 
    print(f'My ID card number is: {id_card}')  # f-string for formatted output
    """
    They also need my age and birth certification number
    """
    age = 20
    print(f'My age is: {age}')  # f-string for formatted output
    userid = "STU67890" #naming convention is not followed
    user_id = "STU67890"  # Corrected variable name
    a = 10
    b = 20
    c = a / b # Division operation
    print("The value of c is:", c)
    
    #Use of Modulo operator
    a = 10
    b = 20
    c = b % a
    print("The value of c using modulo is:", c) #If 20 is divided by 10 the remainder is 0
    #Use of Floor Division operator
    a = 10
    b = 20
    c = b // a 
    print("The value of c using floor division is:", c)

    a = 5
    b = 3   
    if a > b:
        print("a is greater than b") #use of boolean operator (True or False)
    else:
        print("a is not greater than b") #use of boolean operator (True or False)
        c = a + b
        d = a * b
        print("The sum of a and b is:", c)
        print("The product of a and b is:", d)