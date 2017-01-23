package classy

/**
  * Created by jeff on 17/01/23.
  */
object Fruits {

  sealed trait Fruit

  case class Apple(color: String, width: Int, location: Location) extends Fruit

  case class Banana(color: String, length: Int, location: Location) extends Fruit

  case class Location(city: String, country: String)

  case class FruityConfig(fruits: List[Fruit])
}
