package calculator.view

// import calculator.MainApp
import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.event.{ActionEvent, EventHandler}
import scalafx.scene.Scene
import scalafx.scene.control.{Button, TextField}
import scalafxml.core.macros.sfxml
import java.awt.event.MouseEvent

@sfxml
class CalculatorController(
    button0: Button,
    button1: Button,
    button2: Button,
    button3: Button,
    button4: Button,
    button5: Button,
    button6: Button,
    button7: Button,
    button8: Button,
    button9: Button,
    text: TextField,
    divide: Button,
    plus: Button,
    minus: Button,
    multiply: Button,
    clearDisplay: Button,
    calculate: Button
) {
  
  button0.onAction = handle {
    println("button0")
  }

  button1.onAction = handle {
    println("button1")
  }

  button2.onAction = handle {
    println("button2")
  }

  button3.onAction = handle {
    println("button3")
  }

  button4.onAction = handle {
    println("button4")
  }

  button5.onAction = handle {
    println("button5")
  }

  button6.onAction = handle {
    println("button6")
  }

  button7.onAction = handle {
    println("button7")
  }

  button8.onAction = handle {
    println("button8")
  }

  button9.onAction = handle {
    println("button9")
  }

  divide.onAction = handle {
    println("divide")
  }

  plus.onAction = handle {
    println("plus")
  }

  minus.onAction = handle {
    println("minus")
  }

  multiply.onAction = handle {
    println("multiply")
  }

  clearDisplay.onAction = handle {
    println("clearDisplay")
  }

  calculate.onAction = handle {
    println("calculate")
  }

}
