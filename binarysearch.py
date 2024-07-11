import time
import random

BLACK = '\033[30m'
RED = '\033[31m'
GREEN = '\033[32m'
YELLOW = '\033[33m'
BLUE = '\033[34m'
MAGENTA = '\033[35m'
CYAN = '\033[36m'
LIGHT_GRAY = '\033[37m'
DARK_GRAY = '\033[90m'
BRIGHT_RED = '\033[91m'
BRIGHT_GREEN = '\033[92m'
BRIGHT_YELLOW = '\033[93m'
BRIGHT_BLUE = '\033[94m'
BRIGHT_MAGENTA = '\033[95m'
BRIGHT_CYAN = '\033[96m'
WHITE = '\033[97m'

RESET = '\033[0m' 

while True:
    print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + BLACK + "▀█████████▄   ▄█  ███▄▄▄▄      ▄████████    ▄████████    ▄████████    ▄████████  ▄████████    ▄█    █▄    \n  ███    ███ ███  ███▀▀▀██▄   ███    ███   ███    ███   ███    ███   ███    ███ ███    ███   ███    ███   \n  ███    ███ ███▌ ███   ███   ███    █▀    ███    █▀    ███    ███   ███    ███ ███    █▀    ███    ███   \n" + RED + " ▄███▄▄▄██▀  ███▌ ███   ███   ███         ▄███▄▄▄       ███    ███  ▄███▄▄▄▄██▀ ███         ▄███▄▄▄▄███▄▄ \n▀▀███▀▀▀██▄  ███▌ ███   ███ ▀███████████ ▀▀███▀▀▀     ▀███████████ ▀▀███▀▀▀▀▀   ███        ▀▀███▀▀▀▀███▀  \n  ███    ██▄ ███  ███   ███          ███   ███    █▄    ███    ███ ▀███████████ ███    █▄    ███    ███   \n" + YELLOW + "  ███    ███ ███  ███   ███    ▄█    ███   ███    ███   ███    ███   ███    ███ ███    ███   ███    ███   \n▄█████████▀  █▀    ▀█   █▀   ▄████████▀    ██████████   ███    █▀    ███    ███ ████████▀    ███    █▀    \n                                                                     ███    ███                           \n")
    def quickso(a):
        if len(a) < 2:
            return a
        else:
            p = a[0]
            al = []
            ar = []
            for i in range(1, len(a)):
                if a[i] < p:
                    al.append(a[i])
                else:
                    ar.append(a[i]) 
            al = quickso(al)
            ar = quickso(ar)
            return al + [p] + ar


    count = 1000
    nums = [None] * count
    for i in range(count):
            nums[i] = random.randrange(1000)
    nums = quickso(nums)

    def binsearch(a, d):
        min = 0
        max = len(a) - 1
        while min <= max:
            zw = (min + max) // 2
            if a[zw] == d: # richtige zahl gefunden 
                print(BRIGHT_GREEN + "\nDu hast die richtige Zahl " + str(d) + " aufgedeckt" + RESET)
                return zw
            elif a[zw] < d:
                min = zw + 1
            else:
                max = zw - 1
            if min == max: # falsche zahl gefunden
                print(RED + "\nDu hast die falsche Zahl " + str(zw) + " gefunden " + DARK_GRAY + "(" + str(d) + " war gesucht)" + RESET)
                return zw
            if min > max: # zahl nicht gefunden
                print(RED + "\nDie gesuchte Zahl " + str(d) + " ist nicht vorhanden" + RESET)
                return zw
            
    auswahl = int(input(WHITE + "Fortfahren: " + WHITE + "\n1: Zahl suchen " + DARK_GRAY + "\n2: sortierten Array anzeigen" + BRIGHT_BLUE + "\n"))
    print(RESET)
    match auswahl:
        case 1:
            True
        case 2:
            print(DARK_GRAY + "\n" + str(nums) + "\n" + RESET)
        case _:
            print(RED + "Invalide Eingabe..." + RESET)
            time.sleep(1)
            print(DARK_GRAY + "Fahre fort mit Zahl suchen..." + RESET)
            time.sleep(1)          
    d = int(input(WHITE + "\nWelche Zahl soll gesucht werden?\n" + BRIGHT_BLUE))
    binsearch(nums, d)
    
    time.sleep(1) 
    input(DARK_GRAY + "\nDrücke Enter um zu fortzufahren...\n")
    print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n")
    
    
    
    
    
    
    
