public class lazanya {



    // Lazanyanın fırında olması gereken süreyi döndüren metot
    public int expectedMinutesInOven() {
        return 40;
    }

    // Gerçek dakika sayısına göre lazanyanın fırında ne kadar daha kaldığını hesaplayan metot
    public int remainingMinutesInOven(int actualMinutesInOven) {
        int expectedMinutes = expectedMinutesInOven();
        return expectedMinutes - actualMinutesInOven;
    }

    // Katman sayısına göre lazanyanın hazırlanma süresini hesaplayan metot
    public int preparationTimeInMinutes(int layerCount) {
        // Her katmanın hazırlanması 2 dakika sürüyor
        return layerCount * 2;
    }

    // Toplam süreyi hesaplayan metot
    public int totalTimeInMinutes(int layerCount, int actualMinutesInOven) {
        int preparationTime = preparationTimeInMinutes(layerCount);
        int remainingTimeInOven = remainingMinutesInOven(actualMinutesInOven);
        return preparationTime + remainingTimeInOven;
    }

    public static void main(String[] args) {
        lazanya lazanyaCooking = new lazanya();
        int actualMinutesInOven = 25; // Örnek olarak lazanyanın 25 dakika fırında kaldığını varsayalım
        int layerCount = 4; // Örnek olarak 4 katman eklediğinizi varsayalım

        int expectedMinutes = lazanyaCooking.expectedMinutesInOven();
        int remainingMinutes = lazanyaCooking.remainingMinutesInOven(actualMinutesInOven);
        int preparationTime = lazanyaCooking.preparationTimeInMinutes(layerCount);
        int totalTime = lazanyaCooking.totalTimeInMinutes(layerCount, actualMinutesInOven);

        System.out.println("Beklenen Fırın Süresi: " + expectedMinutes + " dakika");
        System.out.println("Kalan Süre Fırın Süresi: " + remainingMinutes + " dakika");
        System.out.println("Hazırlama Süresi: " + preparationTime + " dakika");
        System.out.println("Toplam Süre: " + totalTime + " dakika");
    }
}

