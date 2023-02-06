fun main(){
    try{
        println("Введите объем")
        val V = readLine()!!.toDouble()
        if (V == 0.0) println("Объем не может быть равен нулю")
        if (V < 0) println("Объем не может быть меньше нуля")
        val density = 7.9
        val molarMass = 56
        val na = 6.02 * Math.pow(10.0,23.0)
        val mass = V * density
        val moles = mass / molarMass
        val atoms = moles * na
        println("Атомов в данном объеме содержится $atoms")


    }
    catch(e:Exception)
    {
        println("Ошибка. Попробуйте еще раз.")
    }


}