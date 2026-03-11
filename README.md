📺 Latihan PBO: Simulasi Objek TV (Pertemuan 2)
Implementasi konsep dasar Object-Oriented Programming (OOP) menggunakan bahasa Java. Program ini mensimulasikan logika operasional televisi seperti pengaturan saluran, kontrol volume, dan manajemen daya.

---

⚙️ Method
Berikut fungsionalitas yang diimplementasikan dalam class `TV.java`:

🔌 Power Control
* `turnOn()` — ✨ **Menyalakan** televisi.
* `turnOff()` — 🌑 **Mematikan** televisi.

📡 Channel Navigation
* `setChannel(int)` — 🎯 Mengatur saluran ke nomor spesifik (**1 - 120**).
* `channelUp()` — 🔼 Menaikkan saluran (+1).
* `channelDown()` — 🔽 Menurunkan saluran (-1).

🔊 Audio Management
* `setVolume(int)` — 🔉 Mengatur level volume (**1 - 7**).
* `volumeUp()` — 🔊 Menaikkan volume (+1).
* `volumeDown()` — 🔉 Menurunkan volume (-1).

---

🚀 Cara Menjalankan (Installation)

1.  Kompilasi File:
    ```bash
    javac TV.java TestTV.java
    ```

2.  Jalankan Program:
    ```bash
    java TestTV
    ```

---

📊 Preview Output
Program akan mencetak status dari dua objek TV yang dimanipulasi secara berbeda:
```text
tv1's channel is 30 and volume level is 3
tv2's channel is 3 and volume level is 2
