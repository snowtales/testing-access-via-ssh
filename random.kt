fun main() {
	var dIce = Dice()
	dIce.sides = readLine()!!.toInt()
	println(dIce.roll(dIce.sides))
}

class Dice{
	var sides = 6
	fun roll(sides : Int) : Int{
	return (1..sides).random()}
}
