fun main(){
    try{
        println("Введите x1")
        val x1 = readLine()!!.toInt()
        println("Введите y1")
        val y1 = readLine()!!.toInt()
        println("Введите x2")
        val x2 = readLine()!!.toInt()
        println("Введите y2")
        val y2 = readLine()!!.toInt()
        println("Введите x3")
        val x3 = readLine()!!.toInt()
        println("Введите y3")
        val y3 = readLine()!!.toInt()
        println("Введите x4")
        val x4 = readLine()!!.toInt()
        println("Введите y4")
        val y4 = readLine()!!.toInt()
        val xmin = Math.max(x1,x3)
        val xmax = Math.min(x2,x4)
        val ymin = Math.max(y1,y3)
        val ymax = Math.min(y2,y4)
        val width = xmax - xmin
        val height = ymax - ymin
        val ps = width * height
        println("Площадь пересечения равна $ps")




    }
    catch(e:Exception)
    {
        println("Ошибка. Попробуйте еще раз.")
    }


}