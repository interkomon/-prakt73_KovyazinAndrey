fun main(){
    try{
      println("Введите 1 сторону прямоугольника")
        val a = readLine()!!.toDouble()
      println("Введите 2 сторону прямоугольника")
        val b = readLine()!!.toDouble()
        if (a < 0 ) println("Ошибка. Сторона не может быть равна нулю")
        if (b < 0) println("Ошибка. Сторона не может быть равна нулю")
        val perimitr = 2 * (a+b)
        val area = a*b
        val diagonal = Math.sqrt(a*a+b*b)
        println("Перимитр равен $perimitr")
        println("Площадь равна $area")
        println("Длина диагоннали равна $diagonal")









    }
    catch(e:Exception)
    {
        println("Ошибка. Попробуйте еще раз.")
    }
}