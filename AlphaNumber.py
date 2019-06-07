X=input()
A=0
B=0
for i in X:
    if(i.isalpha()==True):
          A=A+1
    elif(i.isdigit()==True):
          B=B+1
if(A>=1 and B>=1):
    print("Yes")
else:
    print("No")
