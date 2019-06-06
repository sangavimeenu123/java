N=int(input())
X=0
Y=1
for i in range(0,N):
              print(Y,end=' ')
              temp=X+Y
              X=Y
              Y=temp
