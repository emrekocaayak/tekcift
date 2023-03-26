fun main() {
    var tekSayilarToplam = 0
    var tekSayilarCarpim = 1
    var ciftSayilarKareToplam = 0

    for (i in 1..350) {
        if (i % 2 == 0) {
            ciftSayilarKareToplam += i * i
        } else {
            tekSayilarToplam += i
            tekSayilarCarpim *= i
        }
    }

    println("1-350 arasındaki tek sayıların toplamı: $tekSayilarToplam")
    println("1-350 arasındaki tek sayıların çarpımı: $tekSayilarCarpim")
    println("1-350 arasındaki çift sayıların karelerinin toplamı: $ciftSayilarKareToplam")
}
