import tkinter as tk
from tkinter import ttk

def process():
    try:
        result = float(entry1.get()) * float(entry2.get())
        output_label.config(text=str(result))
    except ValueError:
        output_label.config(text="Invalid Input")

window = tk.Tk()
window.title("Kalkulator Muatan Listrik")

tk.Label(window, text="Arus listrik (I) =").grid(row=0, column=0)
entry1 = tk.Entry(window)
entry1.grid(row=0, column=1)

tk.Label(window, text="Waktu (t/s) =").grid(row=1, column=0)
entry2 = tk.Entry(window)
entry2.grid(row=1, column=1)

tk.Label(window, text="Muatan Listrik (Q) = ").grid(row=2, column=0)
output_label = tk.Label(window, text="", width=15)
output_label.grid(row=2, column=1)

tk.Button(window, text="Hitung", command=process).grid(row=3, column=0)
tk.Button(window, text="Keluar", command=window.destroy).grid(row=3, column=1)

window.mainloop()