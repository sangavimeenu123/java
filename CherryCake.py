X,Y=map(int,input().split())
D=0
Li=[]
for i in range(X):
      Li.append(input())
for i in range(X):
      for j in range(Y-1):
            if(Li[i][j]!='R' and Li[i][j+1]!='R'):
                  D+=3
            elif(Li[i][j]!='G' and Li[i][j+1]!='G'):
                  D+=5
print(D)
