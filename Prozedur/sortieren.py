#Implementiere eine Prozedur "vertausche", die in einem Array die Werte an 2 idenxen vertauscht. Hierzu werden drei Parameter übergeben:
# das Array, der Index des ersten Wertes und der Index des zweiten Wertes. Die Prozedur soll nichts zurückgeben, sondern das Array direkt verändern.

def vertausche(a,i,j):     #a ist mein array :{2,8,7,5}   i=1 und j=3
    ai=a[i]               # die variable "ai" hat den wert 8
    a[i]=a[j]               # {2,5,7,5}
    a[j]=ai               # {2,5,7,8}



def sortieren(feld):
    for i in range(0,len(feld)):    
        minpos = i
        for k in range(i+1,len(feld)):
            if feld[k]<feld[minpos]:
                minpos = k
        if minpos > i:
            vertausche(feld,i,minpos)  
        print(feld)      






feld = [8,15,3,12,9,7] 
sortieren(feld)           

#Zeile         i          minpos          k       feld[k] < feld[minpos]        minpos > i      vertausche        print
#12            0
#13             0            0
#14             0            0            1
#15             0            0            1           False
#14             0            0            2
#15             0            0            2           True
#16             0            2            2
#14             0            2            3
#15             0            2            3           False
#14             0            2            4
#15             0            2            4           False
#14             0            2            5
#15             0            2            5           True
#16