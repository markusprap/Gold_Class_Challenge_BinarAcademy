class Main {
    companion object{
        @JvmStatic
        fun main(args : Array<String>){
            var inputMenu : String
            do {
                println("==============================")
                println("    SELAMAT DATANG DI GAME   ")
                println("   SUWIT BATU GUNTING KERTAS  ")
                println("==============================")
                println("Menu Utama : ")
                println("1. Player vs Player")
                println("2. Player vs Computer")
                println("3. Exit")
                print("Masukkan pilihan Anda : ")
                inputMenu = readLine().toString()
                when(inputMenu){
                    "1" -> {
                        do {
                            menu1()
                            println("1. Lanjut")
                            println("2. Keluar Menu Utama")
                            print("Masukkan pilihan Anda : ")
                            val inputMenu1 = readLine().toString()
                        } while (inputMenu1!="2")
                    }
                    "2" -> {
                        do {
                            menu2()
                            println("1. Lanjut")
                            println("2. Keluar Menu Utama")
                            print("Masukkan pilihan Anda : ")
                            val inputMenu2 = readLine().toString()
                        } while (inputMenu2!="2")
                    }
                    "3" -> {
                        println("Terima kasih sudah bermain ^^")
                    }
                    else -> {
                        println("Input Salah!")
                    }
                }
            }while (inputMenu!="3")



        }

        fun menu1(){
            println("===========================================")
            println("Pilihan permainan : Batu / Gunting / Kertas")
            print("Masukkan pilihan Pemain 1 : ")
            val iPlayer1 = readLine()!!.toString().toUpperCase()
            val pilihanPlayer1 = Player1(iPlayer1)
            print("Masukkan pilihan Pemain 2 : ")
            val iPlayer2 = readLine()!!.toString().toUpperCase()
            val pilihanPlayer2 = Player2(iPlayer2)
            val controller = Controller(pilihanPlayer1, pilihanPlayer2,this)
            controller.logic()

        }

        fun menu2(){
            println("===========================================")
            println("Pilihan permainan : Batu / Gunting / Kertas")
            print("Masukkan pilihan Anda (pemain 1) : ")
            val iPlayer1 = readLine()!!.toString().toUpperCase()
            val pilihanPlayer1 = Player1(iPlayer1)
            val pilihan = listOf("batu","gunting","kertas")
            val pilihanKomputer = pilihan.random().toUpperCase()
            println("Pilihan Komputer (pemain 2) : $pilihanKomputer")
            val iPlayer2 = pilihanKomputer
            val pilihanPlayer2 = Player2(iPlayer2)
            val controller = Controller(pilihanPlayer1, pilihanPlayer2,this)
            controller.logic()
        }

        fun showResult(result: String){
            println("Hasilnya : $result")
        }
    }
}