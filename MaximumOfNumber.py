X=int(input())
Li=list(map(int,input().split()))
G=[]
H=[]
for i in range(len(Li)):
          if(i%2==0):
              G.append(Li[i])
          else:
              H.append(Li[i])
for j in G:
      T=sum(G)
for k in H:
      P=sum(H)
if(T<P):
      print(P)
else:
      print(T)
