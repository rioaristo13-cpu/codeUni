#kata adalah string yang ingin dicetak menjadi pola segitiga siku2
kata = input("Masukkan kata : ")
print(len(kata))
print(range(len(kata)))
#outer for loop memasukkan jumlah karakter dari variable kata dengan fungsi len dalam fungsi range
for i in range(len(kata)): 
    for j in range(i+1): #inloop dari range baris+1, print index kolum -> kata  
        print(kata[j], end="")
    print() #mencetak ke line berikut
    
for i in range(len(kata)-1,0,-1):
    for j in range(i):
        print(kata[j], end="")
    print()