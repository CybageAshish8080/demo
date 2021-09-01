var rate = 10.5
def earning(s:String, h:Double): String = {
  if (s == "h") {
    if (h <= 40) "Weekly paycheck is $" + h * rate
    else "Weekly paycheck is $" + (40 * rate + (h - 40) * rate * 1.5)
  }
  else "This is a salaried employee"
}
  println(earning("h", 20))
  println(earning("h", 40))
  println(earning("h", 50))
  println(earning("s", 0))

