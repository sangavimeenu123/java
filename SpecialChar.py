X=input()
c=0
for i in X:
      if(i.isnumeric()==False and i.isalpha()==False):
              c=c+1
print(c)
