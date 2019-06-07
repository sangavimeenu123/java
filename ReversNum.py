X=int(input())
Y=list(map(int,input().split()))
Y.sort()
Y.reverse()
for i in range(len(Y)):
      print(Y[i],end='')
