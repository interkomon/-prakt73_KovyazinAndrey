fun main(){
    try{
        println("Введите число k")
        var k = readLine()!!.toInt()
        println("Введите число l")
        var l = readLine()!!.toInt()
        println("Введите число l")
        var n = readLine()!!.toInt()
        println("Введите число l")
        var m = readLine()!!.toInt()
        if (l % k == 0 && n % k == 0 && m % k == 0 ) println("Является делителем")
            else println("Не является делителем")


    }
    catch(e:Exception)
    {
        println("Ошибка. Попробуйте еще раз.")
    }

}