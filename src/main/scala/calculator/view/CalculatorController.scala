package calculator

import calculator.MainApp
import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.event.ActionEvent
import scalafx.scene.Scene
import scalafx.scene.control.{Button, TextField}
import scalafxml.core.macros.sfxml

@sfxml
class CalculatorController(
    var button0 : Button,
    var button1 : Button,
    var button2 : Button,
    var button3 : Button,
    var button4 : Button,
    var button5 : Button,
    var button6 : Button,
    var button7 : Button,
    var button8 : Button,
    var button9 : Button,

    var text : TextField,
    val divide  : Button,
    val plus : Button,
    val minus : Button,
    val multiply : Button,
    val clearDisplay : Button,
    val calculate : Button
    
){
      def clearDisplay(action : ActionEvent)={
         text.text = ""
      }
      
      def button0(action: ActionEvent)= {
        text.text = text.text.value + "0"
      }

      def button1 (action: ActionEvent)={
        text.text = text.text.value + "1"
      }

      def button2(action: ActionEvent)={
        text.text = text.text.apply + "2"
      }

      def button3(action: ActionEvent)={
        text.text = text.text.value + "3"
      }

      def button4 (action: ActionEvent)={
        text.text = text.text.value + "4"
      }

      def button5(action: ActionEvent)={
        text.text = text.text.value + "5"
      }

      def button6(action: ActionEvent)={
        text.text = text.text.value + "6"
      }

      def button7 (action: ActionEvent)={
        text.text = text.text.value + "7"
      }


      def button8(action: ActionEvent)={
        text.text = text.text.value + "8"
      }

      def button9(action: ActionEvent)={
        text.text = text.text.value + "9"
      }


      def divide (action: ActionEvent)={
        text.text = text.text.value + "/"
      }

      def multiply(action: ActionEvent)={
        text.text = text.text.value + "*"
      }

      def plus (action: ActionEvent)={
        text.text = text.text.value + "+"
      }

      def minus (action: ActionEvent)={
        text.text = text.text.value + "-"
      }
      
      def calculate (action: ActionEvent) = {
        var value = Calculator.calculate(text.text.value)
        text.text = value
}
