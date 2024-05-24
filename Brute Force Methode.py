import random

# die Anzahl der Flaschen wird auf 0 festgelegt
dreiviertelFlaschen = 0
halbeFlaschen = 0
siebenzehntelFlaschen = 0

# die gesuchte Literanzahl wird festgelegt
gesamtLiter = 1898

# die Anzahl der Durchläufe wird auf 0 gesetzt
anzahlDurchlaeufe = 0

# die gefundene Lösung wird in einem String gespeichert
gefundeneLoesungen = " "
berechneteLoesung = 0
while berechneteLoesung != gesamtLiter:
 
 # die Anzahl der 3/4 Flaschen wird zufällig generiert im Bereich von 0 bis 2000
 dreiviertelFlaschen = random.randrange(2000) 
  
# die anzahl der 1/2 Flaschen wird berechnet indem man die Anzahl der 3/4 Flaschen mit 3 multipliziert, 
# die siebenzehntel Flaschen wird berechnet indem man die Anzahl der 3/4 Flaschen mit 2 multipliziert 
 halbeFlaschen = dreiviertelFlaschen*3
 siebenzehntelFlaschen = dreiviertelFlaschen*2

 # die berechnete Lösung ist die Summe der Flaschen mit den jeweiligen Literangaben , in der if Bedingung wird geprüft ob die berechnete Lösung mit den gesuchten Litern übereinstimmt
 berechneteLoesung = (dreiviertelFlaschen*0.75) + (halbeFlaschen*0.5) + (siebenzehntelFlaschen*0.7)
 if(gesamtLiter == berechneteLoesung):
   gefundeneLoesungen = ("3/4: " + str(dreiviertelFlaschen) + " 1/2: "+ str(halbeFlaschen) + " 7/10: " + str(siebenzehntelFlaschen))

# die Anzahl der Durchläufe wird um 1 erhöht
 anzahlDurchlaeufe = anzahlDurchlaeufe + 1

# die Anzahl der Durchläufe und die gefundene Lösung wird ausgegeben
print("benötigte Durchläufe: " + str(anzahlDurchlaeufe))
print("gefundene Lösung: " + gefundeneLoesungen)