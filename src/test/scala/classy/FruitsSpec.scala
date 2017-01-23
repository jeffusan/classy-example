package classy

import classy.Fruits.{Apple, FruityConfig}
import org.scalatest.{FlatSpec, Matchers}
import com.typesafe.config.ConfigFactory
import classy.config._
import classy.generic.auto._
import classy.core.DecodeError

/**
  * Created by jeff on 17/01/23.
  */
class FruitsSpec extends FlatSpec with Matchers {

  "A properly decoded config" should "contain two fruits" in {
    val rawConfig = ConfigFactory load
    val decoder = ConfigDecoder[FruityConfig]
    val result0: Either[DecodeError, FruityConfig] = decoder.decode(rawConfig)
    result0.isRight shouldBe true
    result0.right.get.fruits should have size 2

    val apple = result0.right.get.fruits.head.asInstanceOf[Apple]

    apple.location.city shouldBe "cadiz"
  }
}
