#Lat soal akademik

print("=== SISTEM MANAJEMEN NILAI MAHASISWA ===")

nama = input("Masukkan nama mahasiswa: ")
npm = int(input("Masukkan NPM: "))
jmlmatkul = int(input("Jumlah mata kuliah: "))

nilai_matkul = []

for i in range(jmlmatkul):
    nilai = float(input(f"Masukkan nilai mata kuliah ke-{i+1}: "))
    nilai_matkul.append(nilai)

total = sum(nilai_matkul)
rata = total / jmlmatkul

if rata >= 85:
    status = "Lulus - Predikat A"
elif rata >= 75:
    status = "Lulus - Predikat B"
elif rata >= 65:
    status = "Lulus - Predikat C"
else: 
    status = "Tidak Lulus"

print(f"\n=== HASIL NILAI ===")
print(f"NAMA            : {nama}")
print(f"NPM             : {npm}")
print(f"DAFTAR NILAI    : {nilai_matkul}")
print(f"RATA RATA       : {round(rata,2)}")
print(f"STATUS          : {status}")

print("\nProgram Selesai...")