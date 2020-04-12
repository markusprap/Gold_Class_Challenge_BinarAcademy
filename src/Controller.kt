class Controller(private val pilPlayer1: Player1, private val pilPlayer2: Player2,
                 private val iCallback: Main.Companion
){

    fun logic(){
        val hasil:String
        if (pilPlayer1.getPlayer1()==pilPlayer2.getPlayer2()){
            hasil = "DRAW!"
        } else if (pilPlayer1.getPlayer1()=="BATU"){
            if (pilPlayer2.getPlayer2()=="GUNTING"){
                hasil = "PEMAIN 1 MENANG!"
            } else{
                hasil = "PEMAIN 2 MENANG!"
            }
        } else if (pilPlayer1.getPlayer1()=="GUNTING"){
            if (pilPlayer2.getPlayer2()=="KERTAS"){
                hasil = "PEMAIN 1 MENANG!"
            } else {
                hasil = "PEMAIN 2 MENANG!"
            }
        } else if (pilPlayer1.getPlayer1()=="KERTAS"){
            if (pilPlayer2.getPlayer2()=="BATU"){
                hasil = "PEMAIN 1 MENANG!"
            } else {
                hasil = "PEMAIN 2 MENANG!"
            }
        } else {
            hasil = "Yang Anda input tidak sesuai!"
        }

        iCallback.showResult(hasil)

    }

}