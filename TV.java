public class TV {
     /* ATRIBUT
     * --------------------------------------------------------- */
    int channel = 1;      // Saluran aktif saat ini
    int volumeLevel = 1;  // Tingkat suara saat ini
    boolean on = false;   // Status power (true: nyala, false: mati)

    /* Konstruktor default untuk inisialisasi objek TV.*/
    public TV() {
    }

    /* Menyalakan televisi. */
    public void turnOn() {
        on = true;
    }

    /** Mematikan televisi. */
    public void turnOff() {
        on = false;
    }

    /*
     * Mengatur nomor saluran secara langsung.
     * newChannel No saluran yang dituju (Valid: 1 - 120).
     */
    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }
    }

    /*
     * Mengatur tingkat volume secara langsung.
     * newVolumeLevel Tingkat volume (Valid: 1 - 7).
     */
    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
            volumeLevel = newVolumeLevel;
        }
    }

    /* Menaikkan nomor saluran (+1). Berhenti di angka 120. */
    public void channelUp() {
        if (on && channel < 120) {
            channel++;
        }
    }

    /* Menurunkan nomor saluran (-1). Berhenti di angka 1. */
    public void channelDown() {
        if (on && channel > 1) {
            channel--;
        }
    }

    /* Menaikkan tingkat volume (+1). Maksimal di angka 7. */
    public void volumeUp() {
        if (on && volumeLevel < 7) {
            volumeLevel++;
        }
    }

    /* Menurunkan tingkat volume (-1). Minimal di angka 1. */
    public void volumeDown() {
        if (on && volumeLevel > 1) {
            volumeLevel--;
        }
    }
}