book=150
pen=10
notebook=25

totalBookCost=book*2
totalPenCost=pen*5
totalNotebookCost=notebook*3

total=totalBookCost + totalPenCost + totalNotebookCost

print(total)

if (total>350):
    discount=total*.15
    print(+discount)
    totalPayment=total-discount
    print(+totalPayment)

else:
    print("NO DISCOUNT")